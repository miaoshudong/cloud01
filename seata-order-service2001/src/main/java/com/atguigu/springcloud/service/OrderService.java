package com.atguigu.springcloud.service;

import com.atguigu.springcloud.doman.Order;
import io.seata.spring.annotation.GlobalTransactional;

/**
 * @author miaoshudong
 * @since 2022/4/19 9:39
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
