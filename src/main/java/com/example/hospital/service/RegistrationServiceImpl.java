package com.example.hospital.service;

import com.example.hospital.dao.RegistrationRecordDao;
import com.example.hospital.po.Department;
import com.example.hospital.po.Patient;
import com.example.hospital.po.RegLevel;
import com.example.hospital.po.RegistrationRecord;
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

        if (patient != null){
            registrationRecordDao.savePatient(patient);

            record.setRegStatus("1");
            record.setMedicalRecordNum(patient.getMedicalRecordNum());
        }else {
            record.setRegStatus("0");
        }

        registrationRecordDao.saveRegistrationRecord(record);
    }



}
