package com.iotek.model;

import java.io.Serializable;

/**
 * Created by WDB1 on 2018/10/24.
 */
public class Job implements Serializable {
    private Integer job_id;
    private String  job_name;
    private Integer job_dp_id;
    private Integer job_num;

    public Job() {
    }

    public Job(String job_name, Integer job_dp_id, Integer job_num) {
        this.job_name = job_name;
        this.job_dp_id = job_dp_id;
        this.job_num = job_num;
    }

    public Job(Integer job_id, String job_name, Integer job_dp_id, Integer job_num) {
        this.job_id = job_id;
        this.job_name = job_name;
        this.job_dp_id = job_dp_id;
        this.job_num = job_num;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    public Integer getJob_dp_id() {
        return job_dp_id;
    }

    public void setJob_dp_id(Integer job_dp_id) {
        this.job_dp_id = job_dp_id;
    }

    public Integer getJob_num() {
        return job_num;
    }

    public void setJob_num(Integer job_num) {
        this.job_num = job_num;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", job_name='" + job_name + '\'' +
                ", job_dp_if=" + job_dp_id +
                ", job_num=" + job_num +
                '}';
    }
}
