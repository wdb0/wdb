package com.iotek.dao;

import com.iotek.model.Resume;

import java.util.List;

/**
 * Created by WDB1 on 2018/10/19.
 */
public interface ResumeDao {
    boolean addResume(Resume resume);
    boolean updateResume(Resume resume);
    boolean delResume(int id);
    List<Resume> getAllResume();
    Resume getResumeById(int id);
    Resume getResumeByUid(int user_id);
}
