package com.example.hospital.controller;

import com.example.hospital.dao.PrescriptionDao;
import com.example.hospital.po.Drug;
import com.example.hospital.service.PrescriptionService;
import com.example.hospital.vo.MedicalRecordVO;
import com.example.hospital.vo.PrescriptionVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Description: 开立处方Controller
 * date: 2019/9/17 0017
 * @author WYP
 */
@Controller
public class PrescriptionController extends BaseController{
    @Resource
    private PrescriptionService prescriptionService;


    @ResponseBody
    @RequestMapping("/findMedicalRecord")
    public MedicalRecordVO findPatientAndDrug(Integer medicalRecordNum) {
        return prescriptionService.findMedicalRecord(medicalRecordNum);
    }


    @ResponseBody
    @RequestMapping("/findDrugList")
    public List<Drug> findDrugList() {
        return prescriptionService.findAllDrugList();
    }


    @ResponseBody
    @RequestMapping("/saveMedicinePrescription")
    public void saveMedicinePrescription(@RequestBody PrescriptionVO prescription) {
        prescription.getMedicinePrescription().setDocId(getCurrentUser().getUserId());
        prescriptionService.saveMedicinePrescription(prescription);
    }



}
