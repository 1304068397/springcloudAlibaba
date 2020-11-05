package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.baomidou.mybatisplus.extension.service.IService;

public interface PaymentService  extends IService<Payment>{

    CommonResult createOrUpdate(Payment payment);
}
