package com.iotek.service;

import com.iotek.model.User;

/**
 * Created by WDB1 on 2018/10/19.
 */
public interface UserService {
    boolean addUser(User user);
    User getUserByNameAndPass(User user);
    User getUserById(int id);
    User getUserByName(User user);
}
