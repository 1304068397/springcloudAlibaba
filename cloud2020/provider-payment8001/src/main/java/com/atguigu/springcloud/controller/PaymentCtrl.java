package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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
@RequestMapping("PaymentCtrl")
@Slf4j
public class PaymentCtrl {
    @Resource
    PaymentService paymentService;

    @Value("${server.port}")  //从application配置文件读取server.port的value
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @ApiOperation(value = "1. 服务发现")
    @PostMapping("discovery")
    public Object discovery(){
        //所有微服务
        List<String> services = discoveryClient.getServices();
        log.info(services.toString());
        //一个微服务下的所有实例（集群）
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        //return services;
        for (ServiceInstance instance:instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @ApiOperation(value = "1. 新增编辑")
    @PostMapping("createOrUpdate")
    public CommonResult createOrUpdate(@RequestBody Payment payment){
        return paymentService.createOrUpdate(payment);
    }

    @ApiOperation(value = "2. 根据id查询")
    @PostMapping("queryById")
    public CommonResult queryById(@RequestBody Payment payment){
        return paymentService.queryById(payment);
    }

}
