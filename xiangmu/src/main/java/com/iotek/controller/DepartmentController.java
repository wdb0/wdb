package com.iotek.controller;

import com.iotek.model.Department;
import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping("addDp")
    private String addDp(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String department=request.getParameter("department");
        Department d=departmentService.getDepartmentByName(department);
        if(d==null) {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Department department1 = new Department(department, df.format(new Date()), 0);
            departmentService.addDepartment(department1);
            return "redirect:/manjob";
        }else{
            request.setAttribute("dp", "已有该部门");
            return "adddp";
        }
    }
}
