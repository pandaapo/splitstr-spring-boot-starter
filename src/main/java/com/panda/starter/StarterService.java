package com.panda.starter;

/**
 * 本starter的具体功能实现：
 * 能够将配置文件中配置的字符串根据传入的字符进行分割
 */
public class StarterService {

    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String splitChar) {
        return config.split(splitChar);
    }
}
