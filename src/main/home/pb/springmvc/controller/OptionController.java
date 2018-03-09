package home.pb.springmvc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class OptionController {

    @RequestMapping(value = "/list.do", method = RequestMethod.GET)
    public String list() {
        System.out.println("------查询用户信息-------");
        return "list";
    }

    @RequestMapping(value = "/add.do", method = RequestMethod.POST)
    public String add(String username, Model model) {
        System.out.println("------添加用户信息-------");
        System.out.println("======" + username + "=========");
        model.addAttribute("username", username);
        return "add";
    }

    @RequestMapping(value = "/update.do")
    public String update() {
        System.out.println("-----修改用户信息------");
        return "update";
    }

    @RequestMapping(value = "/add1.do")
    public String add1(HttpServletRequest request) {
        String userid = request.getParameter("userid");
        String username = request.getParameter("username");
        String usertime = request.getParameter("usertime");
        request.setAttribute("userid", userid);
        request.setAttribute("username", username);
        request.setAttribute("usertime", usertime);
        request.setAttribute("submittype", "HttpServletRequest");
        System.out.println("HttpServletRequest:" + " userid:" + userid + " username:" + username + " usertime:" + usertime + " submittype:" + "HttpServletRequest");
        return "add";
    }

    @RequestMapping(value = "/add2.do")
    public ModelAndView add2(String userid, String username, String usertime) {
        ModelAndView mav = new ModelAndView("add");
        mav.addObject("userid", userid);
        mav.addObject("username", username);
        mav.addObject("usertime", usertime);
        mav.addObject("submittype", "ModelAndView");
        System.out.println("ModelAndView :" + " userid:" + userid + " username:" + username + " usertime:" + usertime + " submittype:" + "ModelAndView");
        return mav;
    }
    @RequestMapping(value = "/add3.do")
    public String add3(@RequestParam(value = "userid") String id, @RequestParam(value = "username") String name, @RequestParam(value = "usertime") String time,Model model) {
        model.addAttribute("userid",id);
        model.addAttribute("username",name);
        model.addAttribute("usertime",time);
        model.addAttribute("submittype","Model");
        System.out.println("Model:" + " userid:" + id + " username:" + name + " usertime:" + time + " submittype:" + "Model");
        return "add";
    }
    @RequestMapping(value = "/add4.do")
    public String add4(@RequestParam(value = "userid") String id, @RequestParam(value = "username") String name, @RequestParam(value = "usertime") String time,Map map){
        map.put("userid",id);
        map.put("username",name);
        map.put("usertime",time);
        map.put("submittype","Map");
        System.out.println("Map:" + " userid:" + id + " username:" + name + " usertime:" + time + " submittype:" + "Map");
        return "add";
    }

    @InitBinder
    public void initBinfer(ServletRequestDataBinder request) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        CustomDateEditor cust = new CustomDateEditor(sdf, true);
        request.registerCustomEditor(Date.class, cust);
    }
}
