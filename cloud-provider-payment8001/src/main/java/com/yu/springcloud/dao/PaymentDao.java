package com.yu.springcloud.dao;

import com.yu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: yy
 * @Date: 2020/10/30 20:33
 * @Version: 1.0.0
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}
