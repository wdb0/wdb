package com.iotek.service.impl;

import com.iotek.dao.UserDao;
import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WDB1 on 2018/10/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    //增加用户
    public boolean addUser(User user) {
        return userDao.addUser(user);
    }
    //根据用户名和密码找用户
    public User getUserByNameAndPass(User user) {
        return userDao.getUserByNameAndPass(user);
    }
    //根据id找用户
    public User getUserById(int id) {
        return getUserById(id);
    }

    public User getUserByName(User user) {
        return userDao.getUserByName(user);
    }
}
