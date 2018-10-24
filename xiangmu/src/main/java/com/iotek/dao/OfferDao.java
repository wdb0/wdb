package com.iotek.dao;

import com.iotek.model.Offer;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
public interface OfferDao {
    boolean addOffer(Offer offer);
    boolean update(Offer offer);
    List<Offer> getAllOffer();
    Offer getOfferByDeId(int de_id);
    List<Offer> getOfferByUserId(int user_id);
    List<Offer> getOfferByUserIdAndLimit(HashMap<String, Object> hashMap);
    List<Offer> getOfferByUserIdAndState(HashMap<String, Object> hashMap);
    List<Offer> getOfferByUserIdAndStateAndLimit(HashMap<String, Object> hashMap);
}
