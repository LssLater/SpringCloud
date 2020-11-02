package com.yu.springcloud.lb.impl;

import com.yu.springcloud.lb.MyLoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: yy
 * @Date: 2020/11/1 21:13
 * @Version: 1.0.0
 */
@Component
public class MyLoadBalancerImpl implements MyLoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     *  while条件：在这个循环条件下，假设有多个线程在同时执行这段代码，
     *  即使有一个线程在产生了新值之后，它还需要让它自己产生的新值与旧值比较之后才能决定要不要这个新值，
     *  如果出现compareAndSet方法的预期值不跟实际值一样，导致方法返回false，直到没有其他线程干扰。这时就确定了新产生的值。
     * @return 接口计数
     */
    public final int getAddIncrement(){
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0:current+1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        return next;
    }

    /**
     *
     * @param serviceInstances 服务
     * @return 真正要调用的服务的下标
     */
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index = getAddIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
