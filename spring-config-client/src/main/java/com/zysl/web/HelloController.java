package com.zysl.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 同步配置中心
class HelloController {

    @Value("${spring.datasource.url}")
    private String datasource;

    @RequestMapping("/datasource")
    public String from() {
        return this.datasource;
    }
}