package com.yu.springcloud.service;

import com.yu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yy
 * @Date: 2020/10/30 20:34
 * @Version: 1.0.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
