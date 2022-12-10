package org.example.springboot.controller;

import org.example.springboot.service.SeptemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author WongFaaCoi
 * @project GitTest
 * @user 黄花菜
 * @date 2022年12月10日 23:06:58
 */
@Controller
public class SeptemberController {
    @Resource
    private SeptemberService septemberService;

    @RequestMapping("/methodSeptemberController")
    public void methodSeptemberController(){
        System.out.println("methodSeptemberController");
        septemberService.methodSeptemberService();
    }
}
