package com.example.spring_boot_jwt_dvv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_jwt_dvv.entity.Token;


public interface TokenRepository extends JpaRepository<Token, Long>{
	public Token findByToken (String token);
}
