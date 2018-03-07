package home.pb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/user")
public class OptionController {

    @RequestMapping(value = "/list.do",method = RequestMethod.GET)
    public String list(){
        System.out.println("------查询用户信息-------");
        return "list";
    }
    @RequestMapping(value = "/add.do",method = RequestMethod.GET)
    public String add(){
        System.out.println("------添加用户信息-------");
        return "add";
    }
    @RequestMapping(value = "/update.do")
    public String update(){
        System.out.println("-----修改用户信息------");
        return "update";
    }
}
