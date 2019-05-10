package com.springcloudify.cloudify.eurekaconsumer;

import com.springcloudify.cloudify.eurekaconsumer.beans.RibbonConfiguration;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * Create by Jarvis.wang on Jarvis's device
 *
 * @author Jarvis.wang  Jarvis
 * @date 2019-05-08 17:43
 */
@Configuration
@EnableFeignClients
@EnableHystrixDashboard
@EnableTurbine
@EnableTurbineStream
@EnableZuulProxy

@EnableZipkinServer
@RibbonClient(name = "eurake-consumer", configuration = RibbonConfiguration.class)
public class EurekaConsumerConfig {
}
