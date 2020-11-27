package com.atguigu.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component  //希望被spring扫描到
@FeignClient(value = "nacos-payment-provider")
public interface PaymentFeignService {

    @GetMapping(value = "/PaymentCtrl/payment/nacos/{id}")
    String getPayment(Integer id);

}
