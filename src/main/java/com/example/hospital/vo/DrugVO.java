package com.example.hospital.vo;

import java.util.Date;

/**
 * Description:收费Dao
 * date: 2019/9/16 0016
 * @author WYP
 */
public class DrugVO {
    /**
     * 药品名称
     */
    private String drugName;
    /**
     * 药品单价
     */
    private String drugPrice;
    /**
     * 药品数量
     */
    private String drugNum;
    /**
     * 处方开立时间
     */
    private Date createTime;
    /**
     * 处方状态0-已开立 1-已付款 2-发生退费
     */
    private String status;

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(String drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
