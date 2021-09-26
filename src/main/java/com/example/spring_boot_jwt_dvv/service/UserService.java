package com.example.spring_boot_jwt_dvv.service;

import com.example.spring_boot_jwt_dvv.auth.UserPrincipal;
import com.example.spring_boot_jwt_dvv.entity.User;

public interface UserService {
	public User createUser(User user);
	UserPrincipal findByUsername(String username);
}
