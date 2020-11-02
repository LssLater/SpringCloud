package com.yu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: yy
 * @Date: 2020/11/1 18:15
 * @Version: 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsul8090 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsul8090.class, args);
    }
}
