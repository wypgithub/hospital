package com.example.hospital.po;

/**
 * Description: 药品PO
 * date: 2019/9/17 0017
 * @author WYP
 */
public class Drug {
    private Integer drugId;
    private String drugName;
    private String drugSpeciFi;
    private String  packUnit;
    private Float drugUnitPrice;

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugSpeciFi() {
        return drugSpeciFi;
    }

    public void setDrugSpeciFi(String drugSpeciFi) {
        this.drugSpeciFi = drugSpeciFi;
    }

    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    public Float getDrugUnitPrice() {
        return drugUnitPrice;
    }

    public void setDrugUnitPrice(Float drugUnitPrice) {
        this.drugUnitPrice = drugUnitPrice;
    }
}
