package com.zysl.ribbon.configuration;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestConfiguration {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule testRule() {
	    //return new RoundRobinRule();//轮询（默认）
	    //return new AvailabilityFilteringRule();//轮询除去熔断的服务
	    //return new WeightedResponseTimeRule();//根据响应时间
	    //return new BestAvailableRule();//并发量小的
	    //return new ZoneAvoidanceRule();//并发量小的
	    return new RandomRule();//随机
	}
}
