package com.bigguy.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author bigguy_hc
 * @create 2019-06-09 16:35
 */
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class DeptFeignWebApp {
    public static void main(String[] args) {
        SpringApplication.run(DeptFeignWebApp.class, args);
    }
}

