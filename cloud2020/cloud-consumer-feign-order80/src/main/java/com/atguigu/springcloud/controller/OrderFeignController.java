package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:OrderFeignController
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/26 14:33
 */
@Api(tags = "feign消费者Ctrl")
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    PaymentFeignService paymentFeignService;

    @ApiOperation(value = "2. 根据id查询")
    @PostMapping("consumer/payment/get")
    public CommonResult<Payment> getPaymentById(@RequestBody Payment payment){
        return paymentFeignService.queryById(payment);
    }
}
