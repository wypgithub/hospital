package com.example.hospital.service;

import com.example.hospital.dao.RegistrationRecordDao;
import com.example.hospital.po.Department;
import com.example.hospital.po.Patient;
import com.example.hospital.po.RegLevel;
import com.example.hospital.po.RegistrationRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

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
    public void saveRegistrationRecord(RegistrationRecord record) {
        record.setRegDate(new Date());

        Patient patient = registrationRecordDao.findByMedicalRecordNum(record.getMedicalRecordNum());
        if (patient == null){
            record.setRegStatus("0");

            registrationRecordDao.savePatient(patient);

        }else {
            record.setRegStatus("1");
        }

        registrationRecordDao.saveRegistrationRecord(record);
    }


}
