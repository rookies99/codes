package com.example.service;

import com.example.Dao.UserDao;
import com.example.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(User user) {
        return userDao.register(user);
    }
}
