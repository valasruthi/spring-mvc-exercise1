package com.stackroute.controller;

import com.stackroute.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class UserController {
@RequestMapping("/")
    public String greeting(ModelMap map){
    User user=new User();
    user.setName("sruthi");
    map.addAttribute("name",user);
    return "index";
  }

}
