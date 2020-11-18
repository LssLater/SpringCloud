package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: yy
 * @Date: 2020/11/18 16:34
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class, args);
    }
}
