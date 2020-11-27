package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component  //希望被spring扫描到
@FeignClient(value = "nacos-payment-provider")
public interface PaymentFeignService {

    @GetMapping(value = "/PaymentCtrl/payment/nacos/{id}")
    String getPayment(Integer id);

}
