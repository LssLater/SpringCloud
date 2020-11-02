package com.yu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yy
 * @Date: 2020/11/1 20:55
 * @Version: 1.0.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        // 随机
        return new RandomRule();
    }
}
