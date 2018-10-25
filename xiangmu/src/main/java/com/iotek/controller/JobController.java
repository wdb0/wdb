package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.model.Job;
import com.iotek.service.DepartmentService;
import com.iotek.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Controller
public class JobController {
    @Resource
    private JobService jobService;
    @Resource
    private DepartmentService departmentService;
    @RequestMapping("getjob")
    private  @ResponseBody List getjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int dp_id=Integer.parseInt(request.getParameter("dp_id"));
        List<Job> jobs=jobService.getJobByDpid(dp_id);
        return jobs;
    }
    @RequestMapping("/managejob")
    public String managejob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Job> jobs=jobService.getAllJob();
        List<Department> departments=departmentService.getAllDepartment();
        session.setAttribute("deps",departments);
        session.setAttribute("jbs",jobs);
        return "managejob";
    }
}
