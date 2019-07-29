package com.pac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pac.domain.User;

public interface UserRepository extends MongoRepository<User, String>  {



	
}
