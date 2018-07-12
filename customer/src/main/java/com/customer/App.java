package com.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 断路器,当客户端访问服务端,发现有异常不能正常访问,那么服务端会执行一个fallback方法
 * fallback如何处理,由业务需求定
 * @author 77585
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
    	return new RestTemplate();
    }
}
