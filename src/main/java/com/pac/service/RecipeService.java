package com.pac.service;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<RecipeBasic> getAllRecipes(){
        List<RecipeBasic> recipeBasicList = recipeRepository.findAll();
        return recipeBasicList;
    }

    public List<RecipeBasic> getRecipesByKeyword(List<String>keys){
        return recipeRepository.findByRecipesINGNMContaining(keys);
    }

}
