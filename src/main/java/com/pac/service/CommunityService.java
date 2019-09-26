package com.pac.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.domain.Recipe;
import com.pac.repository.RecipeRepository;

@Service("CommunityService")
public class CommunityService {
    Logger log = LoggerFactory.getLogger("com.pac.service.CommunityService");

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes(){
        List<Recipe> recipeList = recipeRepository.findAll();
        log.debug("recipeList size",recipeList.size());
        log.debug("recipeList",recipeList.get(0).getRecipeId());
        return recipeList;
    }

    public Recipe getRecipeById(Integer recipeId){
        return recipeRepository.findByRecipeId(recipeId);
    }
}