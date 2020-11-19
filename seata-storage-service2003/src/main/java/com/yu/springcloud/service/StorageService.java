package com.yu.springcloud.service;

/**
 * @Author: yy
 * @Date: 2020/11/19 17:35
 * @Version: 1.0.0
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
