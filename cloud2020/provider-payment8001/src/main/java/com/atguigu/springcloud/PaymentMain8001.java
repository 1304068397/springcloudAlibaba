package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:PaymentMain8001
 * @Description: 服务提供者
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/4 13:32
 */
@EnableEurekaClient     //Eureka提供者
@SpringBootApplication
@EnableDiscoveryClient  //服务发现，提供服务的ip+端口
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
