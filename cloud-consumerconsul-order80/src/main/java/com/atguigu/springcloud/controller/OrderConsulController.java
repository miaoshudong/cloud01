package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author miaoshudong
 * @since 2022/4/14 16:54
 */
@RestController
public class OrderConsulController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String INVOKE_URL = "http://consul-provider-payment";
    //consul-provider-payment

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo()
    {
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/consul", String.class);
        System.out.println("消费者调用支付服务(consule)--->result:" + result);
        return result;
    }

}
