package com.lepin.mytest;

import com.lepin.mytest.starter.MockitoBeansTestExecutionListener;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
//@TestExecutionListeners(
//        value = {MockitoBeansTestExecutionListener.class},
//        mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS
//)
public abstract class BaseTest extends TestCase {
//    @Autowired
//    protected WebApplicationContext applicationContext;
//    protected MockMvc mockMvc = null;
//    @Before
//    public void initMock() {
//        if (this.mockMvc == null) {
//            this.mockMvc = MockMvcBuilders.webAppContextSetup(this.applicationContext).build();
//        }
//
//    }
}
