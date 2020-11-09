package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: yy
 * @Date: 2020/11/9 23:53
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8802.class, args);
    }
}
