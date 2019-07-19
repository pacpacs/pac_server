package com.pac.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pac.model.dao.UserDAO;
import com.pac.repositories.UserRepository;

@Service("UserService")
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<Map<String, String>> getAllUsers(){
		List<UserDAO> userList = userRepository.findAll();
		
		return makeListtoListMap(userList);
		
	}

	private List<Map<String, String>> makeListtoListMap(List<UserDAO> userList) {
		// TODO Auto-generated method stub
		
	
		List<Map<String,String>> users = new ArrayList<>();;
		for(UserDAO user:userList) {
			HashMap<String, String> entity = new HashMap<String, String>();
			entity.put("user_id",user.getUser_id());
			entity.put("nick_name",user.getNick_name());
			entity.put("password",user.getPassword());
			entity.put("img_path",user.getImg_path());		

			users.add(entity);
		}
		return users;
	}
}
