package com.springcloudify.cloudy.eurekaconsumer;

import com.springcloudify.cloudy.eurekaconsumer.beans.RibbonConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * Create by Jarvis.wang on Jarvis's device
 *
 * @author Jarvis.wang  Jarvis
 * @date 2019-05-08 17:43
 */
@Configuration
@EnableFeignClients
@EnableHystrixDashboard
@RibbonClient(name = "eurake-consumer", configuration = RibbonConfiguration.class)
public class EurekaConsumerConfig {
}
