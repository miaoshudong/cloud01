package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author miaoshudong
 * @since 2022/4/15 15:51
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService----paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService----paymentInfo_TimeOut";
    }
}
