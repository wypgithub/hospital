package com.example.hospital.po;

import java.util.Date;

public class RegistrationRecord {
    private Integer regId;
    private Integer medicalRecordNum;
    private String noon;
    private Date regDate;
    private Integer depId;
    private Integer docId;
    private Integer regLevel;
    private String billingCategoryID;
    private String needMedicalRecord;
    private Integer regStaffId;
    private String regStatus;

    public Integer getRegId() {
        return regId;
    }

    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    public Integer getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(Integer medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public Integer getRegLevel() {
        return regLevel;
    }

    public void setRegLevel(Integer regLevel) {
        this.regLevel = regLevel;
    }

    public String getBillingCategoryID() {
        return billingCategoryID;
    }

    public void setBillingCategoryID(String billingCategoryID) {
        this.billingCategoryID = billingCategoryID;
    }

    public String getNeedMedicalRecord() {
        return needMedicalRecord;
    }

    public void setNeedMedicalRecord(String needMedicalRecord) {
        this.needMedicalRecord = needMedicalRecord;
    }

    public Integer getRegStaffId() {
        return regStaffId;
    }

    public void setRegStaffId(Integer regStaffId) {
        this.regStaffId = regStaffId;
    }

    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }
}
