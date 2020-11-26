package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @PackageName:com.atguigu.springcloud.config
 * @ClassName:FeignConfig
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/26 16:15
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }
}
