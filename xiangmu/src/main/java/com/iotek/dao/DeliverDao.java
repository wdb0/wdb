package com.iotek.dao;

import com.iotek.model.Deliver;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/22.
 */
public interface DeliverDao {
    boolean addDeliver(Deliver deliver);
    boolean updateDeliver(Deliver deliver);
    List<Deliver> getAllDeliver();
    Deliver getDeliverById(int id);
    List<Deliver> getDeliverByLimit(HashMap<String, Object> hashMap);
    List<Deliver> getDeliverByAdId(int ad_id);
    List<Deliver> getDeliverByAdIdAndLimit(HashMap<String, Object> hashMap);
    List<Deliver> getDeliverByStateAndLimit(HashMap<String, Object> hashMap);
    List<Deliver> getDeliverByUserId(int user_id);
    List<Deliver> getDeliverByUserIdAndLimit(HashMap<String, Object> hashMap);
}
