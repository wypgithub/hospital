package com.example.hospital.controller;

import com.example.hospital.po.MedicalRecord;
import com.example.hospital.po.Patient;
import com.example.hospital.service.ConsultationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Description:诊病Controller
 * date: 2019/9/17 0017
 * @author WYP
 */
@Controller
public class ConsultationController extends BaseController{

    @Resource
    private ConsultationService consultationService;

    @ResponseBody
    @RequestMapping("/findPatients")
    public Map findWaitingPatients() {
        return consultationService.findPatients(getCurrentUser().getUserId());
    }

    @ResponseBody
    @RequestMapping("/saveMedicalRecord")
    public void saveMedicalRecord(@RequestBody MedicalRecord medicalRecord) {
        consultationService.saveMedicalRecord(medicalRecord);
    }


}
