package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/24.
 */
public class Department implements Serializable {
    private Integer dp_id;
    private String dp_department;
    private String dp_time;
    private Integer dp_num;

    public Department() {
    }

    public Department(Integer dp_id, String dp_department, String dp_time, Integer dp_num) {
        this.dp_id = dp_id;
        this.dp_department = dp_department;
        this.dp_time = dp_time;
        this.dp_num = dp_num;
    }

    public Department(String dp_department, String dp_time, Integer dp_num) {
        this.dp_department = dp_department;
        this.dp_time = dp_time;
        this.dp_num = dp_num;
    }

    public Integer getDp_id() {
        return dp_id;
    }

    public void setDp_id(Integer dp_id) {
        this.dp_id = dp_id;
    }

    public String getDp_department() {
        return dp_department;
    }

    public void setDp_department(String dp_department) {
        this.dp_department = dp_department;
    }

    public String getDp_time() {
        return dp_time;
    }

    public void setDp_time(String dp_time) {
        this.dp_time = dp_time;
    }

    public Integer getDp_num() {
        return dp_num;
    }

    public void setDp_num(Integer dp_num) {
        this.dp_num = dp_num;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dp_id=" + dp_id +
                ", dp_department='" + dp_department + '\'' +
                ", dp_time='" + dp_time + '\'' +
                ", dp_num=" + dp_num +
                '}';
    }
}