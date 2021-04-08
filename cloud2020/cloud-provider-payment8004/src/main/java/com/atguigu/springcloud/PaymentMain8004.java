package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:PaymentMain8004
 * @Description: Zookeeper注册中心
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 21:06
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
