package com.example.service;

import com.example.Dao.UserDao;
import com.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Date;

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
    public Integer checkUserName(String username) {
        return userDao.checkUserName(username);
    }

    @Override
    public Integer checkEmail(String email) {
        return userDao.checkEmail(email);
    }

    @Override
    public Integer checkMobile(String mobile) {
        return userDao.checkMobile(mobile);
    }

}
