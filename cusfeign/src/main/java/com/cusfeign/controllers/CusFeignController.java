package com.cusfeign.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusfeign.service.IFeignService;

@RestController
public class CusFeignController {

	@Autowired
	IFeignService feignService;
	
	@RequestMapping("/feign")
	public String feign(String name){
		return feignService.feign(name);
	}
}
