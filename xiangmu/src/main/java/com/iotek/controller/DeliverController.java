package com.iotek.controller;

import com.iotek.model.Deliver;
import com.iotek.model.User;
import com.iotek.service.DeliverService;
import com.iotek.service.ResumeService;
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
    private ResumeService resumeService;
    @RequestMapping("adddeliver")
    private String adddeliver(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        User user= (User) session.getAttribute("u");
        if (resumeService.getResumeByUid(user.getUser_id())!=null){
            int ad_id=Integer.parseInt(request.getParameter("ad_id"));
            Deliver deliver=new Deliver(user.getUser_id(),ad_id,0);
            if(deliverService.addDeliver(deliver)){
                return "pagingdeliver?currentPage=1";
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
        return "deliverview";
    }
}
