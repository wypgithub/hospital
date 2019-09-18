package com.example.hospital.vo;

import com.example.hospital.po.MedicalRecord;

import java.util.Date;

/**
 * Description:
 * date: 2019/9/17 0017
 *
 * @author WYP
 */
public class MedicalRecordVO extends MedicalRecord {
    private String patName;
    private String gender;
    private String patAge;

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

    public String getPatAge() {
        return patAge;
    }

    public void setPatAge(String patAge) {
        this.patAge = patAge;
    }
}
