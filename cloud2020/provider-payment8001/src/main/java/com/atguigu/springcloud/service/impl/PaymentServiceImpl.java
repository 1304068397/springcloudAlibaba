package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.atguigu.springcloud.service.impl
 * @ClassName:PaymentServiceImpl
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/4 14:48
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao,Payment> implements PaymentService {

    @Value("${server.port}")  //从application配置文件读取server.port的value
    private String serverPort;

    @Override
    public CommonResult createOrUpdate(Payment payment) {
        //boolean save = save(payment); 单个插入

        /*List<Payment> payments = new ArrayList<>();
        payments.add(payment);
        boolean b = saveBatch(payments); 批量插入*/
        boolean b = saveOrUpdate(payment);
        return new CommonResult(200,"成功，serverPort:"+serverPort,payment);
    }

    @Override
    public CommonResult queryById(Payment payment) {
        Payment paymentRes = getById(payment.getId());
        return new CommonResult(200,"成功,serverPort:"+serverPort,paymentRes);
    }
}
