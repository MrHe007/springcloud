package com.bigguy.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:58
 */
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class DeptWebApp {

    public static void main(String[] args) {

        SpringApplication.run(DeptWebApp.class, args);

    }
}
