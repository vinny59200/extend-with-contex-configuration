package com.vv.contextConfigurationAndExtendWIth;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

//@ExtendWith( SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
public class MyServiceTest {

    @Autowired
    private String exampleBean;

    @Test
    public void testExampleBean() {
        assertThat(exampleBean).isEqualTo("example");
    }
}