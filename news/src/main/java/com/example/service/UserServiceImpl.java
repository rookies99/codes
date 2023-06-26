package com.example.service;

import com.example.Dao.UserDao;
import com.example.entity2.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(User user) {
        user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        user.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
        log.info("用户信息{}", user);
        return userDao.register(user);
    }

    @Override
    public Integer checkUserName(String username,String id) {
        return userDao.checkUserName(username,id);
    }

    @Override
    public Integer checkEmail(String email,String id) {
        return userDao.checkEmail(email,id);
    }

    @Override
    public Integer checkMobile(String mobile,String id) {
        return userDao.checkMobile(mobile,id);
    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

}
