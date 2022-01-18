package com.lepin.mytest.controller;

import com.lepin.mytest.base.Response;
import com.lepin.mytest.service.ICreditOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Describe
 *
 * @author John
 * @date 2021/12/31
 */
@Slf4j
@RestController
@RequestMapping(path = "/client")
public class DemoController {

    @Resource(name = "singleCreditOrderService")
    private ICreditOrderService creditOrderService;

    @GetMapping("/userId")
    public Response<String> geUserId(String orderId){
        log.info("someone visit /client/userId,orderId :{}",orderId);
        System.out.println(""+orderId);
        Response<String> response = new Response<>();
        response.setData(creditOrderService.getUserIdByOrderId(orderId));
        return response;
    }
}
