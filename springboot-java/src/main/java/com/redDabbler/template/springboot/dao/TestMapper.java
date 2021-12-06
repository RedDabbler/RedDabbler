package com.redDabbler.template.springboot.dao;

import com.redDabbler.template.springboot.domain.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author RedDabbler
 * @create 2019-02-26 16:55
 **/
@Mapper
public interface TestMapper {

    @Select(" select * from test where id = #{id} ")
    public Test getById(Integer id);
}
