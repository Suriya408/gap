package com.usk.ecommerce.service;

import javax.validation.Valid;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.LoginRequest;
import com.usk.ecommerce.dto.UserRegisterRequest;

public interface UserService {

	ApplicationResponseDto registerUser(UserRegisterRequest request);

	ApplicationResponseDto loginUser(LoginRequest request);

}
