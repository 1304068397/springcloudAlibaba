package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName:com.atguigu.springcloud.controller
 * @ClassName:ConfigClientController
 * @Description:
 * @Author:王宗保
 * @Version V1.0.0
 * @Date:2020/11/27 13:31
 */
@RestController
@Slf4j
@RefreshScope //支持nacos动态刷新功能
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

}
