package cn.xtrui.mbp.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author tianrui
 * @since 2019-07-11
 */
@Controller
public class BooksController {
    @RequestMapping("/book")
    @ResponseBody
    public String red(HttpServletRequest request, HttpServletResponse response){

        System.out.println(request.getServletPath());
        //response.setStatus(404);
        try {
            response.sendRedirect("http://xtrui.cn");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "hello";
    }
}

