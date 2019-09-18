package com.example.hospital.po;

import java.util.Date;

/**
 * Description:收退费PO
 * date: 2019/9/16 0016
 * @author WYP
 */
public class PaymentRefundRecord {
    private Integer chargeNum;
    private Integer medicalRecordNum;
    private Integer regId;
    private Integer invoiceNum;
    private String chargeItemId;
    private String costCategory;
    private Float totalAmount;
    private Date costTime;
    private Integer userId;
    private String paymentMethod;
    private Integer refundNum;


    public Integer getChargeNum() {
        return chargeNum;
    }

    public void setChargeNum(Integer chargeNum) {
        this.chargeNum = chargeNum;
    }

    public Integer getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(Integer medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Integer getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(Integer invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getChargeItemId() {
        return chargeItemId;
    }

    public void setChargeItemId(String chargeItemId) {
        this.chargeItemId = chargeItemId;
    }

    public String getCostCategory() {
        return costCategory;
    }

    public void setCostCategory(String costCategory) {
        this.costCategory = costCategory;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getCostTime() {
        return costTime;
    }

    public void setCostTime(Date costTime) {
        this.costTime = costTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getRefundNum() {
        return refundNum;
    }

    public void setRefundNum(Integer refundNum) {
        this.refundNum = refundNum;
    }
}
