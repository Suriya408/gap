package com.usk.ecommerce.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserRegisterRequest {

	private String name;

	@NotBlank
	private String email;

	@NotBlank
	private String password;

	@NotNull(message = "Mobile number is required")
	@Min(value = 1000000000L, message = "Mobile number must be at least 10 digits")
	@Max(value = 9999999999L, message = "Mobile number must be at most 10 digits")
	private long mobile;

	@NotBlank
	private String role;

	public UserRegisterRequest() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRegisterRequest [name=" + name + ", email=" + email + ", password=" + password + ", mobile="
				+ mobile + "]";
	}

}
