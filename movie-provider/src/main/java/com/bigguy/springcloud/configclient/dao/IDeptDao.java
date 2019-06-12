package com.bigguy.springcloud.configclient.dao;

import com.bigguy.springcloud.configclient.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:13
 */
@Mapper
public interface IDeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();


}
