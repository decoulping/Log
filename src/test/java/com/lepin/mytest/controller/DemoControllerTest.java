package com.lepin.mytest.controller;

import com.lepin.mytest.BaseTest;
import com.lepin.mytest.service.ICreditOrderService;
import com.lepin.mytest.service.impl.CreditOrderServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 *
 * @author John
 * @date 2021/12/31
 */
public class DemoControllerTest extends BaseTest {
//    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @MockBean
    private ICreditOrderService creditOrderService;

    @Before
    public void setUp(){
        //拦截器有效
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
        //拦截器无效
        //mockMvc = MockMvcBuilders.webAppContextSetup(DemoController).build();
    }

    @Test
    public void testDemoController() throws Exception {
        String orderId = "12345";

        //mock Service层
        Mockito.when(creditOrderService.getUserIdByOrderId(Mockito.anyString())).thenReturn("mock_id");

        MockHttpServletRequestBuilder requestBuilder = get("/client/userId")
                .accept(MediaType.ALL)
                .contentType(MediaType.APPLICATION_JSON)
                .param("orderId", orderId);

        MvcResult mvcResult = mockMvc.perform(requestBuilder)
                .andDo(MockMvcResultHandlers.print())//打印输出发出请求的详细信息
                .andExpect(status().isOk())
                .andReturn();
        System.err.println(mvcResult.getResponse().getContentAsString());
//
//        RequestBuilder request = get("/client/userId").param("orderId", orderId);
//        MvcResult mvcResult = mockMvc.perform(request)
//                                .andExpect(status().isOk())
//                                .andReturn();
//        System.err.println(mvcResult.getResponse().getContentAsString());


    }

}
