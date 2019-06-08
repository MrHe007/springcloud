package com.bigguy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:55
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
