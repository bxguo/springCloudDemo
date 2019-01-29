package com.zysl.demo.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;
    @RequestMapping("testHello")
    public String index(@RequestParam String name){
        return "Hello:"+name;
    }
}
