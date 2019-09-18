package com.example.hospital.dao;

import com.example.hospital.po.Drug;
import com.example.hospital.po.MedicinePrescription;
import com.example.hospital.po.MedicinePrescriptionDetail;
import com.example.hospital.po.PaymentRefundRecord;
import com.example.hospital.vo.DrugVO;
import com.example.hospital.vo.MedicalRecordVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Description: 开立厨房Dao
 * date: 2019/9/17 0017
 * @author WYP
 */
@Mapper
public interface PrescriptionDao {

    @Select("SELECT p.pat_name,p.gender,p.pat_age,r.medical_record_id,r.chief_complaint,r.cur_med_history," +
            "r.cur_treatment_situa,r.past_med_history,r.allergies,r.physical_exam" +
            " FROM medical_record r JOIN patient p ON r.medical_record_num = p.medical_record_num" +
            " WHERE r.medical_record_num = #{medicalRecordNum} ORDER BY r.medical_record_id DESC LIMIT 1")
    @Results({
            @Result(property = "patName", column = "pat_name"),
            @Result(property = "patAge", column = "pat_age"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "medicalRecordId", column = "medical_record_id"),
            @Result(property = "chiefComplaint", column = "chief_complaint"),
            @Result(property = "medicalRecordId", column = "medical_record_id"),
            @Result(property = "chiefComplaint", column = "chief_complaint"),
            @Result(property = "curMedHistory", column = "cur_med_history"),
            @Result(property = "curTreatmentSitua", column = "cur_treatment_situa"),
            @Result(property = "pastMedHistory", column = "past_med_history"),
            @Result(property = "allergies", column = "allergies"),
            @Result(property = "physicalExam", column = "physical_exam")
    })
    MedicalRecordVO findMedicalRecord(Integer medicalRecordNum);

    @Select("SELECT drug_id,drug_name,drug_specifi,pack_unit,drug_unit_price FROM drug")
    @Results({
            @Result(property = "drugId", column = "drug_id"),
            @Result(property = "drugName", column = "drug_name"),
            @Result(property = "drugSpeciFi", column = "drug_specifi"),
            @Result(property = "packUnit", column = "pack_unit"),
            @Result(property = "drugUnitPrice", column = "drug_unit_price")
    })
    List<Drug> findAllDrugList();

    @Insert("INSERT INTO medicine_prescription (medical_record_num,reg_id,doc_id,m_pre_name,create_time,m_pre_status)" +
            " VALUES (#{medicalRecordNum},#{regId},#{docId},#{mPreName},#{createTime,jdbcType=DATE},#{mPreStatus})")
    @Options(useGeneratedKeys = true, keyProperty = "mPreId", keyColumn = "m_pre_id")
    void saveMedicinePrescription(MedicinePrescription medicinePrescription);


    @Insert("INSERT INTO medicine_prescription_detail (m_pre_id,drug_id,drug_unit_price,use_method,Dosage," +
            "frequency,amount,m_pre_status)" +
            " VALUES (#{mPreId},#{drugId},#{drugUnitPrice},#{useMethod},#{dosage}," +
            "#{frequency},#{amount},#{mPreStatus})")
    @Options(useGeneratedKeys = true, keyProperty = "mpDetailId", keyColumn = "mp_detail_id")
    void saveMedicinePrescriptionDetail(MedicinePrescriptionDetail medicinePrescriptionDetail);

}
