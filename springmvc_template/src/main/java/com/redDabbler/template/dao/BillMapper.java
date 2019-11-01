package com.redDabbler.template.dao;

import com.redDabbler.template.entity.Bill;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillMapper {

    @Select("select * from bill")
    public List<Bill> getAll();
}
