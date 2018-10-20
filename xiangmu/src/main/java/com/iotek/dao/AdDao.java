package com.iotek.dao;

import com.iotek.model.Ad;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/20.
 */
public interface AdDao {
    boolean addAd(Ad ad);
    boolean update(Ad ad);
    boolean delAd(int id);
    List<Ad> getAllAd();
    List<Ad> getAdByState(int state);
    Ad getAdById(int id);
    List<Ad> getAdByLimit(HashMap<String, Object> hashMap);
    List<Ad> getAdByLimitAndState(HashMap<String, Object> hashMap);
}
