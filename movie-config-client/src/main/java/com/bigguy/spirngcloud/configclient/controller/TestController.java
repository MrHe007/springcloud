package com.bigguy.spirngcloud.configclient.controller;

import com.bigguy.spirngcloud.configclient.bean.JdbcBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bigguy_hc
 * @create 2019-06-12 21:33
 */
@RestController
public class TestController {

    @Autowired
    JdbcBean jdbcBean;

    @RequestMapping("/jdbc.json")
    public String jdbc(){
        return jdbcBean.toString();
    }

}
