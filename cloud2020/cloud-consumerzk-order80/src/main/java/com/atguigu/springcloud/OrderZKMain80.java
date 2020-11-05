package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:OrderZKMain80
 * @Description: Zookeeper消费者
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 23:26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain80.class,args);
    }
}
