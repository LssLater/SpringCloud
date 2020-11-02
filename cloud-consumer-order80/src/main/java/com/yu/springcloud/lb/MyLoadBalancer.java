package com.yu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: yy
 * @Date: 2020/11/1 21:10
 * @Version: 1.0.0
 */

public interface MyLoadBalancer {
    /**
     * 收集服务集群总数量
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
