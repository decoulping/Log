package com.lepin.mytest.starter;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.mockito.Mockito;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

public class MockitoBeansTestExecutionListener extends AbstractTestExecutionListener {
    private List<Object> injectMockBeans = new ArrayList();
    private boolean init = false;

    public MockitoBeansTestExecutionListener() {
    }

    public void beforeTestMethod(TestContext testContext) throws Exception {
        if (!this.init) {
            Field[] declaredFields = testContext.getTestClass().getDeclaredFields();
            Field[] var3 = declaredFields;
            int var4 = declaredFields.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                Field field = var3[var5];
                if (field.getAnnotation(MockBean.class) != null || field.getAnnotation(SpyBean.class) != null) {
                    field.setAccessible(true);
                    Object mockBean = field.get(testContext.getTestInstance());
                    this.injectMockBeans.add(mockBean);
                }
            }

            this.init = true;
        }
    }

    public void afterTestMethod(TestContext testContext) throws Exception {
        if (!this.injectMockBeans.isEmpty()) {
            this.injectMockBeans.forEach((xva$0) -> {
                Mockito.reset(new Object[]{xva$0});
            });
        }
    }
}
