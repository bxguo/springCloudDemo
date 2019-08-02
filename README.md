# springCloudDemo
springBoot+springCloud

# 
### springCloud
                
#### Eureka注册服务与发现 
  + 注册中心（spring-eureka-server-demo）：http://localhost:1111
  + 生产者（springBootDemo）：http://localhost:1112
  + 消费者（spring-client-consumer-demo）：http://localhost:1113
#### 熔断监控Hystrix Dashboard和Turbine
  + 监控中心（spring-hystrix-dashboard-turbine）
    + 主面板：http://localhost:8008/hystrix
    + 显示面板：http://localhost:8008/hystrix.stream
  + 监控节点1（spring-consumer-node1）：http://localhost:9001
  + 监控节点2（spring-consumer-node2）：http://localhost:9002
#### 配置中心（利用spring cloud bus 和 mq 实现自动刷新） git config
  + 配置提供服务（spring-config-server）
    + 环境要求：rabbitmq、git仓库有对应的配置文件
    + 手动刷新：curl -X POST http://localhost:8002/refresh
    + 属性文件查看: http://localhost:8001/bxguo/bxguo-config-dev.properties
  + 配置消费服务（spring-config-client）：http://localhost:8002/datasource
#### 客户端负载均衡（ribbon） 
  + spring-ribbon-producer 1 2 3（http://localhost:8081、http://localhost:8082、http://localhost:803）
  + spring-ribbon-consumer http://localhost:80

> Follow your heart.

![](https://pandao.github.io/editor.md/examples/images/8.jpg)

