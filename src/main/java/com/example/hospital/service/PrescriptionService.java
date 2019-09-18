package com.example.hospital.service;

import com.example.hospital.po.Drug;
import com.example.hospital.vo.MedicalRecordVO;
import com.example.hospital.vo.PrescriptionVO;

import java.util.List;

/**
 * Description:开立处方Service
 * date: 2019/9/17 0017
 * @author WYP
 */
public interface PrescriptionService {
    /**
     * 查询患者信息和病历
     * @param medicalRecordNum 病历号
     * @return
     */
    MedicalRecordVO findMedicalRecord(Integer medicalRecordNum);

    List<Drug> findAllDrugList();

    void saveMedicinePrescription(PrescriptionVO prescription);
}
