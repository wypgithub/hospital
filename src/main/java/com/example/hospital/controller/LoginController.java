package com.example.hospital.controller;

import com.example.hospital.service.UserService;
import com.example.hospital.util.Constant;
import com.example.hospital.util.ResponseDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
public class LoginController extends BaseController{

    @Resource
    private UserService userService;



    @ResponseBody
    @RequestMapping("/login")
    public ResponseDto hello(String userName, String password) {
        return userService.login(userName, password, request);
    }

    @RequestMapping("/logout")
    public void logout(HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute(Constant.CURRENT_USER);
        response.sendRedirect("loginPage");
    }

    @RequestMapping("/index")
    public String hello(Model model) {

        model.addAttribute("user", getCurrentUser());
        return "index";
    }

}