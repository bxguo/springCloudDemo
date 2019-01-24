package com.zysl.eurekademo.service;


import com.zysl.eurekademo.service.impl.TestServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-producer2", fallback = TestServiceImpl.class)
public interface TestService {

    @RequestMapping("testHello")
    public String index2(@RequestParam(value = "name") String name);
}
