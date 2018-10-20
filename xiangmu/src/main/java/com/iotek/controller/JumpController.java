package com.iotek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by WDB1 on 2018/10/19.
 */
@Controller
public class JumpController {
    @RequestMapping("/register1")
    public String main()throws Exception{
        return "register";
    }
}
