package com.redDabbler.template.springboot.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.redDabbler.template.springboot.common.Page;
import com.redDabbler.template.springboot.entity.BillHistory;
import com.redDabbler.template.springboot.mapper.BillHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author RedDabbler
* @description 针对表【_t_bill_history(账单历史记录表)】的数据库操作Service
* @createDate 2021-11-29 13:47:40
 * TODO 查询条件没有生效
*/
@Service
public class BillHistoryService extends ServiceImpl<BillHistoryMapper, BillHistory> {

    public List<BillHistory> list(BillHistory billHistory) {
        return super.list();

    }

    public Page<BillHistory> page(BillHistory billHistory, Integer pageNo, Integer pageSize) {
        return super.page(new Page<BillHistory>(pageNo,pageSize));
    }


}
