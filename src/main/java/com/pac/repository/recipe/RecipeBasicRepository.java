package com.pac.repository.recipe;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.pac.domain.recipe.RecipeBasic;

@Repository
public interface RecipeBasicRepository extends MongoRepository<RecipeBasic, String> {
    RecipeBasic findByRecipeId(Integer recipeId);
    List<RecipeBasic> findAllByRecipeId(List<Integer> recipeId);

}
