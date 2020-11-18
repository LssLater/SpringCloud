package com.yu.springcloud.dao;

import com.yu.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: yy
 * @Date: 2020/11/18 23:38
 * @Version: 1.0.0
 */

@Mapper
public interface OrderDao {

    /**
     * 创建订单
     *
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态
     *
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}