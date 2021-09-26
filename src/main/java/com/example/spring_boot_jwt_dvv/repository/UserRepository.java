package com.example.spring_boot_jwt_dvv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_jwt_dvv.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
