package com.bigguy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author bigguy_hc
 * @create 2019-06-08 19:18
 */
@EnableEurekaServer                 // 启动Eureka 的注解
@SpringBootApplication
public class EurekaApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp.class, args);
    }
}
