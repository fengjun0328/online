package cn.bdqn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.Date;

@Controller
public class IndexController {
    public String getTime(Model model){
        model.addAttribute("time",new Date());
        return "index";
    }

}
