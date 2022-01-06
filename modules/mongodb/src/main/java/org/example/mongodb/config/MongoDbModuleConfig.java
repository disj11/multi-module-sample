package org.example.mongodb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application-mongo-${spring.profiles.active}.properties")
public class MongoDbModuleConfig {
}
