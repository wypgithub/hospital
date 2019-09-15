package com.example.hospital.service;

import com.example.hospital.po.Patient;
import com.example.hospital.po.RegLevel;
import com.example.hospital.po.RegistrationRecord;

import java.util.List;

public interface RegistrationService {

    Patient checkRegistrationNum(Integer medicalRecordNum);


    List<RegLevel> findAllRegLevel();

    Object[] findDepartmentAndUser();

    void saveRegistrationRecord(RegistrationRecord record);
}
