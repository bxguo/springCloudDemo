package com.zysl.spring.service.impl;

import com.zysl.spring.service.TestService;
import org.springframework.stereotype.Component;

/**
 * 熔断器
 * @author: bxguo
 * @time: 2019/1/24 11:19
 */
@Component
public class TestServiceImpl implements TestService {

    @Override
    public String index(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
