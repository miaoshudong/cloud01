package com.atguigu.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author miaoshudong
 * @since 2022/4/19 10:17
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.dao"})
public class MybatisConfig {
}
