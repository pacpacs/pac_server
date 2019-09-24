package com.pac.repository;

import com.pac.domain.User;
import com.pac.domain.recipe.RecipeBasic;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface RecipeRepository extends MongoRepository<RecipeBasic, String> {
    List<RecipeBasic> findByRecipesINGNMContaining(List<String> keys);
}
