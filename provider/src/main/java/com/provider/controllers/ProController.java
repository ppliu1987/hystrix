package com.provider.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {

	@RequestMapping("/provide")
	public String hello(String name){
		return "provider receive paramer:" + name;
	}
}
