package com.iotek.controller;

import com.iotek.model.Resume;
import com.iotek.model.User;
import com.iotek.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by WDB1 on 2018/10/19.
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("showresume")
    private String showresume(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        User user= (User) session.getAttribute("u");
        Resume resume=resumeService.getResumeByUid(user.getUser_id());
        if(resume!=null){
            session.setAttribute("resume",resume);
            return "resume";
        }else{
            return "addresume";
        }
    }
    @RequestMapping("addres")
    private String addres(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        User user= (User) session.getAttribute("u");
        Resume resume=new Resume(request.getParameter("re_name"),request.getParameter("re_sex"),Integer.parseInt(request.getParameter("re_age")),
                request.getParameter("re_nation"),request.getParameter("re_hometown"),request.getParameter("re_marry"),
                request.getParameter("re_polity"),request.getParameter("re_major"),request.getParameter("re_school"),
                Integer.parseInt(request.getParameter("re_phone")),request.getParameter("re_addr"),Integer.parseInt(request.getParameter("re_post")),
                request.getParameter("re_email"),request.getParameter("re_sop"),request.getParameter("re_edubg"),
                request.getParameter("re_sel"),user.getUser_id());
        if(resumeService.addResume(resume)){
            return "redirect:/showresume";
        }else{
            request.setAttribute("addresu", "保存失败");
            return "addresume";
        }
    }
}
