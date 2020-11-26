package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName:com.atguigu.springcloud
 * @ClassName:OrderFeignMain80
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/26 13:41
 */
@SpringBootApplication
@EnableFeignClients  //使用feign激活并开启
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
