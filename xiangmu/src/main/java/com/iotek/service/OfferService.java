package com.iotek.service;

import com.iotek.model.Offer;

import java.util.HashMap;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
public interface OfferService {
    boolean addOffer(Offer offer);
    boolean update(Offer offer);
    List<Offer> getAllOffer();
    Offer getOfferByDeId(int de_id);
    List<Offer> getOfferByUserId(int user_id);
    List<Offer> getOfferByUserIdAndLimit(int user_id,int currentPage, int pageSize);
    List<Offer> getOfferByUserIdAndState(int user_id,int state);
    List<Offer> getOfferByUserIdAndStateAndLimit(int user_id,int state,int currentPage, int pageSize);
}
