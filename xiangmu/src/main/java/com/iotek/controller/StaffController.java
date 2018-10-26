package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.DepartmentService;
import com.iotek.service.JobService;
import com.iotek.service.ResumeService;
import com.iotek.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private DepartmentService departmentService;
    @Resource
    private JobService jobService;
    @RequestMapping("addstaff")
    private void addstaff(HttpServletRequest request, HttpSession session, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Deliver deliver= (Deliver) session.getAttribute("admde");
        int dp_id=Integer.parseInt(request.getParameter("dp_id"));
        int job_id=Integer.parseInt(request.getParameter("job_id"));
        Job job=jobService.getJobByID(job_id);
        Department department=departmentService.getDepartmentById(dp_id);
        job.setJob_num(job.getJob_num()+1);
        jobService.updateJob(job);
        department.setDp_num(department.getDp_num()+1);
        departmentService.updateDepartment(department);
        int money=Integer.parseInt(request.getParameter("money"));
        String view=request.getParameter("view");
        Resume resume=resumeService.getResumeByUid(deliver.getDe_user_id());
        Staff staff=new Staff(resume.getRe_name(),String.valueOf(resume.getRe_phone()),resume.getRe_sex(),resume.getRe_age(),
                resume.getRe_phone(),resume.getRe_email(),dp_id,job_id,money,0,resume.getRe_hometown());
        boolean res=staffService.addStaff(staff);
        session.setAttribute("admstaff",staff);
        session.setAttribute("staffview",view);
        response.getWriter().write(res+"");
    }
}
