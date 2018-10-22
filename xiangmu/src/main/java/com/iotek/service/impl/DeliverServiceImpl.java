package com.iotek.service.impl;

import com.iotek.dao.DeliverDao;
import com.iotek.model.Deliver;
import com.iotek.service.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/22.
 */
@Service
public class DeliverServiceImpl implements DeliverService {
    @Autowired
    private DeliverDao deliverDao;
    public boolean addDeliver(Deliver deliver) {
        return deliverDao.addDeliver(deliver);
    }

    public boolean updateDeliver(Deliver deliver) {
        return deliverDao.updateDeliver(deliver);
    }

    public List<Deliver> getAllDeliver() {
        return deliverDao.getAllDeliver();
    }

    public List<Deliver> getDeliverByAdId(int ad_id) {
        return deliverDao.getDeliverByAdId(ad_id);
    }

    public List<Deliver> getDeliverByAdIdAndLimit(int ad_id, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("ad_id",ad_id);
        return deliverDao.getDeliverByAdIdAndLimit(map);
    }

    public List<Deliver> getDeliverByStateAndLimit(int state, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("state",state);
        return deliverDao.getDeliverByStateAndLimit(map);
    }

    public List<Deliver> getDeliverByUserId(int user_id) {
        return deliverDao.getDeliverByUserId(user_id);
    }

    public List<Deliver> getDeliverByUserIdAndLimit(int user_id, int currentPage, int pageSize) {
        HashMap<String, Object> map = new HashMap();
        map.put("currentPage", (currentPage-1)*pageSize);
        map.put("pageSize", currentPage*pageSize);
        map.put("user_id",user_id);
        return deliverDao.getDeliverByUserIdAndLimit(map);
    }
}
