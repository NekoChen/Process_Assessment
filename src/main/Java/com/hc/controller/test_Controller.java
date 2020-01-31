package com.hc.controller;

import com.hc.domain.test_Account;
import com.hc.service.Impl.test_Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class test_Controller {

    @Autowired
    private test_Impl accountService;


    @RequestMapping("/account/findAll")
    public String findALl(Model model){
        System.out.println("Controller:查询所有账户");
        List<test_Account> list = accountService.findAll();
        for (test_Account t:list) {
            System.out.println(t.getName());
        }
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/account/save")
    public void save(test_Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }

}
