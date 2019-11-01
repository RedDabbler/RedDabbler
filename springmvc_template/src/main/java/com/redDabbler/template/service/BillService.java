package com.redDabbler.template.service;

import com.redDabbler.template.dao.BillMapper;
import com.redDabbler.template.entity.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillMapper billMapper;

    public List<Bill> list(){
       return billMapper.getAll();
    }

}
