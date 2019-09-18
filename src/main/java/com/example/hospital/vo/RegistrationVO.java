package com.example.hospital.vo;

import com.example.hospital.po.Patient;
import com.example.hospital.po.PaymentRefundRecord;
import com.example.hospital.po.RegistrationRecord;

/**
 * Description:挂号模块VO
 * date: 2019/9/16 0016
 * @author WYP
 */
public class RegistrationVO {
    private Patient patient;

    private RegistrationRecord record;

    private PaymentRefundRecord refundRecord;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public RegistrationRecord getRecord() {
        return record;
    }

    public void setRecord(RegistrationRecord record) {
        this.record = record;
    }

    public PaymentRefundRecord getRefundRecord() {
        return refundRecord;
    }

    public void setRefundRecord(PaymentRefundRecord refundRecord) {
        this.refundRecord = refundRecord;
    }
}
