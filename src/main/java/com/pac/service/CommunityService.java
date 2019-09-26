package com.pac.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.repository.recipe.RecipeBasicRepository;

@Service("CommunityService")
public class CommunityService {
    Logger log = LoggerFactory.getLogger("com.pac.service.CommunityService");

    @Autowired
    private RecipeBasicRepository recipeRepository;

    public List<RecipeBasic> getAllRecipes(){
        List<RecipeBasic> recipeBasicList = recipeRepository.findAll();
        return recipeBasicList;
    }

    public RecipeBasic getRecipeById(Integer recipeId){
        return recipeRepository.findByRecipeId(recipeId);
    }
}