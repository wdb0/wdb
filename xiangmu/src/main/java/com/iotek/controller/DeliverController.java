package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.*;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/22.
 */
@Controller
public class DeliverController {
    private final int PAGESIZE=5;
    @Resource
    private DeliverService deliverService;
    @Resource
    private OfferService offerService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private InterviewService interviewService;
    @Resource
    private AdService adService;
    @RequestMapping("adddeliver")
    private String adddeliver(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        User user= (User) session.getAttribute("u");
        if (resumeService.getResumeByUid(user.getUser_id())!=null){
            int ad_id=Integer.parseInt(request.getParameter("ad_id"));
            Deliver deliver=new Deliver(user.getUser_id(),ad_id,0);
            if(deliverService.addDeliver(deliver)){
                return "redirect:/pagingdeliver?currentPage=1";
            }else {
                request.setAttribute("updeliver", "申请失败");
                return "adview";
            }
        }else{
            request.setAttribute("faildeliver", "请先添加简历");
            return "addresume";
        }
    }
    @RequestMapping("pagingdeliver")
    private String pagingdeliver(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        User user= (User) session.getAttribute("u");
        int totalRows =deliverService.getDeliverByUserId(user.getUser_id()).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Deliver> delivers = deliverService.getDeliverByUserIdAndLimit(user.getUser_id(),currentPage,PAGESIZE);
        session.setAttribute("delivers",delivers);
        session.setAttribute("totalPages",totalPages);
        List<Ad> ads=adService.getAllAd();
        session.setAttribute("deads",ads);
        return "deliverview";
    }
    @RequestMapping("showdeliver")
    private String showdeliver(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int de_id=Integer.parseInt(request.getParameter("deliverid"));
        Deliver deliver=deliverService.getDeliverById(de_id);
        Ad ad=adService.getAdById(deliver.getDe_ad_id());
        session.setAttribute("dad",ad);
        return "deliverinfo";
    }
    @RequestMapping("pagingadmdeliver")
    private String pagingadmdeliver(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int totalRows =deliverService.getAllDeliver().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Deliver> delivers = deliverService.getDeliverByLimit(currentPage,PAGESIZE);
        session.setAttribute("admdelivers",delivers);
        session.setAttribute("totalPages",totalPages);
        List<Ad> ads=adService.getAllAd();
        session.setAttribute("admads",ads);
        List<Resume> resumes=resumeService.getAllResume();
        session.setAttribute("admresumes",resumes);
        return "admdeliver";
    }
    @RequestMapping("admdeview")
    private String admdeview(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int ad_id=Integer.parseInt(request.getParameter("admad_id"));
        int re_id=Integer.parseInt(request.getParameter("admre_id"));
        int de_id=Integer.parseInt(request.getParameter("admde_id"));
        Deliver deliver=deliverService.getDeliverById(de_id);
        deliver.setDe_state(1);
        deliverService.updateDeliver(deliver);
        Ad ad=adService.getAdById(ad_id);
        Resume resume=resumeService.getResumeById(re_id);
        Interview interview=interviewService.getInterViewBydeid(de_id);
        Offer offer=offerService.getOfferByDeId(de_id);
        session.setAttribute("admof",offer);
        session.setAttribute("admiv",interview);
        session.setAttribute("admde",deliver);
        session.setAttribute("admad",ad);
        session.setAttribute("admre",resume);
        return "admdeliverview";
    }
}
