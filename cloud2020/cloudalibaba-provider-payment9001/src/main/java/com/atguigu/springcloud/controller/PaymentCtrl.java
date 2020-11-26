package com.atguigu.springcloud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:PaymentController
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/26 17:11
 */
@Api(tags = "nacos-服务端9001")
@Slf4j
@RestController
@RequestMapping("PaymentCtrl")
public class PaymentCtrl {

    @Value("${server.port}")
    private String serverPort;

    @ApiOperation(value = "1. 服务发现")
    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id)
    {
        return "nacos registry, serverPort: "+ serverPort+"\t id："+id;
    }


}
