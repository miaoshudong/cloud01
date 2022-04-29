package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author miaoshudong
 * @since 2022/4/17 16:51
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosConfigClientMain3377.class, args);
//        while(true) {
//            //当动态配置刷新时，会更新到 Enviroment中，因此这里每隔一秒中从Enviroment中获取配置
//            String userName = applicationContext.getEnvironment().getProperty("user.name");
//            String userAge = applicationContext.getEnvironment().getProperty("user.age");
//            String info = applicationContext.getEnvironment().getProperty("config.info");
//            System.err.println("user name :" + userName + "; age: " + userAge);
//            System.out.println("config.info"+info);
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }
}
