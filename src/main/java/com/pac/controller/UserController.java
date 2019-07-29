package com.pac.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pac.domain.User;
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
	
	@GetMapping("")
	public ResponseEntity<List<User>> getAllUsers(){
		
		List<User> userList = userService.getAllUsers();
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
			
	}

	
}
