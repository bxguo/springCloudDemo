package com.zysl.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("hello/{name}")
	public String get(@PathVariable("name") String name) throws Exception {
	    // 使用 Eureka + Ribbon 后，uri 填写服务名称即可
		return restTemplate.getForObject("http://SPRING-RIBBON-PRODUCER/hello/?name="+name, String.class);
	}
	
}
