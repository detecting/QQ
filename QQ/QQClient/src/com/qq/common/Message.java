package com.qq.common;

import java.io.Serializable;

public class Message implements Serializable{
	private String msgType;

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

}
