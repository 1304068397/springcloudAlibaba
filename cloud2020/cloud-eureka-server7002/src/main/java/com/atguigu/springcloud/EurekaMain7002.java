package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:EurekaMain7001
 * @Description: EurekaServer服务注册
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 12:44
 */
@EnableEurekaServer  //表明自己是EurekaServer服务注册
@SpringBootApplication
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
