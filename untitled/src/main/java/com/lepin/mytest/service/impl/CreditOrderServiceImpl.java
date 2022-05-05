package com.lepin.mytest.service.impl;

import com.lepin.mytest.service.ICreditOrderService;

/**
 * Describe
 *
 * @author John
 * @date 2021/12/31
 */

public class CreditOrderServiceImpl implements ICreditOrderService {


    @Override
    public String getUserIdByOrderId(String orderId) {
        System.out.println("hello");
        return "creditOrderMapper.selectUserIdById(orderId)";
    }

}
