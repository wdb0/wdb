package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/19.
 */
public class User implements Serializable {
    private Integer user_id;
    private String user_name;
    private String User_pass;

    public User() {
    }

    public User(String user_name) {
        this.user_name = user_name;
    }

    public User(Integer user_id, String user_name, String user_pass) {
        this.user_id = user_id;
        this.user_name = user_name;
        User_pass = user_pass;
    }

    public User(String user_name, String user_pass) {
        this.user_name = user_name;
        User_pass = user_pass;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return User_pass;
    }

    public void setUser_pass(String user_pass) {
        User_pass = user_pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", User_pass='" + User_pass + '\'' +
                '}';
    }
}
