package com.iotek.service;

import com.iotek.model.Interview;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/23.
 */
public interface InterviewService {
    boolean addInterview(Interview interview);
    boolean delInterview(int id);
    boolean updateInterview(Interview interview);
    List<Interview> getAllInterview();
    Interview getInterviewById(int id);
    Interview getInterViewBydeid(int de_id);
    List<Interview> getInterviewByUserId(int user_id);
    List<Interview> getInterviewByUserIdAndLimit(int user_id,int currentPage, int pageSize);
    List<Interview> getInterviewByLimit(int currentPage, int pageSize);
    List<Interview> getInterviewByState(int state);
    List<Interview> getInterviewByStateAndLimit(int state,int currentPage, int pageSize);
    List<Interview> getInterviewByUserIdANdStateAndLimit(int user_id,int state,int currentPage, int pageSize);
    List<Interview> getInterviewByUserIdANdState(int user_id,int state);
}
