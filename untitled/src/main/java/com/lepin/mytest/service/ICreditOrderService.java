package com.lepin.mytest.service;

/**
 * Describe
 *
 * @author John
 * @date 2021/12/31
 */
public interface ICreditOrderService {

    /**
     * @param orderId 订单Id
     * @return
     */
    String getUserIdByOrderId(String orderId);
}
