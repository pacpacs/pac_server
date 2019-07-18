package com.pac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pac.model.dao.UserDAO;
import com.pac.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	/*
	 * sample code to connect with flutter application
	 * 
	@GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HashMap<String, String>> sayHello() {
		// Get data from service layer into entityList.

		HashMap<String, String> entity = new HashMap();
		entity.put("key", "Pick AND Cook");

		return new ResponseEntity<HashMap<String, String>>(entity, HttpStatus.OK);
	}*/
	
	@GetMapping("/")
	public List<UserDAO> getAllUsers(){
		
		List<UserDAO> userList = userService.getAllUser();
		return userList;
		
	}
}
