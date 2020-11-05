package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @PackageName:com.atguigu.springcloud.config
 * @ClassName:AplicationContextConfig
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/5 10:11
 */
@Configuration
public class AplicationContextConfig {

    @Bean  //以注解的方式依赖注入 applicationContext.xml <bean id="" class = "">
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
