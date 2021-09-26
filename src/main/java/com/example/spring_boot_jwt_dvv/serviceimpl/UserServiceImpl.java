package com.example.spring_boot_jwt_dvv.serviceimpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_jwt_dvv.auth.UserPrincipal;
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

	@Override
	public UserPrincipal findByUsername(String username) {
		// TODO Auto-generated method stub
				User user = userRepository.findByUsername(username);
				UserPrincipal userPrincipal = new UserPrincipal();
				if (null != user) {
					Set<String> authorities = new HashSet<>();
					if (null != user.getRoles())
						user.getRoles().forEach(r -> {
							authorities.add(r.getRoleKey());
							r.getPermissions().forEach(p -> authorities.add(p.getPermissionKey()));
						});
					userPrincipal.setUserId(user.getId());
					userPrincipal.setUsername(user.getUsername());
					userPrincipal.setPassword(user.getPassword());
					userPrincipal.setAuthorities(authorities);
				}
				return userPrincipal;
	}

}
