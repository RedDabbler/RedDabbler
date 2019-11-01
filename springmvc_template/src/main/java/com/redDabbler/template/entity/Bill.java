package com.redDabbler.template.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Bill {
    private String id;
    private int type; // 类型
    private String shop;//商家
    private String address;// 地址
    private double money;// 金额
    private Date dateTime;//时间
    private String payAccount; // 支付账户
}
