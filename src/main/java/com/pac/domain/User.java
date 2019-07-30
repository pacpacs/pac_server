package com.pac.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class User {
	
	@Id
	@JsonProperty("_id")
	private ObjectId _id;

	@JsonProperty("user_id")
	@Indexed(unique = true)
	private String user_id;

	@JsonProperty("nick_name")
	private String nick_name;

	@JsonProperty("password")
	private String password;

	@JsonProperty("img_path")
	private String img_path;
	
	public User(ObjectId _id, String user_id, String nick_name, String password, String img_path) {
		this._id = _id;
		this.user_id=user_id;
		this.nick_name =  nick_name;
		this.password = password;
		this.img_path = img_path;
	}

	public String get_id() {
		return _id.toHexString();
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
