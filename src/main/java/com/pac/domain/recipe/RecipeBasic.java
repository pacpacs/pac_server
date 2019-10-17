package com.pac.domain.recipe;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pac.domain.User;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection="recipe_basic")
public class RecipeBasic implements Comparable<RecipeBasic>{

    @Id
    @JsonProperty("_id")
    //@Indexed(unique = true)
    private ObjectId _id;

    @JsonProperty("detUrl")
    private String detUrl;

    @JsonProperty("irdntCode")
    private String irdntCode;

    @JsonProperty("imgUrl")
    private String imgUrl;

    @JsonProperty("nationCode")
    private String nationCode;

    @JsonProperty("sumry")
    private String sumry;

    @JsonProperty("calorie")
    private String calorie;

    @JsonProperty("tyCode")
    private String tyCode;

    @JsonProperty("recipeNmKo")
    private String recipeNmKo;

    @JsonProperty("rn") //INT
    private Integer rn;

    @JsonProperty("qnt")
    private String qnt;

    @JsonProperty("pcNm")
    private String pcNm;//price

    @JsonProperty("tyNm")
    private String tyNm;//type

    @JsonProperty("levelNm")
    private String levelNm;

    @JsonProperty("recipeId")//INT
    private Integer recipeId;

    @JsonProperty("nationNm")
    private String nationNm;

    @JsonProperty("cookingTime")
    private String cookingTime;

    private double percenatge;

    private Date createdDate;

    @JsonProperty("authorId")
    String author;


    public RecipeBasic(ObjectId _id, String detUrl, String irdntCode, String imgUrl, String nationCode, String sumry,
                       String calorie, String tyCode, String recipeNmKo, Integer rn, String qnt, String pcNm, String tyNm,
                       String levelNm, Integer recipeId, String nationNm, String cookingTime) {
        this._id = _id;
        this.detUrl = detUrl;
        this.irdntCode = irdntCode;
        this.imgUrl = imgUrl;
        this.nationCode = nationCode;
        this.sumry = sumry;
        this.calorie = calorie;
        this.tyCode = tyCode;
        this.recipeNmKo = recipeNmKo;
        this.rn = rn;
        this.qnt = qnt;
        this.pcNm = pcNm;
        this.tyNm = tyNm;
        this.levelNm = levelNm;
        this.recipeId = recipeId;
        this.nationNm = nationNm;
        this.cookingTime = cookingTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String get_id() { return _id.toHexString(); }

    public String getDetUrl(){ return detUrl; }

    public void setDetUrl(String detUrl){ this.detUrl = detUrl; }

    public String getIrdntCode() { return irdntCode; }

    public void setIrdntCode(String irdntCode) { this.irdntCode = irdntCode; }

    public String getImgUrl() { return imgUrl; }

    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

    public String getNationCode() { return nationCode; }

    public void setNationCode(String nationCode) { this.nationCode = nationCode; }

    public String getSumry() { return sumry; }

    public void setSumry(String sumry) { this.sumry = sumry; }

    public String getCalorie() { return calorie; }

    public void setCalorie(String calorie) { this.calorie = calorie; }

    public String getTyCode() { return tyCode; }

    public void setTyCode(String tyCode) { this.tyCode = tyCode; }

    public String getRecipeNmKo() { return recipeNmKo; }

    public void setRecipeNmKo(String recipeNmKo) { this.recipeNmKo = recipeNmKo; }

    public Integer getRn() { return rn; }

    public void setRn(Integer rn) { this.rn = rn; }

    public String getQnt() { return qnt; }

    public void setQnt(String qnt) { this.qnt = qnt; }

    public String getPcNm() { return pcNm; }

    public void setPcNm(String pcNm) { this.pcNm = pcNm; }

    public String getTyNm() { return tyNm; }

    public void setTyNm(String tyNm) { this.tyNm = tyNm; }

    public String getLevelNm() { return levelNm; }

    public void setLevelNm(String levelNm) { this.levelNm = levelNm; }

    public Integer getRecipeId() { return recipeId; }

    public void setRecipeId(Integer recipeId) { this.recipeId = recipeId; }

    public String getNationNm() { return nationNm; }

    public void setNationNm(String nationNm) { this.nationNm = nationNm; }

    public String getCookingTime() { return cookingTime; }

    public void setCookingTime(String cookingTime) { this.cookingTime = cookingTime; }

    public double getPercenatge() { return percenatge;}

    public void setPercenatge(double percenatge) { this.percenatge = percenatge; }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public int compareTo(RecipeBasic recipeBasic) {

        if(recipeBasic.percenatge<this.percenatge){
           return -1;
        }else if(recipeBasic.percenatge==this.percenatge){
            if(recipeBasic.recipeId<this.recipeId){
                return -1;
            }
            return 0;
        }else{
            return 0;
        }

    }
}
