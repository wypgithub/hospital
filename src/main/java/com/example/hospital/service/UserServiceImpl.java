package com.example.hospital.service;

import com.example.hospital.dao.UserDao;
import com.example.hospital.po.User;
import com.example.hospital.util.Constant;
import com.example.hospital.util.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }


    @Override
    public ResponseDto login(String userName, String password, HttpServletRequest request) {
        ResponseDto response = new ResponseDto(true);

        User user = userDao.findByUserNameAndPassword(userName, password);
        if(user == null){
            response.setSuccess(false);
            response.setMessage("用户名或密码错误");
        }else {
            //Store user information to session
            request.getSession().setAttribute(Constant.CURRENT_USER, user);
        }

        return response;
    }
}
