package com.redDabbler.template.springboot.service;

import com.redDabbler.template.springboot.dao.TestMapper;
import com.redDabbler.template.springboot.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RedDabbler
 * @create 2019-02-26 16:59
 **/
@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;

    public Test getById(Integer id){
        return testMapper.getById(id);
    }
}
