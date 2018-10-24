package com.iotek.controller;

import com.iotek.model.Deliver;
import com.iotek.model.Offer;
import com.iotek.model.User;
import com.iotek.service.OfferService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/24.
 */
@Controller
public class OfferController {
    private final int PAGESIZE=5;
    @Resource
    private OfferService offerService;
    @RequestMapping("addof")
    private String addoffer(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String view=request.getParameter("view");
        Deliver deliver= (Deliver) session.getAttribute("admde");
        Offer offer=new Offer(view,deliver.getDe_user_id(),0,deliver.getDe_id());
        offerService.addOffer(offer);
        return "redirect:/pagingadmdeliver?currentPage=1";
    }
    @RequestMapping("pagingoffer")
    private String pagingoffer(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws  Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        User user= (User) session.getAttribute("u");
        int totalRows =offerService.getOfferByUserId(user.getUser_id()).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Offer> offers =offerService.getOfferByUserIdAndLimit(user.getUser_id(),currentPage,PAGESIZE);
        session.setAttribute("offers",offers);
        session.setAttribute("totalPages",totalPages);
        return "offer";
    }
    @RequestMapping("pagingnewoffer")
    private String pagingnewoffer(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws  Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        User user= (User) session.getAttribute("u");
        int totalRows =offerService.getOfferByUserIdAndState(user.getUser_id(),0).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Offer> offers =offerService.getOfferByUserIdAndStateAndLimit(user.getUser_id(),0,currentPage,PAGESIZE);
        for(Offer o:offers){
            o.setOf_state(1);
            offerService.update(o);
        }
        session.setAttribute("newoffers",offers);
        session.setAttribute("totalPages",totalPages);
        return "newoffer";
    }
}
