package com.hc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test_Controller {
    @RequestMapping("/account/findAll")
    public String findALl(){
        System.out.println("Controller:查询所有账户");
        return "list";
    }

}
