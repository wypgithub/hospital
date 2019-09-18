package com.example.hospital.po;

/**
 * Description:处方详情PO
 * date: 2019/9/17 0017
 * @author WYP
 */
public class MedicinePrescriptionDetail {
    private Integer mpDetailId;
    private Integer mPreId;
    private Integer drugId;
    private Float drugUnitPrice;
    private String useMethod;
    private String dosage;
    private String frequency;
    private String amount;
    private String mPreStatus;

    public Integer getMpDetailId() {
        return mpDetailId;
    }

    public void setMpDetailId(Integer mpDetailId) {
        this.mpDetailId = mpDetailId;
    }

    public Integer getmPreId() {
        return mPreId;
    }

    public void setmPreId(Integer mPreId) {
        this.mPreId = mPreId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Float getDrugUnitPrice() {
        return drugUnitPrice;
    }

    public void setDrugUnitPrice(Float drugUnitPrice) {
        this.drugUnitPrice = drugUnitPrice;
    }

    public String getUseMethod() {
        return useMethod;
    }

    public void setUseMethod(String useMethod) {
        this.useMethod = useMethod;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getmPreStatus() {
        return mPreStatus;
    }

    public void setmPreStatus(String mPreStatus) {
        this.mPreStatus = mPreStatus;
    }
}
