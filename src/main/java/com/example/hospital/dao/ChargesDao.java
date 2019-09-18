package com.example.hospital.dao;

import com.example.hospital.po.InvoiceRecord;
import com.example.hospital.po.PaymentRefundRecord;
import com.example.hospital.vo.DrugVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Description:收费Dao
 * date: 2019/9/16 0016
 * @author WYP
 */
@Mapper
public interface ChargesDao {

    @Select("SELECT drug.drug_name,drug.drug_unit_price,detail.amount,medicine.create_time,medicine.m_pre_status" +
            " FROM medicine_prescription medicine" +
            " JOIN medicine_prescription_detail detail ON medicine.m_pre_id = detail.m_pre_id" +
            " JOIN drug drug ON drug.drug_id = detail.drug_id" +
            " WHERE medical_record_num = #{medicalRecordNum}")
    @Results({
            @Result(property = "drugName", column = "drug_name"),
            @Result(property = "drugPrice", column = "drug_unit_price"),
            @Result(property = "drugNum", column = "amount"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "status", column = "m_pre_status")
    })
    List<DrugVO> findDrugList(Integer medicalRecordNum);

    @Select("select reg_id from registration_record where medical_record_num = #{medicalRecordNum} ORDER BY reg_date DESC LIMIT 1")
    Integer findRegId(Integer medicalRecordNum);

    @Insert("INSERT INTO payment_refund_record (reg_id,invoice_num,charge_item_id,cost_category,total_amount," +
            "cost_time,user_id,payment_method,refund_num)" +
            " VALUES (#{regId},#{invoiceNum},#{chargeItemId},#{costCategory},#{totalAmount}," +
            "#{costTime,jdbcType=TIMESTAMP},#{userId},#{paymentMethod},#{refundNum})")
    @Options(useGeneratedKeys = true, keyProperty = "chargeNum", keyColumn = "charge_num")
    void savePaymentRefundRecord(PaymentRefundRecord refundRecord);

    @Insert("INSERT INTO invoice_record (total_amo,invoice_status,Daily_Statement_status)" +
            " VALUES (#{totalAmo},#{invoiceStatus},#{dailyStatementStatus})")
    @Options(useGeneratedKeys = true, keyProperty = "invoiceNum", keyColumn = "invoice_num")
    void saveInvoiceRecord(InvoiceRecord invoiceRecord);
}
