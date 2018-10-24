package com.iotek.controller;

import com.iotek.model.Ad;
import com.iotek.model.Deliver;
import com.iotek.model.Interview;
import com.iotek.model.User;
import com.iotek.service.AdService;
import com.iotek.service.DeliverService;
import com.iotek.service.InterviewService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
}
