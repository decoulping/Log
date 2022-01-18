package com.lepin.mytest.service.impl;

import com.lepin.mytest.mapper.CreditOrderMapper;
import com.lepin.mytest.service.ICreditOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Describe
 *
 * @author John
 * @date 2021/12/31
 */

@Component(value = "singleCreditOrderService")
public class CreditOrderServiceImpl implements ICreditOrderService {

    @Autowired
    private CreditOrderMapper creditOrderMapper;

    @Override
    public String getUserIdByOrderId(String orderId) {
        return creditOrderMapper.selectUserIdById(orderId);
    }

}
