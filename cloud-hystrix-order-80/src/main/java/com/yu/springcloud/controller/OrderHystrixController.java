package com.yu.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.yu.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yu
 * @description
 * @date 2020-11-05 00:44
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentGlobalFallbackMethod")
public class OrderHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand
    public String paymentInfoTimeOut(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        return paymentHystrixService.paymentInfoTimeOut(id);
    }

    /**
     * 全局fallback 降级方法
     * @return
     */
    public String paymentGlobalFallbackMethod() {
        return "Global异常处理信息，请稍后再试，o(╥﹏╥)o";
    }

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoOk(id);
        return result;
    }


    public String paymentTimeOutFallbackMethod(@PathVariable("id") Integer id){
        return "我是消费者8090，对方支付系统繁忙请稍后再试";
    }

}
