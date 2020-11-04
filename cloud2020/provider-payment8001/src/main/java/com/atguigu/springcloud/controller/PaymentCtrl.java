package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:PaymentCtrl
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/4 14:49
 */
@Api(tags = "支付Ctrl")
@RestController
@RequestMapping("create")
public class PaymentCtrl {
    @Resource
    PaymentService paymentService;

    @ApiOperation(value = "1. 测试插入")
    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }
}
