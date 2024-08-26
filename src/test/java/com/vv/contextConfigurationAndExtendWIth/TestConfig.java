package com.vv.contextConfigurationAndExtendWIth;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public String exampleBean() {
        return "example";
    }
}
