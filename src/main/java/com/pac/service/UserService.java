package com.pac.service;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.pac.domain.UserList;
import com.pac.domain.User;
import com.pac.repository.UserRepository;

@Service("UserService")
public class UserService {
	

	Logger log = LoggerFactory.getLogger("com.pac.service.UserService");


	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ImageService imageService;
		
	public List<User> getAllUsers(){
		List<User> userList = userRepository.findAll();
		
		return userList;
		
	}
	
	public User getUserById(String userId) {
		return userRepository.findByUserId(userId);
		
	}

	
	//TODO authentication �߰�
	public User login(String userId, String password) {
		User user = getUserById(userId);
		log.info(user.getUserId());
		if(user.getPassword().equals(password))
			return user;
		else return null;
	}
	
	public User register(User user) throws Exception {
		log.info(user.getUserId());
		
		User tmpUser = new User(user.getUserId(),user.getNickName(),user.getPassword(),user.getImgPath());
		User registeredUser = userRepository.insert(tmpUser); 		
		return registeredUser;
	}

	
}
