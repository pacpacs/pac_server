package com.pac.controller;

import java.util.List;
import java.util.Map;

import com.pac.domain.UserList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pac.domain.User;
import com.pac.service.UserService;

/**
 * @author Seo YunKyung
 *
 * 
 */
@RestController
@RequestMapping("/users")
public class UserController {
	
	Logger log = LoggerFactory.getLogger("com.pac.controller.UserController");
	
	
	@Autowired
	UserService userService;
		
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers(){
	
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
			
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Map<String, String> json) {
		
		if(!userService.login(json.get("user_id"),json.get("password"))) {
			return ResponseEntity.status(HttpStatus.OK).body("login Not success");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("login success");
	}
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		if(!userService.register(user)) {
			return ResponseEntity.status(HttpStatus.OK).body("Sorry can't register");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Welcome You are now Pick And Cook Member");
	}
	
	
	
	
	
}
