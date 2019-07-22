package com.pac.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pac.model.dao.RecipeDAO;

@Repository
public interface RecipeRepository extends MongoRepository<RecipeDAO, Integer> {

}