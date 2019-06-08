package com.bigguy.springcloud.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author bigguy_hc
 * @create 2019-06-08 15:03
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept {
    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }

}
