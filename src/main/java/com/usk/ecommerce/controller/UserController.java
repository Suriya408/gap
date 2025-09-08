package com.usk.ecommerce.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.LoginRequest;
import com.usk.ecommerce.dto.UserRegisterRequest;
import com.usk.ecommerce.service.UserService;

@RestController
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ApplicationResponseDto register(@Valid @RequestBody UserRegisterRequest request) {
		logger.info("register for UserController");
		return userService.registerUser(request);
	}

	@PostMapping("/oauth2/authorization/login")
	public ApplicationResponseDto login(@Valid @RequestBody LoginRequest request) {
		logger.info("login for Usercontroller");
		return userService.loginUser(request);
	} 
}
