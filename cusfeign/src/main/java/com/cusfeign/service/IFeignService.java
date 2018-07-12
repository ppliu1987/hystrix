package com.cusfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="SERVICE-PROVIDER",fallback=FeignServiceImpl.class)
public interface IFeignService {

	/**
	 * @RequestParam不加无法接收参数
	 * RequestParam后面括号中的'name'不加 会报错
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/provide",method=RequestMethod.GET)
	String feign(@RequestParam("name") String name);
}
