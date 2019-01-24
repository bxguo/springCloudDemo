package com.zysl.spring.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eureka-client-producer")
public interface TestService {

    @RequestMapping("testHello")
    public String index(@RequestParam(value="name") String name);
}
