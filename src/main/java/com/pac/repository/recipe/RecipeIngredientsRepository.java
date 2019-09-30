package com.pac.repository.recipe;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.domain.recipe.RecipeIngredient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeIngredientsRepository extends MongoRepository<RecipeIngredient, String>  {
    List<RecipeIngredient> findByIrdntNmInOrderByRecipeId(List<String> ingredients);

    List<RecipeIngredient> findByRecipeIdInOrderByRecipeId(List<Integer> recipeIdList);
}
