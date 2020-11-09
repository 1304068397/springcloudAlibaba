package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:OrderConsulMain80
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/9 23:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
