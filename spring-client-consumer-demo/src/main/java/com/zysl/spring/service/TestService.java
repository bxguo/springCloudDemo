package com.zysl.spring.service;

import com.zysl.spring.service.impl.TestServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client-producer", fallback = TestServiceImpl.class)
public interface TestService {

    @RequestMapping("testHello")
    public String index(@RequestParam(value="name") String name);
}
