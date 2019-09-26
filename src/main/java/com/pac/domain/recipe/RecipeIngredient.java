package com.pac.domain.recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="recipe_ingredients")
public class RecipeIngredient {
    @Id
    @JsonProperty("_id")
    //@Indexed(unique = true)
    private ObjectId _id;

    @JsonProperty("irdntCpcty")
    private String irdntCpcty;

    @JsonProperty("irdntNm")
    private String irdntNm;

    @JsonProperty("irdntSn")
    private int irdntSn;

    @JsonProperty("rn")
    private int rn;

    @JsonProperty("irdntTyNm")
    private String irdntTyNm;

    @JsonProperty("recipeId")
    private int recipeId;

    @JsonProperty("irdntTyCode")
    private String irdntTyCode;

    public RecipeIngredient(ObjectId _id, String irdntCpcty, String irdntNm, int irdntSn, int rn, String irdntTyNm, int recipeId, String irdntTyCode) {
        this._id = _id;
        this.irdntCpcty = irdntCpcty;
        this.irdntNm = irdntNm;
        this.irdntSn = irdntSn;
        this.rn = rn;
        this.irdntTyNm = irdntTyNm;
        this.recipeId = recipeId;
        this.irdntTyCode = irdntTyCode;
    }

    public ObjectId get_id() {
        return _id;
    }

    public String getIrdntCpcty() {
        return irdntCpcty;
    }

    public void setIrdntCpcty(String irdntCpcty) {
        this.irdntCpcty = irdntCpcty;
    }

    public String getIrdntNm() {
        return irdntNm;
    }

    public void setIrdntNm(String irdntNm) {
        this.irdntNm = irdntNm;
    }

    public int getIrdntSn() {
        return irdntSn;
    }

    public void setIrdntSn(int irdntSn) {
        this.irdntSn = irdntSn;
    }

    public int getRn() {
        return rn;
    }

    public void setRn(int rn) {
        this.rn = rn;
    }

    public String getIrdntTyNm() {
        return irdntTyNm;
    }

    public void setIrdntTyNm(String irdntTyNm) {
        this.irdntTyNm = irdntTyNm;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getIrdntTyCode() {
        return irdntTyCode;
    }

    public void setIrdntTyCode(String irdntTyCode) {
        this.irdntTyCode = irdntTyCode;
    }
}
