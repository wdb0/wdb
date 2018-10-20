package com.iotek.dao;

import com.iotek.model.User;

/**
 * Created by WDB1 on 2018/10/19.
 */
public interface UserDao {
    boolean addUser(User user);
    User getUserByNameAndPass(User user);
    User getUserByName(User user);
    User getUserById(int id);
}
