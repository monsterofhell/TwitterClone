package com.twitter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.models.Tweet;
import com.twitter.models.User;
import com.twitter.services.TweetService;
import com.twitter.services.UserService;

@RestController
public class MainController {

	@Autowired
	TweetService tweetService;
	@Autowired 
	UserService userService;
	
	@GetMapping("/tweets")
	public List<Tweet> getAllTweets(){
		
		return tweetService.getAllTweets();	
	}
	
	@GetMapping("/users")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}
