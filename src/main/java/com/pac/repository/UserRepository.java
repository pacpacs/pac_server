package com.pac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pac.domain.User;

import java.util.List;


public interface UserRepository extends MongoRepository<User, String>  {

    @Override
    public List<User> findAll();

}
