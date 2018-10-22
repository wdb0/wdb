package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/22.
 */
public class Deliver implements Serializable {
    private Integer de_id;
    private Integer de_user_id;
    private Integer de_ad_id;
    private Integer de_state;

    public Deliver() {
    }

    public Deliver(Integer de_id, Integer de_user_id, Integer de_ad_id, Integer de_state) {
        this.de_id = de_id;
        this.de_user_id = de_user_id;
        this.de_ad_id = de_ad_id;
        this.de_state = de_state;
    }

    public Deliver(Integer de_user_id, Integer de_ad_id, Integer de_state) {
        this.de_user_id = de_user_id;
        this.de_ad_id = de_ad_id;
        this.de_state = de_state;
    }

    public Integer getDe_id() {
        return de_id;
    }

    public void setDe_id(Integer de_id) {
        this.de_id = de_id;
    }

    public Integer getDe_user_id() {
        return de_user_id;
    }

    public void setDe_user_id(Integer de_user_id) {
        this.de_user_id = de_user_id;
    }

    public Integer getDe_ad_id() {
        return de_ad_id;
    }

    public void setDe_ad_id(Integer de_ad_id) {
        this.de_ad_id = de_ad_id;
    }

    public Integer getDe_state() {
        return de_state;
    }

    public void setDe_state(Integer de_state) {
        this.de_state = de_state;
    }

    @Override
    public String toString() {
        return "Deliver{" +
                "de_id=" + de_id +
                ", de_user_id=" + de_user_id +
                ", de_ad_id=" + de_ad_id +
                ", de_state=" + de_state +
                '}';
    }
}
