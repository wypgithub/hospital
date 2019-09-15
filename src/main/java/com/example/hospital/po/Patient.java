package com.example.hospital.po;

import java.util.Date;

public class Patient {
    /**
     * 病历号
     */
    private Integer medicalRecordNum;
    /**
     * 姓名
     */
    private String patName;
    /**
     * 性别 71为男，72为女
     */
    private String gender;
    /**
     * 身份号码
     */
    private String idNum;
    /**
     * 生日
     */
    private Date dateOfBirth;
    /**
     * 年龄
     */
    private String patAge;
    /**
     * 年龄 0-岁 1-月 2-天
     */
    private String ageType;
    /**
     * 地址
     */
    private String address;

    public Integer getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(Integer medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPatAge() {
        return patAge;
    }

    public void setPatAge(String patAge) {
        this.patAge = patAge;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
