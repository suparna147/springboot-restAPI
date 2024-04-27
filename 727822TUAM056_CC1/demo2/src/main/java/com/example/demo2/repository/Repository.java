package com.example.demo2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.model.User;



public interface Repository extends JpaRepository<User,Integer>{


    Optional<User>findByEmail(String username);
}
