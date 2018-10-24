package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.DeliverService;
import com.iotek.service.InterviewService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/23.
 */
@Controller
public class InterviewController {
    private final int PAGESIZE=5;
    @Resource
    private InterviewService interviewService;
    @Resource
    private DeliverService deliverService;
    @RequestMapping("addiv")
    private String addinterview(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Deliver deliver= (Deliver) session.getAttribute("admde");
        return "redirect:/pagingadmdeliver?currentPage=1";
    }
    @RequestMapping("paginginterview")
    private String paginginterview(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        User user= (User) session.getAttribute("u");
        int totalRows =interviewService.getInterviewByUserId(user.getUser_id()).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Interview> interviews =interviewService.getInterviewByUserIdAndLimit(user.getUser_id(),currentPage,PAGESIZE);
        session.setAttribute("interviews",interviews);
        session.setAttribute("totalPages",totalPages);
        return "message";
    }
    @RequestMapping("pagingnewinterview")
    private String pagingnewinterview(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        User user= (User) session.getAttribute("u");
        int totalRows =interviewService.getInterviewByUserIdANdState(user.getUser_id(),0).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Interview> interviews =interviewService.getInterviewByUserIdANdStateAndLimit(user.getUser_id(),0,currentPage,PAGESIZE);
        for (Interview i:interviews) {
            i.setIv_state(1);
            interviewService.updateInterview(i);
        }
        session.setAttribute("interviews",interviews);
        session.setAttribute("totalPages",totalPages);
        return "message";
    }
}
