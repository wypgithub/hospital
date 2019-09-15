package com.example.hospital.dao;

import com.example.hospital.po.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegistrationRecordDao {

    @Select("select * from patient where medical_record_num = #{medicalRecordNum}")
    @Results({
            @Result(property = "patName", column = "pat_name"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "idNum", column = "id_num"),
            @Result(property = "dateOfBirth", column = "date_of_birth"),
            @Result(property = "idNum", column = "id_num"),
            @Result(property = "patAge", column = "pat_age"),
            @Result(property = "ageType", column = "age_type"),
            @Result(property = "address", column = "address")

    })
    Patient findByMedicalRecordNum(Integer medicalRecordNum);



    @Select("select * from reg_level where delete_tag = 1")
    @Results({
            @Result(property = "levelName", column = "level_name"),
            @Result(property = "regFee", column = "reg_fee"),
            @Result(property = "regQuota", column = "reg_quota")
    })
    List<RegLevel> findAllRegLevel();


    @Select("select dep_id,dep_name from department")
    @Results({
            @Result(property = "depId", column = "dep_id"),
            @Result(property = "depName", column = "dep_name")
    })
    List<Department> findAllDepartment();

    @Select("select dep_id,user_name from hospital_user")
    @Results({
            @Result(property = "depId", column = "dep_id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name")
    })
    List<User> findAllDoctor();

    @Insert("INSERT INTO patient VALUES(#{medicalRecordNum},#{patName},#{gender},#{idNum},#{dateOfBirth},#{patAge}," +
            "#{ageType},#{address})")
    int savePatient(Patient patient);

    @Insert("INSERT INTO registration_record VALUES(#{regId},#{medicalRecordNum},#{noon},#{regDate},#{depId},#{docId}," +
            "#{regLevel},#{billingCategoryID},#{needMedicalRecord},#{regStaffId},#{regStatus})")
    int saveRegistrationRecord(RegistrationRecord record);

}
