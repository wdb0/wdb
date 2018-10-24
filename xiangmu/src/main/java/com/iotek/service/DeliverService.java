package com.iotek.service;

import com.iotek.model.Deliver;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/22.
 */
public interface DeliverService {
    boolean addDeliver(Deliver deliver);
    boolean updateDeliver(Deliver deliver);
    List<Deliver> getAllDeliver();
    Deliver getDeliverById(int id);
    List<Deliver> getDeliverByLimit(int currentPage,int pageSize);
    List<Deliver> getDeliverByAdId(int ad_id);
    List<Deliver> getDeliverByAdIdAndLimit(int ad_id,int currentPage,int pageSize);
    List<Deliver> getDeliverByStateAndLimit(int state,int currentPage,int pageSize);
    List<Deliver> getDeliverByUserId(int user_id);
    List<Deliver> getDeliverByUserIdAndLimit(int user_id,int currentPage,int pageSize);
}
