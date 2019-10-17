package com.pac.domain.recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipe_process")
public class RecipeProcess {
    @Id
    @JsonProperty("_id")
    //@Indexed(unique = true)
    private ObjectId _id;

    @JsonProperty("streStepImageUrl")
    private String streStepImageUrl;

    @JsonProperty("stepTip")
    private String stepTip;

    @JsonProperty("rn")
    private int rn;

    @JsonProperty("recipeId")
    private  int recipeId;

    @JsonProperty("cookingDc")
    private String cookingDc;

    @JsonProperty("cookingNo")
    private  int cookingNo;

    public RecipeProcess(ObjectId _id, String streStepImageUrl, String stepTip, int rn, int recipeId, String cookingDc, int cookingNo) {
        this._id = _id;
        this.streStepImageUrl = streStepImageUrl;
        this.stepTip = stepTip;
        this.rn = rn;
        this.recipeId = recipeId;
        this.cookingDc = cookingDc;
        this.cookingNo = cookingNo;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getStreStepImageUrl() {
        return streStepImageUrl;
    }

    public void setStreStepImageUrl(String streStepImageUrl) {
        this.streStepImageUrl = streStepImageUrl;
    }

    public String getStepTip() {
        return stepTip;
    }

    public void setStepTip(String stepTip) {
        this.stepTip = stepTip;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getCookingDc() {
        return cookingDc;
    }

    public void setCookingDc(String cookingDc) {
        this.cookingDc = cookingDc;
    }

    public int getCookingNo() {
        return cookingNo;
    }

    public void setCookingNo(int cookingNo) {
        this.cookingNo = cookingNo;
    }
}
