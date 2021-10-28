package com.twitter.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.lang.NonNull;

@Entity
public class Tweet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	private String content;
	
	private String replyToTweetId;
	
	public Tweet(Long id, String content, String replyToTweetId, User user) {
		super();
		this.id = id;
		this.content = content;
		this.replyToTweetId = replyToTweetId;
		this.user = user;
	}
	public Tweet() {
		
	}

	@ManyToOne
	private User user;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReplyToTweetId() {
		return replyToTweetId;
	}

	public void setReplyToTweetId(String replyToTweetId) {
		this.replyToTweetId = replyToTweetId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
