package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentFeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:OrderNacosController
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/27 10:05
 */
@Api(tags = "nacos-consumer")
@Slf4j
@RestController
public class OrderNacosController {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    PaymentFeignService paymentFeignService;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @ApiOperation(value = "1. 根据id获取数据-restTemplate")
    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfo(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(serverURL+"/PaymentCtrl/payment/nacos/"+id,String.class);
    }

    @ApiOperation(value = "2. 根据id获取数据-feign")
    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String paymentInfoFeign(@PathVariable("id") Integer id) {
        return paymentFeignService.getPayment(id);
    }
}
