package com.example.spring_boot_jwt_dvv.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_boot_jwt_dvv.entity.Token;
import com.example.spring_boot_jwt_dvv.repository.TokenRepository;
import com.example.spring_boot_jwt_dvv.service.TokenService;



@Service
public class TokenServiceImpl implements TokenService{
	
	@Autowired
    private TokenRepository tokenRepository;

	@Override
	public Token createToken(Token token) {
		// TODO Auto-generated method stub
		return tokenRepository.saveAndFlush(token);
	}

	@Override
	public Token findByToken(String token) {
		// TODO Auto-generated method stub
		return tokenRepository.findByToken(token);
	}
	
}