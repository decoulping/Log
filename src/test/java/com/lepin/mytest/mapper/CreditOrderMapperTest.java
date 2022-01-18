package com.lepin.mytest.mapper;

import com.lepin.mytest.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class CreditOrderMapperTest extends BaseTest {
    @Autowired
    private CreditOrderMapper creditOrderMapper;

    @Test
    @Rollback
    public void testGet(){
        String creditOrderId = "12345";
        String uid = creditOrderMapper.selectUserIdById(creditOrderId);
        System.out.println(uid);
    }
}
