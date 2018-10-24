package com.iotek.dao;

import com.iotek.model.Interview;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/23.
 */
public interface InterviewDao {
    boolean addInterview(Interview interview);
    boolean delInterview(int id);
    boolean updateInterview(Interview interview);
    List<Interview> getAllInterview();
    Interview getInterviewById(int id);
    Interview getInterViewBydeid(int de_id);
    List<Interview> getInterviewByUserId(int user_id);
    List<Interview> getInterviewByUserIdAndLimit(HashMap<String, Object> hashMap);
    List<Interview> getInterviewByLimit(HashMap<String, Object> hashMap);
    List<Interview> getInterviewByState(int state);
    List<Interview> getInterviewByStateAndLimit(HashMap<String, Object> hashMap);
    List<Interview> getInterviewByUserIdANdStateAndLimit(HashMap<String, Object> hashMap);
    List<Interview> getInterviewByUserIdANdState(HashMap<String, Object> hashMap);
}
