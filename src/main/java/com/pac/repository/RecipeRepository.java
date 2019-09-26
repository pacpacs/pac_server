package com.pac.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.pac.domain.recipe.RecipeBasic;

@Repository
public interface RecipeRepository extends MongoRepository<RecipeBasic, String> {
    RecipeBasic findByRecipeId(Integer recipeId);
    List<RecipeBasic> findByIrdntCodeContaining(List<String> keys);

}
