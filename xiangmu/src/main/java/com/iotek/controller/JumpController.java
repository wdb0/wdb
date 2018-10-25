package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by WDB1 on 2018/10/19.
 */
@Controller
public class JumpController {
    @RequestMapping("/register1")
    public String register1()throws Exception{
        return "register";
    }
    @RequestMapping("/updateres")
    public String updateres()throws Exception{
        return "updateres";
    }
    @RequestMapping("/adminjsp")
    public String admin()throws Exception{
        return "admin";
    }
    @RequestMapping("/addinterview")
    public String addinterview()throws Exception{
        return "addinterview";
    }
    @RequestMapping("/addad")
    public String addad()throws Exception{
        return "addad";
    }
    @RequestMapping("/upad")
    public String upad()throws Exception{
        return "upad";
    }
}
