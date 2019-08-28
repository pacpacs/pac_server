package com.pac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pac.domain.Recipe;

import java.util.List;

@Repository
public interface RecipeRepository extends MongoRepository<Recipe, Integer>  {

    Recipe findByRecipeId(Integer recipeId);
}
