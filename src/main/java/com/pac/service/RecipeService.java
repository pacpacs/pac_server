package com.pac.service;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<RecipeBasic> getAllRecipes(){
        List<RecipeBasic> recipeBasicList = recipeRepository.findAll();
        return recipeBasicList;
    }

    public List<RecipeBasic> getRecipesByKeyword(List<String>keys){
        return recipeRepository.findByIrdntCodeContaining(keys);
    }

}
