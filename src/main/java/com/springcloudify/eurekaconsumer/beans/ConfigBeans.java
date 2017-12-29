package com.springcloudify.eurekaconsumer.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wj42134
 * @date 2017 12 29 14:56
 */
@Configuration
public class ConfigBeans {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
