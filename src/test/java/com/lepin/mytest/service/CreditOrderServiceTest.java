package com.lepin.mytest.service;

import com.lepin.mytest.BaseTest;
import com.lepin.mytest.mapper.CreditOrderMapper;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.annotation.Resource;


/**
 * Describe
 *
 * @author John
 * @date 2021/12/31
 */
public class CreditOrderServiceTest extends BaseTest {

    @Resource(name = "singleCreditOrderService")
    private ICreditOrderService creditOrderService;

    @MockBean(CreditOrderMapper.class)
    private CreditOrderMapper creditOrderMapper;

    @Test
    public void testCreditOrderService(){
        String creditOrderId = "12345";

        Mockito.when(creditOrderMapper.selectUserIdById(Mockito.anyString())).thenReturn("12345543");

        String s = creditOrderMapper.selectUserIdById("123111");

        System.out.println(s);

        String s1 = creditOrderMapper.selectUserIdById("1222222");

        System.out.println(s1);

        String userId = creditOrderService.getUserIdByOrderId(creditOrderId);
        System.out.println(userId);
    }
}
