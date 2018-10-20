package com.iotek.controller;

import com.iotek.model.Ad;
import com.iotek.service.AdService;
import com.iotek.utils.DoPage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by WDB1 on 2018/10/20.
 */
@Controller
public class AdController {
    private final int PAGESIZE=5;
    @Resource
    private AdService adService;
    @RequestMapping("pagingad")
    private String pagingad(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int currentPage = Integer.parseInt(request.getParameter("currentPage"));
        int totalRows = adService.getAdByState(1).size();
        int totalPages = DoPage.getTotalPages(totalRows);
        List<Ad> goods = adService.getAdByLimitAndState(1,currentPage,PAGESIZE);
        session.setAttribute("ads",goods);
        session.setAttribute("totalPages",totalPages);
        return "ad";
    }
    @RequestMapping("viewad")
    private String viewad(HttpServletRequest request, HttpSession session, HttpServletResponse response)throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        int adid=Integer.parseInt(request.getParameter("adid"));
        Ad ad=adService.getAdById(adid);
        session.setAttribute("ad",ad);
        return "adview";
    }
}
