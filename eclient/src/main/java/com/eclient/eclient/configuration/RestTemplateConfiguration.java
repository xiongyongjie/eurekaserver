package com.eclient.eclient.configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 初始化RestTemplate 模板
 */
@Configuration
public class RestTemplateConfiguration {

    @Bean(name="restTempalate")
    @LoadBalanced
    public RestTemplate initResetTemplate(){
       return new RestTemplate();
    }

}
