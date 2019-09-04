package com.pac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pac.domain.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String>  {

	User findByUserId(String userId);

}
	