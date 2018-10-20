package com.iotek.controller;

import com.iotek.model.User;
import com.iotek.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by WDB1 on 2018/10/19.
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    //登陆
    @RequestMapping("/AutoLoginServlet")
    public String AutoLoginServlet(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("user");
        String pass = request.getParameter("password");
        String log =request.getParameter("log");
        User u=new User(name,pass);
        if (userService.getUserByNameAndPass(u)!=null){
            User user=userService.getUserByNameAndPass(u);
            session.setAttribute("name",name);
            session.setAttribute("pass",pass);
            session.setAttribute("u",user);
            if ("on".equals(log)){
                Cookie cookie = new Cookie("name",name);
                Cookie cookie1 = new Cookie("pass",pass);
                cookie.setMaxAge(60*60*24*365);
                cookie1.setMaxAge(60*60*24*365);
                response.addCookie(cookie);
                response.addCookie(cookie1);
            }
            return "ad";
        }else {
            return "../../index";
        }
    }
    //自动登陆
    @RequestMapping("/CheckServlet")
    public String CheckServlet(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        Cookie[] cookies = request.getCookies();
        String username=null;
        String userpass=null;
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            if(name.equals("name")){
                username=value;
            }else if(name.equals("pass")){
                userpass=value;
            }
        }
        User u=new User(username,userpass);
        if (userService.getUserByNameAndPass(u)!=null){
                User user=userService.getUserByNameAndPass(u);
                session.setAttribute("u",user);
                session.setAttribute("name",username);
                session.setAttribute("pass",userpass);
                return "ad";
        }else {
            return "../../index";
        }
    }
    @RequestMapping("/RegisterServlet")
    public String RegisterServlet(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        if (request.getParameter("password").equals(request.getParameter("password1"))) {
            User user = new User(request.getParameter("user"), request.getParameter("password"));
            if (userService.addUser(user)) {
                request.setAttribute("log", "注册成功");
                return "../../index";
            } else {
                request.setAttribute("reg", "注册失败");
                return "register";
            }
        } else {
            request.setAttribute("reg", "两次密码错误");
            return "register";
        }
    }
        @RequestMapping("/check")
        public void check(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            String name=request.getParameter("user");
            if(name!="") {
                User u=new User(name);
                User user = userService.getUserByName(u);
                if (user.getUser_name() == null) {
                    response.getWriter().write("可以注册");
                } else {
                    response.getWriter().write("用户名重复");
                }
            }else{
                response.getWriter().write("用户名为空");
            }
        }
    }
