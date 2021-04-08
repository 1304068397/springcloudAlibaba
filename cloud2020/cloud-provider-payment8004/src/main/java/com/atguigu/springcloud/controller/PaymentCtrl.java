package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:PaymentCtrl
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 23:00
 */
@RestController
@Slf4j
public class PaymentCtrl {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/zk")
    public String paymentzk(){
        return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }

    @GetMapping("/payment/get/{id}")
    public String get(@PathVariable("id") Integer id){
        return "get:"+id;
    }

    @GetMapping("/payment/lb")
    public String lb(){
        return serverPort+"lb(:"+new Date();
    }

}
