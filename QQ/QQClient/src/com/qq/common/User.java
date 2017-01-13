package com.qq.common;

import java.io.Serializable;

public class User implements Serializable {

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	private String userId;
	private String passwd;

}
