package com.example.hw18.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AutoConfig {
    @Configuration
    @ConditionalOnClass(name = "com.example.hw18.configuration.ConfigurationEnabler")
    @ConditionalOnProperty(prefix = "custom.configuration", name = "enabled", havingValue = "true")
    public class AutoConfiguration {

        @Bean
        public void autoConfigurationBean() {
            System.out.println("AutoConfiguration enabled");
        }
    }
}
