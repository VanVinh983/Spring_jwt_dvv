package com.example.spring_boot_jwt_dvv.service;

import com.example.spring_boot_jwt_dvv.entity.Token;

public interface TokenService {
	Token createToken(Token token);
	Token findByToken(String token);
}
