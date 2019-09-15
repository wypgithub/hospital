package com.example.hospital.controller;

import com.example.hospital.po.User;
import com.example.hospital.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
    @Autowired
    protected HttpServletRequest request;

    /**
     * Get the currently logged in user
     * @return user
     */
    protected User getCurrentUser(){
        Object userObj = request.getSession().getAttribute(Constant.CURRENT_USER);
        return userObj == null? null : (User)userObj;
    }
}
