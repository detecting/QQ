/**
 * 
 */
package com.qq.client.model;

import com.qq.common.User;

/**
 * @author 16248223 后台登陆链接; 涉及到user的业务逻辑类都走这个；
 */
public class QQClientUser {
	// 验证用户是否合法的方法；
	public boolean checkUser(User user) {
		return new QQClientConServer().sendLoginInfoToServer(user);

	}
}