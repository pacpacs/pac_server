package com.pac.model.dao;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class UserDAO {

	@Id
	private ObjectId _id;
	private String user_id;
	private String nick_name;
	private String password;
	private String img_path;
	
	public UserDAO(ObjectId _id, String user_id, String nick_name, String password, String img_path) {
		this._id = _id;
		this.setUser_id(user_id);
		this.setNick_name(nick_name);
		this.setPassword(password);
		this.setImg_path(img_path);
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}
	
}
