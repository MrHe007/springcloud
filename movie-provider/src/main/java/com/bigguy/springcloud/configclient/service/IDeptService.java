package com.bigguy.springcloud.configclient.service;

import com.bigguy.springcloud.configclient.entity.Dept;

import java.util.List;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:16
 */
public interface IDeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
