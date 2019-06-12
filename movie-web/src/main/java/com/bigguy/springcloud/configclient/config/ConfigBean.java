package com.bigguy.springcloud.configclient.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:55
 */
@Configuration
public class ConfigBean {

    @LoadBalanced           // ribbon 开启轮询算法
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
