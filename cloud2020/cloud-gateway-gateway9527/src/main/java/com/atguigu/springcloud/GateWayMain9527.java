package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 确实是冲突导致的这个错误，但是！不仅仅是spring-boot-starter-web包才会冲突。所以我删除这个Maven依赖并没有解决问题。
 *
 * 只保留gateway和eureka依赖不会冲突
 *
 * @author 13040
 * @date 2021/04/08
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run( GateWayMain9527.class,args);
    }
}
