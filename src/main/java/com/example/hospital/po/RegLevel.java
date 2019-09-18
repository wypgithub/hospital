package com.example.hospital.po;

public class RegLevel {
    private Integer levelId;
    private String levelName;
    private Float regFee;//挂号费
    private Float regQuota;//挂号限额

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Float getRegFee() {
        return regFee;
    }

    public void setRegFee(Float regFee) {
        this.regFee = regFee;
    }

    public Float getRegQuota() {
        return regQuota;
    }

    public void setRegQuota(Float regQuota) {
        this.regQuota = regQuota;
    }
}
