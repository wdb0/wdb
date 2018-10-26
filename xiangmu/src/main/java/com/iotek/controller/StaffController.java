package com.iotek.controller;

import com.iotek.model.*;
import com.iotek.service.DepartmentService;
import com.iotek.service.JobService;
import com.iotek.service.ResumeService;
import com.iotek.service.StaffService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Controller
public class StaffController {
    private final int PAGESIZE=5;
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
        System.out.println(job);
        department.setDp_num(department.getDp_num()+1);
        System.out.println(department);
        departmentService.updateDepartment(department);
        int money=Integer.parseInt(request.getParameter("money"));
        String view=request.getParameter("view");
        Resume resume=resumeService.getResumeByUid(deliver.getDe_user_id());
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Staff staff=new Staff(resume.getRe_name(),String.valueOf(resume.getRe_phone()),resume.getRe_sex(),resume.getRe_age(),
                resume.getRe_phone(),resume.getRe_email(),dp_id,job_id,money,0,resume.getRe_hometown(),df.format(new Date()));
        System.out.println(staff);
        boolean res=staffService.addStaff(staff);
        session.setAttribute("admstaff",staff);
        session.setAttribute("staffview",view);
        response.getWriter().write(res+"");
    }
    @RequestMapping("loginstaff")
    private String loginstaff(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String sf_name=request.getParameter("sf_name");
        String sf_pass=request.getParameter("sf_pass");
        Staff staff=staffService.getStaffByNameAndPass(sf_name,sf_pass);
        if (staff!=null){
            session.setAttribute("stf",staff);
            return "staffinfo";
        }else {
            return "../../index";
        }
    }
    @RequestMapping("pagingstaff")
    private String adminstaff(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws  Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int totalRows = staffService.getAllStaff().size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Staff> staffs = staffService.getStaffByLimit(currentPage,PAGESIZE);
        List<Job> jobs=jobService.getAllJob();
        List<Department> departments=departmentService.getAllDepartment();
        session.setAttribute("admindp",departments);
        session.setAttribute("adminjob",jobs);
        session.setAttribute("admstaffs",staffs);
        session.setAttribute("totalPages",totalPages);
        return "admstaff";
    }
    @RequestMapping("upstaffjob")
    private void upstaffjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int dp_id=Integer.parseInt(request.getParameter("dp_id"));
        int jon_id=Integer.parseInt(request.getParameter("job_id"));
        Staff staff= (Staff) session.getAttribute("staff_job");;
        staff.setSf_dp_id(dp_id);
        staff.setSf_job_id(jon_id);
        if (staffService.updtaeStaff(staff)) {
            response.getWriter().write("成功");
        } else {
            response.getWriter().write("失败");
        }
    }
}
