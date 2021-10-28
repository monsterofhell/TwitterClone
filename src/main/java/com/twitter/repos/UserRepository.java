package com.twitter.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.twitter.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
