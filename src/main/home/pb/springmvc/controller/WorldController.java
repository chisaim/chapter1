package home.pb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WorldController {

    @RequestMapping(value = "/world.do")
    public String world(String world, Model model){

        model.addAttribute("helloworld","hello:" + world);
        System.out.println(world);

        return "success";
    }
}
