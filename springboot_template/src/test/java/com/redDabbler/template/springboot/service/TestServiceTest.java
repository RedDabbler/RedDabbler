package com.redDabbler.template.springboot.service;

import com.redDabbler.template.springboot.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TestServiceTest extends BaseTest {

    @Autowired
    private TestService testService;

    @Test
    public void getById() {
        testService.getById(1);
    }
}