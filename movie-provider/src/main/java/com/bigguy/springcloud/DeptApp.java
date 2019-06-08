package com.bigguy.springcloud;

import com.bigguy.springcloud.dao.IDeptDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:21
 */
//@MapperScan(basePackageClasses = IDeptDao.class)
@SpringBootApplication
public class DeptApp {

    public static void main(String[] args) {
        SpringApplication.run(DeptApp.class , args);
    }

}
