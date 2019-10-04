package com.pac.domain.recipe;

import java.util.Date;
import java.util.List;

public class RecipeBoard {
    Date createdDate;
    String description;
    int recipeId;
    String imgPath;
    int kcal;
    int orderNum;
    String title;

    public RecipeBoard(Date createdDate, String description, int recipeId, String imgPath, int kcal, int orderNum, String title) {
        this.createdDate = createdDate;
        this.description = description;
        this.recipeId = recipeId;
        this.imgPath = imgPath;
        this.kcal = kcal;
        this.orderNum = orderNum;
        this.title = title;
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

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
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
