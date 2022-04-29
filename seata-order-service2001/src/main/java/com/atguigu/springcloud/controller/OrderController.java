package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.doman.CommonResult;
import com.atguigu.springcloud.doman.Order;
import com.atguigu.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author miaoshudong
 * @since 2022/4/19 9:46
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
