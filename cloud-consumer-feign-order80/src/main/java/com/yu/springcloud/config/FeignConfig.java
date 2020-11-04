package com.yu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yy
 * @Date: 2020/11/4 19:17
 * @Version: 1.0.0
 */
@Configuration
public class FeignConfig {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
