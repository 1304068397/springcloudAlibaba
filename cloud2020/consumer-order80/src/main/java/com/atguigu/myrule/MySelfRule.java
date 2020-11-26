package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName:com.atguigu.myrule
 * @ClassName:MySelfRule
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/16 21:40
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //随机算法
        return new RandomRule();
    }
}
