package com.iotek.service.impl;

import com.iotek.dao.JobDao;
import com.iotek.model.Job;
import com.iotek.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
@Service
public class JobSerivceImpl implements JobService {
    @Autowired
    private JobDao jobDao;
    public boolean addJob(Job job) {
        return jobDao.addJob(job);
    }

    public boolean updateJob(Job job) {
        return jobDao.updateJob(job);
    }

    public boolean delJob(int id) {
        return jobDao.delJob(id);
    }

    public List<Job> getAllJob() {
        return jobDao.getAllJob();
    }

    public Job getJobByID(int id) {
        return jobDao.getJobByID(id);
    }

    public List<Job> getJobByDpid(int dp_id) {
        return jobDao.getJobByDpid(dp_id);
    }
}
