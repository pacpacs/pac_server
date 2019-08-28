package com.pac.controller;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.pac.domain.RecipeList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pac.domain.Recipe;
import com.pac.service.CommunityService;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    Logger log = LoggerFactory.getLogger("com.pac.controller.CommunityController");

    @Autowired
    CommunityService communityService;

    @GetMapping("/")
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        log.debug("Get ALL RECIPES");
        List<Recipe> _getAllRecipes = communityService.getAllRecipes();
        if(_getAllRecipes.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(_getAllRecipes);
        }
    }
}
