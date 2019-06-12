package com.bigguy.springcloud.configclient.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author bigguy_hc
 * @create 2019-06-08 17:16
 */
@Component
@ConfigurationProperties(prefix = "my")
@Data
public class MyProperties {
    DeptProperties dept;
}
