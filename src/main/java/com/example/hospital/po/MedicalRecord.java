package com.example.hospital.po;

/**
 * Description: 病历记录PO
 * date: 2019/9/17 0017
 * @author WYP
 */
public class MedicalRecord {
    private Integer medicalRecordId;
    private Integer medicalRecordNum;
    private Integer regId;
    private String chiefComplaint;
    private String curMedHistory;
    private String curTreatmentSitua;
    private String pastMedHistory;
    private String allergies;
    private String physicalExam;
/*
    private String inspection_suggestion;
    private String precautions;
    private String Inspection_result;
    private String diagnosis_result;
    private String treatment_opinion;*/
    /**
     * 病历状态(1-暂存 2-已提交 3-诊毕)
     */
    private String medicalRecordStatus;

    public Integer getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(Integer medicalRecordId) {
        this.medicalRecordId = medicalRecordId;
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

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getCurMedHistory() {
        return curMedHistory;
    }

    public void setCurMedHistory(String curMedHistory) {
        this.curMedHistory = curMedHistory;
    }

    public String getCurTreatmentSitua() {
        return curTreatmentSitua;
    }

    public void setCurTreatmentSitua(String curTreatmentSitua) {
        this.curTreatmentSitua = curTreatmentSitua;
    }

    public String getPastMedHistory() {
        return pastMedHistory;
    }

    public void setPastMedHistory(String pastMedHistory) {
        this.pastMedHistory = pastMedHistory;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPhysicalExam() {
        return physicalExam;
    }

    public void setPhysicalExam(String physicalExam) {
        this.physicalExam = physicalExam;
    }

    public String getMedicalRecordStatus() {
        return medicalRecordStatus;
    }

    public void setMedicalRecordStatus(String medicalRecordStatus) {
        this.medicalRecordStatus = medicalRecordStatus;
    }
}
