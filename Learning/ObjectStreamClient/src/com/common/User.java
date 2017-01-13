package com.common;

import java.io.Serializable;

//想让这对象在网络上传输，一定需要序列化；
public class User implements Serializable {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private String name;
	private String password;

}
