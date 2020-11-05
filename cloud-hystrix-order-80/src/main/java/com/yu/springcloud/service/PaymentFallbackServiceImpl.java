package com.yu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yu
 * @description
 * @date 2020-11-5 18:01
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfoOk(Integer id) {
        return "-------PaymentFallbackService fall back-[paymentInfo_OK],o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-------PaymentFallbackService fall back-[paymentInfo_TimeOut],o(╥﹏╥)o";
    }
}
