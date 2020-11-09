package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yy
 * @Date: 2020/11/9 23:25
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8801.class, args);
    }
}
