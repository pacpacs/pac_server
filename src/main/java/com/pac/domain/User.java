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

	@JsonProperty("userId")
	@Indexed(unique = true)
	private String userId;

	@JsonProperty("nickName")
	private String nickName;

	@JsonProperty("password")
	private String password;

	@JsonProperty("imgPath")
	private String imgPath;
	
	public User() {
		
	}
	
	public User(ObjectId _id, String userId, String nickName, String password, String imgPath) {
		this._id = _id;
		this.userId=userId;
		this.nickName =  nickName;
		this.password = password;
		this.imgPath = imgPath;
	}

	public String get_id() {
		return _id.toHexString();
	}	
	
	public String getUserId() {
		return userId;
	}

	public void setUserId (String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
}
