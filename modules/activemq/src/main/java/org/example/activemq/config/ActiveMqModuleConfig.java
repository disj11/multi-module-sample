package org.example.activemq.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-activemq-${spring.profiles.active}.properties")
public class ActiveMqModuleConfig {
}
