package com.example.hospital.controller;

import com.example.hospital.po.Department;
import com.example.hospital.po.Patient;
import com.example.hospital.po.RegLevel;
import com.example.hospital.po.RegistrationRecord;
import com.example.hospital.service.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class RegistrationController extends BaseController{

    @Resource
    private RegistrationService registrationService;


    @ResponseBody
    @RequestMapping("/checkRegistrationNum")
    public Patient checkRegistrationNum(Integer medicalRecordNum) {
        return registrationService.checkRegistrationNum(medicalRecordNum);
    }

    @ResponseBody
    @RequestMapping("/findAllRegLevel")
    public List<RegLevel> findAllRegLevel(Integer medicalRecordNum) {
        return registrationService.findAllRegLevel();
    }


    @ResponseBody
    @RequestMapping("/findAllDepartment")
    public Object[] findAllDepartment() {
        return registrationService.findDepartmentAndUser();
    }

    @ResponseBody
    @RequestMapping("/saveRegistrationRecord")
    public void saveRegistrationRecord(@RequestBody RegistrationRecord record) {
        record.setRegStaffId(getCurrentUser().getUserId());
        registrationService.saveRegistrationRecord(record);
    }
}
