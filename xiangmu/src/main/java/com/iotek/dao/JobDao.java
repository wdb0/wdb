package com.iotek.dao;

import com.iotek.model.Job;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
public interface JobDao  {
    boolean addJob(Job job);
    boolean updateJob(Job job);
    boolean delJob(int id);
    List<Job> getAllJob();
    Job getJobByID(int id);
    List<Job> getJobByDpid(int dp_id);
    Job getJobByDpidAndName(HashMap<String, Object> hashMap);
}
