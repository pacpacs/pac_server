package com.pac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.domain.UserList;
import com.pac.domain.User;
import com.pac.repository.UserRepository;

@Service("UserService")
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	private UserList userListVO;
	
	public UserList getAllUsers(){
		List<User> userList = userRepository.findAll();

		userListVO = new UserList(userList);


		return userListVO;
		
	}
	
	public User getUserById(String user_id) {
		return null;
//		User user = userRepository.findOne(user_id);
		
	}

	
}
