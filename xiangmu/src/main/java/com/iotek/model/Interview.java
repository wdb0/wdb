package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/23.
 */
public class Interview implements Serializable {
    private Integer iv_id;
    private String iv_view;
    private String iv_time;
    private Integer iv_de_id;
    private Integer iv_state;
    private Integer iv_user_id;

    public Interview() {
    }

    public Interview(Integer iv_id, String iv_view, String iv_time, Integer iv_de_id, Integer iv_state) {
        this.iv_id = iv_id;
        this.iv_view = iv_view;
        this.iv_time = iv_time;
        this.iv_de_id = iv_de_id;
        this.iv_state = iv_state;
    }

    public Interview(String iv_view, String iv_time, Integer iv_de_id, Integer iv_state) {
        this.iv_view = iv_view;
        this.iv_time = iv_time;
        this.iv_de_id = iv_de_id;
        this.iv_state = iv_state;
    }

    public Interview(String iv_view, String iv_time, Integer iv_de_id, Integer iv_state, Integer iv_user_id) {
        this.iv_view = iv_view;
        this.iv_time = iv_time;
        this.iv_de_id = iv_de_id;
        this.iv_state = iv_state;
        this.iv_user_id = iv_user_id;
    }

    public Interview(Integer iv_id, String iv_view, String iv_time, Integer iv_de_id, Integer iv_state, Integer iv_user_id) {
        this.iv_id = iv_id;
        this.iv_view = iv_view;
        this.iv_time = iv_time;
        this.iv_de_id = iv_de_id;
        this.iv_state = iv_state;
        this.iv_user_id = iv_user_id;
    }

    public Integer getIv_id() {
        return iv_id;
    }

    public void setIv_id(Integer iv_id) {
        this.iv_id = iv_id;
    }

    public String getIv_view() {
        return iv_view;
    }

    public void setIv_view(String iv_view) {
        this.iv_view = iv_view;
    }

    public String getIv_time() {
        return iv_time;
    }

    public void setIv_time(String iv_time) {
        this.iv_time = iv_time;
    }

    public Integer getIv_de_id() {
        return iv_de_id;
    }

    public void setIv_de_id(Integer iv_de_id) {
        this.iv_de_id = iv_de_id;
    }

    public Integer getIv_state() {
        return iv_state;
    }

    public void setIv_state(Integer iv_state) {
        this.iv_state = iv_state;
    }

    public Integer getIv_user_id() {
        return iv_user_id;
    }

    public void setIv_user_id(Integer iv_user_id) {
        this.iv_user_id = iv_user_id;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "iv_id=" + iv_id +
                ", iv_view='" + iv_view + '\'' +
                ", iv_time='" + iv_time + '\'' +
                ", iv_de_id=" + iv_de_id +
                ", iv_state=" + iv_state +
                ", iv_user_id=" + iv_user_id +
                '}';
    }
}
