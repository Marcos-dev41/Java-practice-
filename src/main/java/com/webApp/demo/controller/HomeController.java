package com.webApp.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String greet(){
        return "Hello home";
    }
    @RequestMapping("/about")
    public String aboutPagePage(){
        return " we educate";
    }
}
