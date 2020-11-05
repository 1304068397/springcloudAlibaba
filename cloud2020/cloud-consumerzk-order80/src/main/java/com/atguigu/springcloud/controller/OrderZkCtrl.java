package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:OrderZkCtrl
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 23:31
 */
@RestController
@Slf4j
public class OrderZkCtrl {
    private final String Invoke_Url = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("consumer/payment/zk")
    public String getString(){
        String forObject = restTemplate.getForObject(Invoke_Url + "/payment/zk", String.class);
        return forObject;
    }
}
