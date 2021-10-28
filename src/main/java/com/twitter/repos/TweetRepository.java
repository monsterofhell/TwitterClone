package com.twitter.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.twitter.models.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long>{
	
}
