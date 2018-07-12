package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CusService {
	@Autowired
	RestTemplate template;
	
	@HystrixCommand(fallbackMethod="helloErr")
	public String hello(String name){
		return template.getForObject("http://SERVICE-PROVIDER/provide?name="+name, String.class);
	}
	
	public String helloErr(String name){
		return "服务端异常,请稍后再试...参数:"+name;
	}

}
