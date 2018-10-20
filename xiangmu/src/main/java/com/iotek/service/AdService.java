package com.iotek.service;

import com.iotek.model.Ad;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/20.
 */
public interface AdService {
    boolean addAd(Ad ad);
    boolean update(Ad ad);
    boolean delAd(int id);
    List<Ad> getAllAd();
    List<Ad> getAdByState(int state);
    Ad getAdById(int id);
    List<Ad> getAdByLimit(int currentPage, int pageSize);
    List<Ad> getAdByLimitAndState(int state,int currentPage, int pageSize);
}
