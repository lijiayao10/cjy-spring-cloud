/*
 * Copyright 2012-2020 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * @author a304101279@163.com
 * Git https://github.com/lijiayao10/cjy-spring-cloud
 */

package cloud.simple.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cloud.simple.model.User;
import cloud.simple.service.UserService;



@RestController
public class UserController {
		
	@Autowired
	UserService userService;
	
//	@Autowired
//	FeignUserService feignUserService;
	
	@RequestMapping(value="/users")
	public ResponseEntity<List<User>> readUserInfo(){
		List<User> users=userService.readUserInfo();		
		return new ResponseEntity<List<User>>(users,HttpStatus.OK);
	}
}
