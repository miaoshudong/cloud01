package com.atguigu.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author miaoshudong
 * @since 2022/4/19 10:14
 */
public interface AccountService {
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
