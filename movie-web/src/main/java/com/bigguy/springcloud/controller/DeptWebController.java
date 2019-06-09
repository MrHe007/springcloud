package com.bigguy.springcloud.controller;

import com.bigguy.springcloud.entity.Dept;
import com.bigguy.springcloud.properties.MyProperties;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:56
 */
@RestController
public class DeptWebController {

    @Autowired
    MyProperties properties;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    DiscoveryClient client;

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        String serviceId = "microservicecloud-dept";
        String url = "http://" + serviceId;
        return restTemplate.getForObject(url+"/dept/get/"+id, Dept.class);
    }


    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return restTemplate.postForObject(properties.getDept().getUrl()+"/dept/add", dept, Boolean.class);
    }



    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(properties.getDept().getUrl()+"/dept/list", List.class);
    }
}

