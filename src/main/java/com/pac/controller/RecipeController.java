package com.pac.controller;

import com.pac.domain.recipe.RecipeBasic;
import com.pac.service.RecipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Seo YunKyung
 *
 *
 */
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    Logger log = LoggerFactory.getLogger("com.pac.controller.RecipeController");

    @Autowired
    RecipeService recipeService;

    @GetMapping("/")
	public ResponseEntity<List<RecipeBasic>> getAllRecipes(){
		return new ResponseEntity<List<RecipeBasic>>(recipeService.getAllRecipes(), HttpStatus.OK);
	}

	@PostMapping("/getResult")
    public ResponseEntity<List<RecipeBasic>> getResutlByKeyword(@RequestParam("key") List<String>keys){



        return new ResponseEntity<List<RecipeBasic>>(recipeService.getRecipesByKeyword(keys),HttpStatus.OK);
    }



}
