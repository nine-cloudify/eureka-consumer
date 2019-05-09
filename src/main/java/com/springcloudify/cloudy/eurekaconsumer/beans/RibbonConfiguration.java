package com.springcloudify.cloudy.eurekaconsumer.beans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by Jarvis.wang on Jarvis's device
 *
 * @author Jarvis.wang  Jarvis
 * @date 2019-05-08 17:54
 */

@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
