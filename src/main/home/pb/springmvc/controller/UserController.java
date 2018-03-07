package home.pb.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends AbstractController {

    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        System.out.println("---------访问到了UserController----------");

//        String userName = request.getParameter("UserName");
//        System.out.println(userName);
//        ModelAndView mav = new ModelAndView("user","UserName",userName);

        ModelAndView mav = new ModelAndView("user");

        return mav;


    }


}
