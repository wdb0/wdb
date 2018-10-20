package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/19.
 */
public class Resume implements Serializable {
    private Integer re_id;
    private String re_name;
    private String re_sex;
    private Integer re_age;
    private String re_nation;
    private String re_hometown;
    private String re_marry;
    private String re_polity;
    private String re_major;
    private String re_school;
    private Integer re_phone;
    private String re_addr;
    private Integer re_post;
    private String re_email;
    private String re_sop;
    private String re_edubg;
    private String re_sel;
    private Integer re_user_id;

    public Resume() {
    }

    public Resume(String re_name, String re_sex, Integer re_age, String re_nation, String re_hometown, String re_marry, String re_polity, String re_major, String re_school, Integer re_phone, String re_addr, Integer re_post, String re_email, String re_sop, String re_edubg, String re_sel, Integer re_user_id) {
        this.re_name = re_name;
        this.re_sex = re_sex;
        this.re_age = re_age;
        this.re_nation = re_nation;
        this.re_hometown = re_hometown;
        this.re_marry = re_marry;
        this.re_polity = re_polity;
        this.re_major = re_major;
        this.re_school = re_school;
        this.re_phone = re_phone;
        this.re_addr = re_addr;
        this.re_post = re_post;
        this.re_email = re_email;
        this.re_sop = re_sop;
        this.re_edubg = re_edubg;
        this.re_sel = re_sel;
        this.re_user_id = re_user_id;
    }

    public Resume(Integer re_id, String re_name, String re_sex, Integer re_age, String re_nation, String re_hometown, String re_marry, String re_polity, String re_major, String re_school, Integer re_phone, String re_addr, Integer re_post, String re_email, String re_sop, String re_edubg, String re_sel, Integer re_user_id) {
        this.re_id = re_id;
        this.re_name = re_name;
        this.re_sex = re_sex;
        this.re_age = re_age;
        this.re_nation = re_nation;
        this.re_hometown = re_hometown;
        this.re_marry = re_marry;
        this.re_polity = re_polity;
        this.re_major = re_major;
        this.re_school = re_school;
        this.re_phone = re_phone;
        this.re_addr = re_addr;
        this.re_post = re_post;
        this.re_email = re_email;
        this.re_sop = re_sop;
        this.re_edubg = re_edubg;
        this.re_sel = re_sel;
        this.re_user_id = re_user_id;
    }

    public Integer getRe_id() {
        return re_id;
    }

    public void setRe_id(Integer re_id) {
        this.re_id = re_id;
    }

    public String getRe_name() {
        return re_name;
    }

    public void setRe_name(String re_name) {
        this.re_name = re_name;
    }

    public String getRe_sex() {
        return re_sex;
    }

    public void setRe_sex(String re_sex) {
        this.re_sex = re_sex;
    }

    public Integer getRe_age() {
        return re_age;
    }

    public void setRe_age(Integer re_age) {
        this.re_age = re_age;
    }

    public String getRe_nation() {
        return re_nation;
    }

    public void setRe_nation(String re_nation) {
        this.re_nation = re_nation;
    }

    public String getRe_hometown() {
        return re_hometown;
    }

    public void setRe_hometown(String re_hometown) {
        this.re_hometown = re_hometown;
    }

    public String getRe_marry() {
        return re_marry;
    }

    public void setRe_marry(String re_marry) {
        this.re_marry = re_marry;
    }

    public String getRe_polity() {
        return re_polity;
    }

    public void setRe_polity(String re_polity) {
        this.re_polity = re_polity;
    }

    public String getRe_major() {
        return re_major;
    }

    public void setRe_major(String re_major) {
        this.re_major = re_major;
    }

    public String getRe_school() {
        return re_school;
    }

    public void setRe_school(String re_school) {
        this.re_school = re_school;
    }

    public Integer getRe_phone() {
        return re_phone;
    }

    public void setRe_phone(Integer re_phone) {
        this.re_phone = re_phone;
    }

    public String getRe_addr() {
        return re_addr;
    }

    public void setRe_addr(String re_addr) {
        this.re_addr = re_addr;
    }

    public Integer getRe_post() {
        return re_post;
    }

    public void setRe_post(Integer re_post) {
        this.re_post = re_post;
    }

    public String getRe_email() {
        return re_email;
    }

    public void setRe_email(String re_email) {
        this.re_email = re_email;
    }

    public String getRe_sop() {
        return re_sop;
    }

    public void setRe_sop(String re_sop) {
        this.re_sop = re_sop;
    }

    public String getRe_edubg() {
        return re_edubg;
    }

    public void setRe_edubg(String re_edubg) {
        this.re_edubg = re_edubg;
    }

    public String getRe_sel() {
        return re_sel;
    }

    public void setRe_sel(String re_sel) {
        this.re_sel = re_sel;
    }

    public Integer getRe_user_id() {
        return re_user_id;
    }

    public void setRe_user_id(Integer re_user_id) {
        this.re_user_id = re_user_id;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "re_id=" + re_id +
                ", re_name='" + re_name + '\'' +
                ", re_sex='" + re_sex + '\'' +
                ", re_age=" + re_age +
                ", re_nation='" + re_nation + '\'' +
                ", re_hometown='" + re_hometown + '\'' +
                ", re_marry='" + re_marry + '\'' +
                ", re_polity='" + re_polity + '\'' +
                ", re_major='" + re_major + '\'' +
                ", re_school='" + re_school + '\'' +
                ", re_phone=" + re_phone +
                ", re_addr='" + re_addr + '\'' +
                ", re_post=" + re_post +
                ", re_email='" + re_email + '\'' +
                ", re_sop='" + re_sop + '\'' +
                ", re_edubg='" + re_edubg + '\'' +
                ", re_sel='" + re_sel + '\'' +
                ", re_user_id='" + re_user_id + '\'' +
                '}';
    }
}
