package com.cqupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testcontroller {
    @ResponseBody
    @RequestMapping("/test1")
    public String test1(){
        return "test1";
    }
}
