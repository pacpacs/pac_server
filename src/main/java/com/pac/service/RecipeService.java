package com.pac.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.repositories.RecipeRepository;

@Service("RecipeService")
public class RecipeService {
	@Autowired
	RecipeRepository recipeRepository;
	
	public List<Map<String, String>> insertBaseData(){
		return null;
		
		
	}
}
