package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.model.Job;
import com.iotek.model.Staff;
import com.iotek.service.DepartmentService;
import com.iotek.service.JobService;
import com.iotek.service.StaffService;
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
    private StaffService staffService;
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
    @RequestMapping("/manjob")
    private String managejob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Job> jobs=jobService.getAllJob();
        List<Department> departments=departmentService.getAllDepartment();
        session.setAttribute("deps",departments);
        session.setAttribute("jbs",jobs);
        return "managejob";
    }
    @RequestMapping("checkjob")
    private String checkjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        List<Department> departments=departmentService.getAllDepartment();
        session.setAttribute("depts",departments);
        return "addjob";
    }
    @RequestMapping("adjob")
    private void adjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int dp_id=Integer.parseInt(request.getParameter("dp_id"));
        String job_name=request.getParameter("job_name");
        Job j=jobService.getJobByDpidAndName(dp_id,job_name);
        if(j==null) {
            Job job = new Job(job_name, dp_id, 0);
            if (jobService.addJob(job)) {
                response.getWriter().write("成功");
            } else {
                response.getWriter().write("失败");
            }
        }else{
            response.getWriter().write("该部门已有该职位");
        }
    }
    @RequestMapping("deljob")
    private String deljob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int job_id=Integer.parseInt(request.getParameter("jobid"));
        Job job=jobService.getJobByID(job_id);
        if(job.getJob_num()==0){
            jobService.delJob(job_id);
            return "redirect:/manjob";
        }else{
            request.setAttribute("managejob", "部门人数不为零无法删除");
            return "managejob";
        }
    }
    @RequestMapping("upjob")
    private String upjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int job_id=Integer.parseInt(request.getParameter("jobid"));
        Job job=jobService.getJobByID(job_id);
        Department department=departmentService.getDepartmentById(job.getJob_dp_id());
        if(job.getJob_num()!=0){
            request.setAttribute("managejob", "部门中有在职员工，无法修改");
            return "managejob";
        }else{
            session.setAttribute("upjobdp",department);
            session.setAttribute("upjob",job);
            return "updatejob";
        }
    }
    @RequestMapping("updajob")
    private String updajob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int job_id=Integer.parseInt(request.getParameter("jobid"));
        String job_name=request.getParameter("job_name");
        Job job=jobService.getJobByID(job_id);
        job.setJob_name(job_name);
        jobService.updateJob(job);
        return "redirect:/manjob";
    }
    @RequestMapping("updatestaffjob")
    private String updatestaffjob(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int sf_id=Integer.parseInt(request.getParameter("sf_id"));
        Staff staff=staffService.getStaffById(sf_id);
        session.setAttribute("staff_job",staff);
        List<Job> jobs=jobService.getAllJob();
        List<Department> departments=departmentService.getAllDepartment();
        System.out.println(departments);
        session.setAttribute("dp",departments);
        session.setAttribute("job",jobs);
        return "upsfjob";
    }
}
