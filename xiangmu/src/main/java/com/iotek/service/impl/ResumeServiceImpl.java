package com.iotek.service.impl;

import com.iotek.dao.ResumeDao;
import com.iotek.model.Resume;
import com.iotek.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WDB1 on 2018/10/19.
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeDao resumeDao;

    public boolean addResume(Resume resume) {
        return resumeDao.addResume(resume);
    }

    public boolean updateResume(Resume resume) {
        return resumeDao.updateResume(resume);
    }

    public boolean delResume(int id) {
        return resumeDao.delResume(id);
    }

    public List<Resume> getAllResume() {
        return resumeDao.getAllResume();
    }

    public Resume getResumeById(int id) {
        return resumeDao.getResumeById(id);
    }

    public Resume getResumeByUid(int user_id) {
        return resumeDao.getResumeByUid(user_id);
    }
}
