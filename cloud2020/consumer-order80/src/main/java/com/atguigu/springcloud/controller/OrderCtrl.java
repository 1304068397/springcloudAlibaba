package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:OrderCtrl
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Dat20/11/5 10:08
 */
@Api(tags = "消费者Ctrl")
@RestController
@Slf4j
@RequestMapping("OrderCtrl")
public class OrderCtrl {

    public static final String PAYMENT_URL="http://localhost:8001";
    //注入对象并实例化
    @Resource
    private RestTemplate restTemplate;

    //一般请求 读操作用get  写操作用post
    @ApiOperation(value = "1. 新增编辑")
    @PostMapping("createOrUpdate")
    public CommonResult<Payment> createOrUpdate(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/PaymentCtrl/createOrUpdate",payment,CommonResult.class);
    }

    @ApiOperation(value = "2. 根据id查询")
    @PostMapping("queryById")
    public CommonResult<Payment> queryById(@RequestBody Payment payment){
        log.info(payment.toString());
        return restTemplate.postForObject(PAYMENT_URL+"/PaymentCtrl/queryById",payment,CommonResult.class);
    }

}
