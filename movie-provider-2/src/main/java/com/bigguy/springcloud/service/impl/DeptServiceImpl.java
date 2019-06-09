package com.bigguy.springcloud.service.impl;

import com.bigguy.springcloud.dao.IDeptDao;
import com.bigguy.springcloud.entity.Dept;
import com.bigguy.springcloud.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:19
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
