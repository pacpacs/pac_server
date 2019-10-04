package com.pac.repository.recipe;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.domain.recipe.RecipeProcess;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeProcessRepository extends MongoRepository<RecipeProcess, String> {
   List<RecipeProcess> findByRecipeIdOrderByCookingNo(int recipeId);
}
