/*
 * 这个客户端链接服务器的部分；
 */
package com.qq.client.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.qq.common.Message;
import com.qq.common.User;

public class QQClientConServer {

	public QQClientConServer() {
		try {
			Socket socket = new Socket("127.0.0.1", 9999);
			// 将用户名和密码传递给服务器；
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			User user = new User();
			user.setUserId("huamin");
			user.setPasswd("morgan");
			objectOutputStream.writeObject(user);
			System.out.println("send ok");

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

	// 发送第一次请求
	public boolean sendLoginInfoToServer(Object object) {
		boolean b = false;
		try {
			
			Socket socket = new Socket("127.0.0.1", 9999);
//			发出登陆信息
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(object);
			// 定义Message包的类型 1 表示登陆成功 2 表示登陆失败 3 表明普通消息包；

			// 接受一个对象；
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			try {
				// 读取发过来的信息；
				Message message = (Message) objectInputStream.readObject();
				if (message.getMsgType().equals("1")) {
					b = true;

				} 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
		return b;
	}
	public void sendInfoToServer(Object object) {
		
	}

}

