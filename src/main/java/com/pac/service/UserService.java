package com.pac.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.domain.UserList;
import com.pac.domain.User;
import com.pac.repository.UserRepository;

@Service("UserService")
public class UserService {
	

	Logger log = LoggerFactory.getLogger("com.pac.service.UserService");


	@Autowired
	private UserRepository userRepository;
		
	public List<User> getAllUsers(){
		List<User> userList = userRepository.findAll();
		
		return userList;
		
	}
	
	public User getUserById(String user_id) {
		return userRepository.findOneByUser_id(user_id);
		
	}

	
	//TODO authentication �߰�
	public boolean login(String user_id, String password) {
		User user = getUserById(user_id);
		if(user.getPassword().equals(password))
			return true;
		else return false;
	}
	
	public boolean register(User user) {
		return true;
	}

	
}
