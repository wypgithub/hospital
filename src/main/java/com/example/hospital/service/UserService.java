package com.example.hospital.service;



import com.example.hospital.po.User;
import com.example.hospital.util.ResponseDto;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserService {
    List<User> findAll();

    User findById(Long id);

    ResponseDto login(String userName, String password, HttpServletRequest request);
}
