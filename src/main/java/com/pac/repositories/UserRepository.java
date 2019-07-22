package com.pac.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pac.model.dao.UserDAO;

@Repository
public interface UserRepository extends MongoRepository<UserDAO, Integer> {

}
