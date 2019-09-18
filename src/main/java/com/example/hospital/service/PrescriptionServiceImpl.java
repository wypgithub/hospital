package com.example.hospital.service;

import com.example.hospital.dao.ChargesDao;
import com.example.hospital.dao.PrescriptionDao;
import com.example.hospital.po.Drug;
import com.example.hospital.po.MedicinePrescription;
import com.example.hospital.po.MedicinePrescriptionDetail;
import com.example.hospital.vo.MedicalRecordVO;
import com.example.hospital.vo.PrescriptionVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Description: 开立处方Service实现
 * date: 2019/9/17 0017
 * @author WYP
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class PrescriptionServiceImpl implements PrescriptionService {

    @Resource
    private ChargesDao chargesDao;
    @Resource
    private PrescriptionDao prescriptionDao;

    @Override
    public MedicalRecordVO findMedicalRecord(Integer medicalRecordNum) {
        return prescriptionDao.findMedicalRecord(medicalRecordNum);
    }

    @Override
    public List<Drug> findAllDrugList() {
        return prescriptionDao.findAllDrugList();
    }

    @Override
    public void saveMedicinePrescription(PrescriptionVO prescription) {
        MedicinePrescription medicinePrescription = prescription.getMedicinePrescription();
        List<MedicinePrescriptionDetail> medicinePrescriptionDetail = prescription.getMedicinePrescriptionDetail();

        medicinePrescription.setCreateTime(new Date());
        medicinePrescription.setRegId(chargesDao.findRegId(medicinePrescription.getMedicalRecordNum()));
        prescriptionDao.saveMedicinePrescription(medicinePrescription);

        for(MedicinePrescriptionDetail detail : medicinePrescriptionDetail){
            detail.setmPreId(medicinePrescription.getmPreId());
            prescriptionDao.saveMedicinePrescriptionDetail(detail);
        }
    }


}
