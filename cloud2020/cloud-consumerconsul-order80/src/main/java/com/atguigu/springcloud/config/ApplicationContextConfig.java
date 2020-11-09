package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName:com.atguigu.springcloud.config
 * @ClassName:ApplicationContextConfig
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/9 23:02
 */
@Configuration
public class ApplicationContextConfig {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
