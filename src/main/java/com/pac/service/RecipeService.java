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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class RecipeService {

    Logger log = LoggerFactory.getLogger("com.pac.service.RecipeService");

    @Autowired
    RecipeBasicRepository recipeBasicRepository;
    @Autowired
    RecipeIngredientsRepository recipeIngredientsRepository;

    public List<RecipeBasic> getAllRecipes(){
        List<RecipeBasic> recipeBasicList = recipeBasicRepository.findAll();
        return recipeBasicList;
    }

    public List<RecipeBasic> getRecipesByIngredients(List<String>ingredients){

        List<RecipeIngredient> recipeIngredientList = recipeIngredientsRepository.findByIrdntNmInOrderByRecipeId(ingredients);
        List<Integer> recipeIdListFromDB = getRecipeId(recipeIngredientList);
        List<RecipeBasic> recipeBasicList = recipeBasicRepository.findByRecipeIdInOrderByRecipeId(recipeIdListFromDB);
        List<Integer> recipeIdList = makeRecipeIdList(recipeBasicList);
        List<RecipeIngredient> recipeIngredientsByRecipeId = recipeIngredientsRepository.findByRecipeIdInOrderByRecipeId(recipeIdList);
        recipeBasicList = getRecipesPercentage(recipeIngredientsByRecipeId,recipeBasicList,ingredients);
        Collections.sort(recipeBasicList);

        return recipeBasicList;
    }

    private List<Integer> makeRecipeIdList(List<RecipeBasic> recipeBasicList) {
        List<Integer> recipeIdList = new ArrayList<>();
        for(int i=0;i<recipeBasicList.size();i++){
            recipeIdList.add(recipeBasicList.get(i).getRecipeId());
        }
        return recipeIdList;
    }

    private List<RecipeBasic> getRecipesPercentage(List<RecipeIngredient> recipeIngredientList, List<RecipeBasic> recipeBasicList, List<String> ingredients) {
        int index = 0;
        for(RecipeBasic recipeBasic : recipeBasicList){
            double count = 0;
            double matched = 0;
            int recipeId = recipeBasic.getRecipeId();
            while(true){
                if(index==recipeIngredientList.size())break;
                RecipeIngredient recipeIngredient = recipeIngredientList.get(index);

                if(recipeIngredient.getRecipeId()==recipeId){
                    for(String ingredient : ingredients){
                        if(ingredient.equals(recipeIngredient.getIrdntNm()))matched++;
                    }
                    index++;
                    count++;
                }else break;

            }
            double percentage = Math.round(matched/count*10000)/100.0;
            if(percentage !=0){
                recipeBasic.setPercenatge(percentage);
            }else{
                recipeBasic.setPercenatge(0);
            }

        }
        return recipeBasicList;
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
