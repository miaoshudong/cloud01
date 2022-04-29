package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @author miaoshudong
 * @since 2022/4/18 17:49
 */
public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(4444, "自定义的限流处理信息......CustomerBlockHandler---1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "自定义的限流处理信息......CustomerBlockHandler---2");
    }

}
