package com.panda.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件读取类
 */
@ConfigurationProperties(prefix = "example.service")
public class StarterServiceProperties {
    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
