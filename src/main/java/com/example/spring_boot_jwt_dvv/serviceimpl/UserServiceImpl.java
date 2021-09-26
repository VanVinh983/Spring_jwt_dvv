package com.example.spring_boot_jwt_dvv.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_jwt_dvv.entity.User;
import com.example.spring_boot_jwt_dvv.repository.UserRepository;
import com.example.spring_boot_jwt_dvv.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.saveAndFlush(user);
	}

}
