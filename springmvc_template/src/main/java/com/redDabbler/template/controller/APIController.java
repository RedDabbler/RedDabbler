package com.redDabbler.template.controller;


import com.redDabbler.template.entity.Bill;
import com.redDabbler.template.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private BillService billService;

    @GetMapping("/health")
    public String ok(){
        return "ok";
    }

    @GetMapping("list/bill")
    public List<Bill> list(){
        return billService.list();
    }

}
