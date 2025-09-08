package com.usk.ecommerce.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.usk.ecommerce.dto.ApplicationResponseDto;
import com.usk.ecommerce.dto.LoginRequest;
import com.usk.ecommerce.dto.UserRegisterRequest;
import com.usk.ecommerce.model.User;
import com.usk.ecommerce.repository.UserRepository;

@Service
public class UserServiceimpl implements UserService {

	Logger logger = LoggerFactory.getLogger(UserServiceimpl.class);

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	private ApplicationResponseDto commonDto;

	public ApplicationResponseDto registerUser(UserRegisterRequest request) {
		commonDto = new ApplicationResponseDto();
		User user = new User();
		logger.info("UserServiceimpl registerUser ");
		if (userRepository.findByEmail(request.getEmail()).isPresent()) {
			throw new RuntimeException("Email already registered.");
		}
		BeanUtils.copyProperties(request, user);
		user.setPassword(passwordEncoder.encode(request.getPassword()));
		userRepository.save(user);
		commonDto.setStatusCode(200);
		commonDto.setMessage("User registered successfully");
		commonDto.setData(user);
		return commonDto;
	}

	public ApplicationResponseDto loginUser(LoginRequest request) {
		logger.info("UserServiceimpl loginUser ");
		commonDto = new ApplicationResponseDto();
		User user = userRepository.findByEmail(request.getEmail())
				.orElseThrow(() -> new RuntimeException("Invalid email or password."));

		if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
			throw new RuntimeException("Invalid email or password.");
		}
		commonDto.setStatusCode(200);
		commonDto.setMessage("Login successful for user: " + user.getName());
		commonDto.setData(request);
		return commonDto;
	}

}
