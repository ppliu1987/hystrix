package com.cusfeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements IFeignService {

	@Override
	public String feign(String name) {
		return "feign服务器异常...参数:"+name;
	}

}
