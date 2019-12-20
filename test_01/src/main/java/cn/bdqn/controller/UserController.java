package cn.bdqn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/getUser.html")
    @ResponseBody
    public List<String> getUser(){
        List<String> lists=new ArrayList<>();
        lists.add("张三");
        lists.add("张三1");
        lists.add("张三2");
        return lists;
    }
}
