package com.bigguy.springcloud.controller;

import com.bigguy.springcloud.entity.Dept;
import com.bigguy.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:20
 */

@RestController
public class DeptController
{
    @Autowired
    private IDeptService service;

    // POST 方式
    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method= RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }

}
