package com.zysl.eurekademo.controller;


import com.zysl.eurekademo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/node1/*")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("{name}")
    public String index(@PathVariable("name") String name){
        return testService.index(name);
    }

}
