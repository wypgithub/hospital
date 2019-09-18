package com.example.hospital.service;

import com.example.hospital.dao.ChargesDao;
import com.example.hospital.dao.RegistrationRecordDao;
import com.example.hospital.po.*;
import com.example.hospital.vo.RegistrationVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class RegistrationServiceImpl implements RegistrationService {

    @Resource
    private ChargesDao chargesDao;
    @Resource
    private RegistrationRecordDao registrationRecordDao;


    @Override
    public Patient checkRegistrationNum(Integer medicalRecordNum) {
        return registrationRecordDao.findByMedicalRecordNum(medicalRecordNum);
    }

    @Override
    public List<RegLevel> findAllRegLevel() {
        return registrationRecordDao.findAllRegLevel();
    }

    @Override
    public Object[] findDepartmentAndUser() {
        return new Object[]{registrationRecordDao.findAllDepartment(),registrationRecordDao.findAllDoctor()};
    }

    @Override
    public void saveRegistrationRecord(RegistrationVO registrationVO) {
        Patient patient = registrationVO.getPatient();
        RegistrationRecord record = registrationVO.getRecord();
        PaymentRefundRecord refundRecord = registrationVO.getRefundRecord();

        if (patient != null){
            registrationRecordDao.savePatient(patient);

            record.setRegStatus("1");
            record.setMedicalRecordNum(patient.getMedicalRecordNum());
        }else {
            record.setRegStatus("0");
        }

        //保存挂号
        registrationRecordDao.saveRegistrationRecord(record);

        //保存发票
        InvoiceRecord invoiceRecord = new InvoiceRecord();
        invoiceRecord.setTotalAmo(String.valueOf(registrationVO.getRefundRecord().getTotalAmount()));
        invoiceRecord.setInvoiceStatus("1");
        invoiceRecord.setDailyStatementStatus("1");
        chargesDao.saveInvoiceRecord(invoiceRecord);

        //保存收退费
        refundRecord.setRegId(record.getRegId());
        refundRecord.setInvoiceNum(invoiceRecord.getInvoiceNum());
        refundRecord.setChargeItemId(String.valueOf(record.getRegId()));
        refundRecord.setCostTime(new Date());
        chargesDao.savePaymentRefundRecord(refundRecord);
    }



}
