package com.example.hospital.dao;

import com.example.hospital.po.User;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserDao  {

    @Select("select user_id,user_name from hospital_user where login_name=#{userName} and user_psw = #{password}")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "userName", column = "user_name")
    })
    User findByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);


}
