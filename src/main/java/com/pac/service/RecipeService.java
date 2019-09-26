package com.pac.service;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.domain.recipe.RecipeIngredient;
import com.pac.repository.recipe.RecipeBasicRepository;
import com.pac.repository.recipe.RecipeIngredientsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {

    Logger log = LoggerFactory.getLogger("com.pac.service.RecipeService");

    @Autowired
    RecipeBasicRepository recipeRepository;
    @Autowired
    RecipeIngredientsRepository recipeIngredientsRepository;

    public List<RecipeBasic> getAllRecipes(){
        List<RecipeBasic> recipeBasicList = recipeRepository.findAll();
        return recipeBasicList;
    }

    public List<RecipeIngredient> getRecipesByIngredients(List<String>ingredients){
        //ingredient 통해서 reciep전부 구하기
        List<RecipeIngredient> recipeIngredientList = recipeIngredientsRepository.findByIrdntNmContaining(ingredients);
        log.debug( recipeIngredientList.toString());

        //recipe ID 구하기
        List<Integer> recipeIdList = getRecipeId(recipeIngredientList);
        log.debug(recipeIdList.toString());

        //recipe ID 통해 recipe info 구하기
        List<RecipeBasic> recipeBasicList = recipeRepository.findAllByRecipeId(recipeIdList);
        return recipeIngredientList;
    }

    private List<Integer> getRecipeId(List<RecipeIngredient> recipeIngredientList) {
        List<Integer> recipeIdList = new ArrayList<>();

        for(RecipeIngredient recipeIngredient : recipeIngredientList){
            if(!recipeIdList.contains(recipeIngredient.getRecipeId())){
                recipeIdList.add(recipeIngredient.getRecipeId());
            }
        }
        return recipeIdList;
    }

}
