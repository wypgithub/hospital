package com.example.hospital.dao;

import com.example.hospital.po.InvoiceRecord;
import com.example.hospital.po.MedicalRecord;
import com.example.hospital.po.Patient;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Description: 诊病Dao
 * date: 2019/9/17 0017
 * @author WYP
 */
@Mapper
public interface ConsultationDao {

    /**
     * 查询医生当日待诊或已诊患者列表
     * @param regStatus 挂号状态
     * @param docId 医生ID
     * @return 患者列表
     */
    @Select("SELECT p.* FROM patient p JOIN registration_record r ON p.medical_record_num = r.medical_record_num" +
            " WHERE TO_DAYS(r.reg_date) = TO_DAYS(now()) AND r.reg_status = #{regStatus} AND r.doc_id = #{docId}")
    @Results({
            @Result(property = "medicalRecordNum", column = "medical_record_num"),
            @Result(property = "patName", column = "pat_name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "patAge", column = "pat_age")
    })
    List<Patient> findPatient(@Param("regStatus") String regStatus, @Param("docId") Integer docId);

    @Update("UPDATE registration_record SET reg_status = '1' WHERE medical_record_num = #{medicalRecordStatus}")
    void updateRegStatus(Integer medicalRecordNum);

    @Insert("INSERT INTO medical_record (medical_record_num,reg_id,chief_complaint,cur_med_history," +
            "cur_treatment_situa,past_med_history,allergies,physical_exam,medical_record_status)" +
            " VALUES (#{medicalRecordNum},#{regId},#{chiefComplaint},#{curMedHistory}," +
            "#{curTreatmentSitua},#{pastMedHistory},#{allergies},#{physicalExam},#{medicalRecordStatus})")
    @Options(useGeneratedKeys = true, keyProperty = "medicalRecordId", keyColumn = "medical_record_id")
    void saveMedicalRecord(MedicalRecord medicalRecord);

}
