package com.example.hospital.service;

import com.example.hospital.dao.ChargesDao;
import com.example.hospital.dao.ConsultationDao;
import com.example.hospital.po.MedicalRecord;
import com.example.hospital.po.Patient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: 诊病Service实现
 * date: 2019/9/17 0017
 * @author WYP
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ConsultationServiceImpl implements ConsultationService {

    @Resource
    private ChargesDao chargesDao;
    @Resource
    private ConsultationDao consultationDao;

    @Override
    public Map findPatients( Integer docId) {
        Map<String, List<Patient>> map = new HashMap<String, List<Patient>>();

        map.put("waitPatient", consultationDao.findPatient("0", docId));
        map.put("finishPatient", consultationDao.findPatient("1", docId));

        return map;
    }

    @Override
    public void saveMedicalRecord(MedicalRecord medicalRecord) {
        consultationDao.updateRegStatus(medicalRecord.getMedicalRecordNum());

        medicalRecord.setRegId( chargesDao.findRegId(medicalRecord.getMedicalRecordNum()));
        consultationDao.saveMedicalRecord(medicalRecord);
    }


}
