package com.iotek.model;

import com.sun.imageio.plugins.common.I18N;
import com.sun.imageio.plugins.common.ImageUtil;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;
import java.util.SimpleTimeZone;

/**
 * Created by WDB1 on 2018/10/20.
 */
public class Ad implements Serializable {
    private Integer ad_id;
    private String ad_name;
    private String ad_job;
    private String ad_company;
    private String ad_workplace;
    private String ad_money;
    private String ad_time;
    private String ad_specworkplace;
    private String ad_tenure;
    private String ad_duty;
    private String ad_department;
    private String ad_compro;
    private String ad_welfare;
    private Integer ad_state;

    public Ad() {
    }

    public Ad(Integer ad_id, String ad_name, String ad_job, String ad_company, String ad_workplace, String ad_money, String ad_time, String ad_specworkplace, String ad_tenure, String ad_duty, String ad_department, String ad_compro, String ad_welfare, Integer ad_state) {
        this.ad_id = ad_id;
        this.ad_name = ad_name;
        this.ad_job = ad_job;
        this.ad_company = ad_company;
        this.ad_workplace = ad_workplace;
        this.ad_money = ad_money;
        this.ad_time = ad_time;
        this.ad_specworkplace = ad_specworkplace;
        this.ad_tenure = ad_tenure;
        this.ad_duty = ad_duty;
        this.ad_department = ad_department;
        this.ad_compro = ad_compro;
        this.ad_welfare = ad_welfare;
        this.ad_state = ad_state;
    }

    public Integer getAd_id() {
        return ad_id;
    }

    public void setAd_id(Integer ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_job() {
        return ad_job;
    }

    public void setAd_job(String ad_job) {
        this.ad_job = ad_job;
    }

    public String getAd_company() {
        return ad_company;
    }

    public void setAd_company(String ad_company) {
        this.ad_company = ad_company;
    }

    public String getAd_workplace() {
        return ad_workplace;
    }

    public void setAd_workplace(String ad_workplace) {
        this.ad_workplace = ad_workplace;
    }

    public String getAd_money() {
        return ad_money;
    }

    public void setAd_money(String ad_money) {
        this.ad_money = ad_money;
    }

    public String getAd_time() {
        return ad_time;
    }

    public void setAd_time(String ad_time) {
        this.ad_time = ad_time;
    }

    public String getAd_specworkplace() {
        return ad_specworkplace;
    }

    public void setAd_specworkpalce(String ad_specworkpalce) {
        this.ad_specworkplace = ad_specworkpalce;
    }

    public String getAd_tenure() {
        return ad_tenure;
    }

    public void setAd_tenure(String ad_tenure) {
        this.ad_tenure = ad_tenure;
    }

    public String getAd_duty() {
        return ad_duty;
    }

    public void setAd_duty(String ad_duty) {
        this.ad_duty = ad_duty;
    }

    public String getAd_department() {
        return ad_department;
    }

    public void setAd_department(String ad_department) {
        this.ad_department = ad_department;
    }

    public String getAd_compro() {
        return ad_compro;
    }

    public void setAd_compro(String ad_compro) {
        this.ad_compro = ad_compro;
    }

    public String getAd_welfare() {
        return ad_welfare;
    }

    public void setAd_welfare(String ad_welfare) {
        this.ad_welfare = ad_welfare;
    }

    public Integer getAd_state() {
        return ad_state;
    }

    public void setAd_state(Integer ad_state) {
        this.ad_state = ad_state;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "ad_id=" + ad_id +
                ", ad_name='" + ad_name + '\'' +
                ", ad_job='" + ad_job + '\'' +
                ", ad_company='" + ad_company + '\'' +
                ", ad_workplace='" + ad_workplace + '\'' +
                ", ad_money='" + ad_money + '\'' +
                ", ad_time='" + ad_time + '\'' +
                ", ad_specworkpalce='" + ad_specworkplace + '\'' +
                ", ad_tenure='" + ad_tenure + '\'' +
                ", ad_duty='" + ad_duty + '\'' +
                ", ad_department='" + ad_department + '\'' +
                ", ad_compro='" + ad_compro + '\'' +
                ", ad_welfare='" + ad_welfare + '\'' +
                ", ad_state=" + ad_state +
                '}';
    }
}
