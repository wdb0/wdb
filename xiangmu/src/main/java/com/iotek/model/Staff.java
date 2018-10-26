package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/25.
 */
public class Staff implements Serializable {
    private Integer sf_id;
    private String sf_name;
    private String sf_pass;
    private String sf_sex;
    private Integer sf_age;
    private Integer sf_phone;
    private String sf_mail;
    private Integer sf_dp_id;
    private Integer sf_job_id;
    private Integer sf_money;
    private Integer sf_state;
    private String sf_addr;
    private String sf_time;

    public Staff() {
    }

    public Staff(Integer sf_id, String sf_name, String sf_pass, String sf_sex, Integer sf_age, Integer sf_phone, String sf_mail, Integer sf_dp_id, Integer sf_job_id, Integer sf_money, Integer sf_state, String sf_addr, String sf_time) {
        this.sf_id = sf_id;
        this.sf_name = sf_name;
        this.sf_pass = sf_pass;
        this.sf_sex = sf_sex;
        this.sf_age = sf_age;
        this.sf_phone = sf_phone;
        this.sf_mail = sf_mail;
        this.sf_dp_id = sf_dp_id;
        this.sf_job_id = sf_job_id;
        this.sf_money = sf_money;
        this.sf_state = sf_state;
        this.sf_addr = sf_addr;
        this.sf_time = sf_time;
    }

    public Staff(String sf_name, String sf_pass, String sf_sex, Integer sf_age, Integer sf_phone, String sf_mail, Integer sf_dp_id, Integer sf_job_id, Integer sf_money, Integer sf_state, String sf_addr, String sf_time) {
        this.sf_name = sf_name;
        this.sf_pass = sf_pass;
        this.sf_sex = sf_sex;
        this.sf_age = sf_age;
        this.sf_phone = sf_phone;
        this.sf_mail = sf_mail;
        this.sf_dp_id = sf_dp_id;
        this.sf_job_id = sf_job_id;
        this.sf_money = sf_money;
        this.sf_state = sf_state;
        this.sf_addr = sf_addr;
        this.sf_time = sf_time;
    }

    public Integer getSf_id() {
        return sf_id;
    }

    public void setSf_id(Integer sf_id) {
        this.sf_id = sf_id;
    }

    public String getSf_name() {
        return sf_name;
    }

    public void setSf_name(String sf_name) {
        this.sf_name = sf_name;
    }

    public String getSf_pass() {
        return sf_pass;
    }

    public void setSf_pass(String sf_pass) {
        this.sf_pass = sf_pass;
    }

    public String getSf_sex() {
        return sf_sex;
    }

    public void setSf_sex(String sf_sex) {
        this.sf_sex = sf_sex;
    }

    public Integer getSf_age() {
        return sf_age;
    }

    public void setSf_age(Integer sf_age) {
        this.sf_age = sf_age;
    }

    public Integer getSf_phone() {
        return sf_phone;
    }

    public void setSf_phone(Integer sf_phone) {
        this.sf_phone = sf_phone;
    }

    public String getSf_mail() {
        return sf_mail;
    }

    public void setSf_mail(String sf_mail) {
        this.sf_mail = sf_mail;
    }

    public Integer getSf_dp_id() {
        return sf_dp_id;
    }

    public void setSf_dp_id(Integer sf_dp_id) {
        this.sf_dp_id = sf_dp_id;
    }

    public Integer getSf_job_id() {
        return sf_job_id;
    }

    public void setSf_job_id(Integer sf_job_id) {
        this.sf_job_id = sf_job_id;
    }

    public Integer getSf_money() {
        return sf_money;
    }

    public void setSf_money(Integer sf_money) {
        this.sf_money = sf_money;
    }

    public Integer getSf_state() {
        return sf_state;
    }

    public void setSf_state(Integer sf_state) {
        this.sf_state = sf_state;
    }

    public String getSf_addr() {
        return sf_addr;
    }

    public void setSf_addr(String sf_addr) {
        this.sf_addr = sf_addr;
    }

    public String getSf_time() {
        return sf_time;
    }

    public void setSf_time(String sf_time) {
        this.sf_time = sf_time;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "sf_id=" + sf_id +
                ", sf_name='" + sf_name + '\'' +
                ", sf_pass='" + sf_pass + '\'' +
                ", sf_sex='" + sf_sex + '\'' +
                ", sf_age=" + sf_age +
                ", sf_phone=" + sf_phone +
                ", sf_mail='" + sf_mail + '\'' +
                ", sf_dp_id=" + sf_dp_id +
                ", sf_job_id=" + sf_job_id +
                ", sf_money=" + sf_money +
                ", sf_state=" + sf_state +
                ", sf_addr='" + sf_addr + '\'' +
                ", sf_time='" + sf_time + '\'' +
                '}';
    }
}
