package com.zysl.spring.controller;

import com.zysl.spring.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("testHello/{name}")
    public String index(@PathVariable("name") String name){
        return testService.index(name);
    }

}
