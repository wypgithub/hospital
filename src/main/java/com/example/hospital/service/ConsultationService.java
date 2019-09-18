package com.example.hospital.service;

import com.example.hospital.po.MedicalRecord;
import java.util.Map;

/**
 * Description:诊病Service
 * date: 2019/9/17 0017
 * @author WYP
 */
public interface ConsultationService {
    Map findPatients(Integer docId);

    void saveMedicalRecord(MedicalRecord medicalRecord);
}
