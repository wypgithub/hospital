package com.example.hospital.po;

/**
 * Description:发票PO
 * date: 2019/9/17 0017
 * @author WYP
 */
public class InvoiceRecord {
    /**
     * 发票号码
     */
    private Integer invoiceNum;
    /**
     * 发票金额
     */
    private String totalAmo;
    /**
     * 发票状态(1-正常,2-作废)
     */
    private String invoiceStatus;
    /**
     * 发票状态(0-未日结,1-已提交,2-已审核)
     */
    private String dailyStatementStatus;

    public InvoiceRecord() {
    }

    public InvoiceRecord(String totalAmo, String invoiceStatus, String dailyStatementStatus) {
        this.totalAmo = totalAmo;
        this.invoiceStatus = invoiceStatus;
        this.dailyStatementStatus = dailyStatementStatus;
    }

    public Integer getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(Integer invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getTotalAmo() {
        return totalAmo;
    }

    public void setTotalAmo(String totalAmo) {
        this.totalAmo = totalAmo;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public String getDailyStatementStatus() {
        return dailyStatementStatus;
    }

    public void setDailyStatementStatus(String dailyStatementStatus) {
        this.dailyStatementStatus = dailyStatementStatus;
    }
}
