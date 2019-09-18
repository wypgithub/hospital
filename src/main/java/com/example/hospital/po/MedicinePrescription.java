package com.example.hospital.po;

import java.util.Date;

/**
 * Description: 处方PO
 * date: 2019/9/17 0017
 * @author WYP
 */
public class MedicinePrescription {
    private Integer mPreId;
    private Integer medicalRecordNum;
    private Integer regId;
    private Integer docId;
    private String mPreName;
    private Date createTime;
    private String mPreStatus;

    public Integer getmPreId() {
        return mPreId;
    }

    public void setmPreId(Integer mPreId) {
        this.mPreId = mPreId;
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

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getmPreName() {
        return mPreName;
    }

    public void setmPreName(String mPreName) {
        this.mPreName = mPreName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getmPreStatus() {
        return mPreStatus;
    }

    public void setmPreStatus(String mPreStatus) {
        this.mPreStatus = mPreStatus;
    }
}
