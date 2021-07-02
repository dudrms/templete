package com.comm.templete.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comm.templete.service.SampleService;
import com.comm.templete.vo.User;

@RestController
public class TestController {
	@Autowired
	SampleService sampleService;
	
	@GetMapping("/listu")
	public List<User> listUser() {
		return sampleService.func();
	}
}