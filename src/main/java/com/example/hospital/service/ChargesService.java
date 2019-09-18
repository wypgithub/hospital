package com.example.hospital.service;

import com.example.hospital.po.PaymentRefundRecord;

import java.util.Map;

/**
 * Description:收费Service
 * date: 2019/9/16 0016
 * @author WYP
 */
public interface ChargesService {
    /**
     * 根据病历号查询患者信息和药品列表
     * @param medicalRecordNum 病历号
     */
    Map findPatientAndDrug(Integer medicalRecordNum);



    void charge(PaymentRefundRecord refundRecord);

}
