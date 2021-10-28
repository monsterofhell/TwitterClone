package com.twitter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.models.Tweet;
import com.twitter.repos.TweetRepository;

@Service
public class TweetService {

	@Autowired
	TweetRepository tweetRepo;
	public List<Tweet> getAllTweets() {
		// TODO Auto-generated method stub
		return tweetRepo.findAll();
	}

}
