package com.yu.springcloud.service;

import com.yu.springcloud.entities.CommonResult;
import com.yu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;


@Service
public class PaymentFallbackServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> PaymentSQL(Long id) {
        return new CommonResult<>(444444444, "服务降级返回，----PaymentFallbackServiceImpl", new Payment(id, "errorSerial"));
    }
}
