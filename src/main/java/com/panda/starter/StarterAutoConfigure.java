package com.panda.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StarterServiceProperties.class)
public class StarterAutoConfigure {

    /**
     * 这个properties可以这样注入让startService()使用，也可以不注入；直接startService(StarterServiceProperties properties)，也能从容器中获取该实例，因为不这样注入实例也已经在容器中了。
     */
    @Autowired
    private StarterServiceProperties properties;

    @Bean
    @ConditionalOnProperty(prefix = "example.service", value = "enabled", havingValue = "true")
    StarterService starterService(){
        return new StarterService(properties.getConfig());
    }
}
