package com.lepin.mytest.mapper;


import org.springframework.stereotype.Repository;

/**
 * @author john
 */

@Repository
public interface CreditOrderMapper {

    /**获取用户ID
     *
     * @param orderId 订单ID
     * @return 用户ID
     */
    String selectUserIdById(String orderId);
}
