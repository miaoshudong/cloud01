package com.atguigu.springcloud.domain;

import lombok.Data;

/**
 * @author miaoshudong
 * @since 2022/4/19 9:57
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
