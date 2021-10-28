package com.twitter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.models.User;
import com.twitter.repos.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;
	
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
}
