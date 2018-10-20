package com.iotek.service.impl;

import com.iotek.dao.AdDao;
import com.iotek.model.Ad;
import com.iotek.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/20.
 */
@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdDao adDao;
    public boolean addAd(Ad ad) {
        return adDao.addAd(ad);
    }

    public boolean update(Ad ad) {
        return adDao.update(ad);
    }

    public boolean delAd(int id) {
        return adDao.delAd(id);
    }

    public List<Ad> getAllAd() {
        return adDao.getAllAd();
    }

    public List<Ad> getAdByState(int state) {
        return adDao.getAdByState(state);
    }

    public Ad getAdById(int id) {
        return adDao.getAdById(id);
    }

    public List<Ad> getAdByLimit(int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        return adDao.getAdByLimit(map);
    }

    public List<Ad> getAdByLimitAndState(int state,int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("state",state);
        return adDao.getAdByLimitAndState(map);
    }
}
