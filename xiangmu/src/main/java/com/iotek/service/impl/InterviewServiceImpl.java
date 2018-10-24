package com.iotek.service.impl;

import com.iotek.dao.InterviewDao;
import com.iotek.model.Interview;
import com.iotek.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/23.
 */
@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    private InterviewDao interviewDao;
    public boolean addInterview(Interview interview) {
        return interviewDao.addInterview(interview);
    }

    public boolean delInterview(int id) {
        return interviewDao.delInterview(id);
    }

    public boolean updateInterview(Interview interview) {
        return interviewDao.updateInterview(interview);
    }

    public List<Interview> getAllInterview() {
        return interviewDao.getAllInterview();
    }

    public Interview getInterviewById(int id) {
        return interviewDao.getInterviewById(id);
    }

    public Interview getInterViewBydeid(int de_id) {
        return interviewDao.getInterViewBydeid(de_id);
    }

    public List<Interview> getInterviewByUserId(int user_id) {
        return interviewDao.getInterviewByUserId(user_id);
    }

    public List<Interview> getInterviewByUserIdAndLimit(int user_id, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("user_id",user_id);
        return interviewDao.getInterviewByUserIdAndLimit(map);
    }

    public List<Interview> getInterviewByLimit(int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        return interviewDao.getInterviewByLimit(map);
    }

    public List<Interview> getInterviewByState(int state) {
        return interviewDao.getInterviewByState(state);
    }

    public List<Interview> getInterviewByStateAndLimit(int state, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("state",state);
        return interviewDao.getInterviewByStateAndLimit(map);
    }

    public List<Interview> getInterviewByUserIdANdStateAndLimit(int user_id, int state, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("state",state);
        map.put("user_id",user_id);
        return interviewDao.getInterviewByUserIdANdStateAndLimit(map);
    }

    public List<Interview> getInterviewByUserIdANdState(int user_id, int state) {
        HashMap<String, Object> map = new HashMap();
        map.put("state",state);
        map.put("user_id",user_id);
        return interviewDao.getInterviewByUserIdANdState(map);
    }
}
