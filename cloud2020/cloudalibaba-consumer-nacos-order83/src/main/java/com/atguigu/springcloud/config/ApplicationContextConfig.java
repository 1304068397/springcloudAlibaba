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
 * @Date:2020/11/27 10:03
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }

}
