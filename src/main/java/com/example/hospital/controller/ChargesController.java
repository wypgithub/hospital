package com.example.hospital.controller;

import com.example.hospital.po.Patient;
import com.example.hospital.po.PaymentRefundRecord;
import com.example.hospital.service.ChargesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Description:收费Controller
 * date: 2019/9/16 0016
 * @author WYP
 */
@Controller
public class ChargesController extends BaseController{
    @Resource
    private ChargesService chargesService;


    @ResponseBody
    @RequestMapping("/findPatientAndDrug")
    public Map findPatientAndDrug(Integer medicalRecordNum) {
        return chargesService.findPatientAndDrug(medicalRecordNum);
    }

    @ResponseBody
    @RequestMapping("/charge")
    public void charge(@RequestBody PaymentRefundRecord refundRecord) {
        refundRecord.setUserId(getCurrentUser().getUserId());
        chargesService.charge(refundRecord);
    }

}
