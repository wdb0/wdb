package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.AdService;
import com.iotek.service.DeliverService;
import com.iotek.service.InterviewService;
import com.iotek.service.OfferService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/20.
 */
@Controller
public class AdController {
    private final int PAGESIZE=5;
    @Resource
    private AdService adService;
    @Resource
    private DeliverService deliverService;
    @Resource
    private InterviewService interviewService;
    @Resource
    private OfferService offerService;
    @RequestMapping("pagingad")
    private String pagingad(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int totalRows = adService.getAdByState(1).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Ad> ads = adService.getAdByLimitAndState(1,currentPage,PAGESIZE);
        User user= (User) session.getAttribute("u");
        List<Deliver> delivers=deliverService.getDeliverByUserId(user.getUser_id());
        List<Interview> interviews=new ArrayList<Interview>();
        for (Deliver d:delivers) {
            int deid=d.getDe_id();
            Interview interview=interviewService.getInterViewBydeid(deid);
            if(interview.getIv_state()==0) {
                interviews.add(interview);
            }
        }
        List<Offer> offers=offerService.getOfferByUserId(user.getUser_id());
        int ofnum=0;
        for (Offer o:offers) {
            if(o.getOf_state()==0){
                ofnum++;
            }
        }
        List<Deliver> ds=deliverService.getAllDeliver();
        session.setAttribute("ds",ds);
        session.setAttribute("ofnum",ofnum);
        session.setAttribute("ivnum",interviews.size());
        session.setAttribute("ads",ads);
        session.setAttribute("totalPages",totalPages);
        return "ad";
    }
    @RequestMapping("viewad")
    private String viewad(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int adid=Integer.parseInt(request.getParameter("adid"));
        Ad ad=adService.getAdById(adid);
        session.setAttribute("ad",ad);
        return "adview";
    }
    @RequestMapping("addada")
    private String addada(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Ad ad=new Ad(request.getParameter("ad_name"),request.getParameter("ad_job"),request.getParameter("ad_company"),request.getParameter("ad_workplace"),
                request.getParameter("ad_money"),df.format(new Date()),request.getParameter("ad_specworkpalce"),request.getParameter("ad_tenure"),
                request.getParameter("ad_duty"),request.getParameter("ad_department"),request.getParameter("ad_compro"),request.getParameter("ad_welfare"),
                0);
        System.out.println(ad);
        adService.addAd(ad);
        return "redirect:/pagingadmad?currentPage=1";
    }
    @RequestMapping("pagingadmad")
    private String pagingadmad(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int totalRows = adService.getAllAd().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Ad> ads = adService.getAdByLimit(currentPage,PAGESIZE);
        session.setAttribute("admada",ads);
        session.setAttribute("totalPages",totalPages);
        return "admad";
    }
    @RequestMapping("admadview")
    private String admadview(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int adid=Integer.parseInt(request.getParameter("adid"));
        Ad ad=adService.getAdById(adid);
        session.setAttribute("adminad",ad);
        return "admadve";
    }
}
