package cn.bdqn.controller;

import cn.bdqn.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.jws.WebParam;

@Controller
@RequestMapping("/contact")
public class ContactController  {

    @Resource
    private ContactService contactService;


    @RequestMapping("/load.html")
    public String load(@RequestParam(value = "currNo",defaultValue = "1") Integer currNo,
                       @RequestParam(value = "cname",required = false ) String cname,
                       Model model){
        model.addAttribute("contacts",contactService.findContacts(cname,currNo,2));
        int count=contactService.count(cname);
        System.out.println("=============>"+count);
        model.addAttribute("count",(count%2==0?count/2:count/2+1));
        model.addAttribute("cname",cname);
        model.addAttribute("currNo",currNo);
        return  "index";
    }
}
