package com.iotek.controller;

import com.iotek.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by WDB1 on 2018/10/25.
 */
@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    /*@RequestMapping("")
    private String */
}
