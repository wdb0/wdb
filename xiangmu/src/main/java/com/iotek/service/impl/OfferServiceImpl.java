package com.iotek.service.impl;

import com.iotek.dao.OfferDao;
import com.iotek.model.Offer;
import com.iotek.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
@Service
public class OfferServiceImpl implements OfferService {
    @Autowired
    private OfferDao offerDao;
    public boolean addOffer(Offer offer) {
        return offerDao.addOffer(offer);
    }

    public boolean update(Offer offer) {
        return offerDao.update(offer);
    }

    public List<Offer> getAllOffer() {
        return offerDao.getAllOffer();
    }

    public Offer getOfferByDeId(int de_id) {
        return offerDao.getOfferByDeId(de_id);
    }

    public List<Offer> getOfferByUserId(int user_id) {
        return offerDao.getOfferByUserId(user_id);
    }

    public List<Offer> getOfferByUserIdAndLimit(int user_id, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("user_id",user_id);
        return offerDao.getOfferByUserIdAndLimit(map);
    }

    public List<Offer> getOfferByUserIdAndState(int user_id, int state) {
        HashMap<String, Object> map = new HashMap();
        map.put("user_id",user_id);
        map.put("state",state);
        return offerDao.getOfferByUserIdAndState(map);
    }

    public List<Offer> getOfferByUserIdAndStateAndLimit(int user_id, int state, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("user_id",user_id);
        map.put("state",state);
        return offerDao.getOfferByUserIdAndStateAndLimit(map);
    }
}
