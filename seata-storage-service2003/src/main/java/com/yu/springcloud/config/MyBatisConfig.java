package com.yu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yy
 * @Date: 2020/11/19 17:35
 * @Version: 1.0.0
 */
@Configuration
@MapperScan("com.yu.springcloud.dao")
public class MyBatisConfig {
}
