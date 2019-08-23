package com.pac.controller;

import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
	public ResponseEntity<User> login( @RequestParam  Map<String, String> json) {
		log.info(json.toString());
		User user = userService.login(json.get("userId"),json.get("password"));
				
		if(user==null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
		}
		else{
			return ResponseEntity.status(HttpStatus.OK).body(user);}
		}
	
	//image 파일과 같이 들어와 ResponseBody를 이용해 바로 User mapping보단 multipartHttpServletRequest를 선택
	@PostMapping("/register")
	public ResponseEntity register(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) throws Exception {
		
		multipartRequest.setCharacterEncoding("utf-8");
		userService.register(multipartRequest);	
		
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
	
	
	
	
}
