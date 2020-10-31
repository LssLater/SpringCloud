package com.yu.springcloud.service.impl;

import com.yu.springcloud.dao.PaymentDao;
import com.yu.springcloud.entities.Payment;
import com.yu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: yy
 * @Date: 2020/10/30 20:41
 * @Version: 1.0.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
