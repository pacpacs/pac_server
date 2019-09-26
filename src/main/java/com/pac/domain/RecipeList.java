package com.pac.domain;

import java.util.List;

public class RecipeList {
    private List<Recipe> recipeList;

    public RecipeList() {
    }

    public RecipeList(Recipe recipe) {
        this.recipeList.add(recipe);
    }

    public RecipeList(List<Recipe> recipeList) {
        setRecipeList(recipeList);
    }

    public List<Recipe> getRecipeList() {
        return this.recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList=recipeList;
    }

    private void addRecipe(Recipe recipe) {
        // TODO Auto-generated method stub
        recipeList.add(recipe);
    }
}
