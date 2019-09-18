package com.example.hospital.service;

import com.example.hospital.dao.ChargesDao;
import com.example.hospital.dao.RegistrationRecordDao;
import com.example.hospital.po.InvoiceRecord;
import com.example.hospital.po.Patient;
import com.example.hospital.po.PaymentRefundRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:收费Service实现
 * date: 2019/9/16 0016
 * @author WYP
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ChargesServiceImpl implements ChargesService {

    @Resource
    private ChargesDao chargesDao;
    @Resource
    RegistrationRecordDao registrationRecordDao;


    @Override
    public Map findPatientAndDrug(Integer medicalRecordNum) {
        Map map = new HashMap();
        map.put("patient", registrationRecordDao.findByMedicalRecordNum(medicalRecordNum));
        map.put("drugList", chargesDao.findDrugList(medicalRecordNum));

        return map;
    }

    @Override
    public void charge(PaymentRefundRecord refundRecord) {
        refundRecord.setRegId( chargesDao.findRegId( refundRecord.getMedicalRecordNum()));
        refundRecord.setCostTime(new Date());

        InvoiceRecord invoiceRecord = new InvoiceRecord();
        invoiceRecord.setTotalAmo(String.valueOf(refundRecord.getTotalAmount()));
        invoiceRecord.setInvoiceStatus("1");
        invoiceRecord.setDailyStatementStatus("1");
        chargesDao.saveInvoiceRecord(invoiceRecord);

        refundRecord.setInvoiceNum(invoiceRecord.getInvoiceNum());
        chargesDao.savePaymentRefundRecord(refundRecord);
    }
}
