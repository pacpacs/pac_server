package com.pac.domain.recipe;

import java.util.Date;
import java.util.List;

public class RecipeBoard {
    String authorId;
    Date createdDate;
    String description;
    int recipeId;
    String imgPath;
    String kcal;
    int orderNum;
    String title;

    public RecipeBoard(){};


    public RecipeBoard(String authorId, Date createdDate, String description, int recipeId, String imgPath, String kcal, int orderNum, String title) {
        this.authorId = authorId;
        this.createdDate = createdDate;
        this.description = description;
        this.recipeId = recipeId;
        this.imgPath = imgPath;
        this.kcal = kcal;
        this.orderNum = orderNum;
        this.title = title;
    }
    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
