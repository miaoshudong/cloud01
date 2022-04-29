package com.atguigu.springcloud.service;

/**
 * @author miaoshudong
 * @since 2022/4/19 10:01
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
