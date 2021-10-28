package com.twitter.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "AppUser")
public class User {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull
	private String name;
	
	@NonNull
	private String eMail;
	private String uniqueUserName;
	
	@JsonIgnore
	private String password;
	
	private String bio;
	private String profileImage;
	
	
	public User(Long id, String name, String eMail, String uniqueUserName, String password, String bio,
			String profileImage) {
		super();
		this.id = id;
		this.name = name;
		this.eMail = eMail;
		this.uniqueUserName = uniqueUserName;
		this.password = password;
		this.bio = bio;
		this.profileImage = profileImage;
	}
	
	public User() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUniqueUserName() {
		return uniqueUserName;
	}
	public void setUniqueUserName(String uniqueUserName) {
		this.uniqueUserName = uniqueUserName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

}
