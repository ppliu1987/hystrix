package com.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.service.CusService;

@RestController
public class CusController {
	@Autowired
	CusService service;

	@RequestMapping("/customer")
	public String customer(){
		return service.hello("mingzhu");
	}
}
