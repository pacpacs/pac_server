package com.pac.controller;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.service.CommunityService;
import com.pac.service.RecipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {

    Logger log = LoggerFactory.getLogger("com.pac.controller.RecipeController");

    @Autowired
    RecipeService recipeService;

    @Autowired
    CommunityService communityService;

    @GetMapping("/")
    public ResponseEntity<List<RecipeBasic>> getAllRecipes(){
        List<RecipeBasic> _getAllRecipeBasics = communityService.getAllRecipes();
        if(_getAllRecipeBasics.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(_getAllRecipeBasics);
        }
    }

	@PostMapping("/getResult")
    public ResponseEntity<List<RecipeBasic>> getResutlByKeyword(@RequestParam("ingredients") List<String>ingredients){
        return new ResponseEntity<List<RecipeBasic>>(recipeService.getRecipesByIngredients(ingredients),HttpStatus.OK);
    }



}
