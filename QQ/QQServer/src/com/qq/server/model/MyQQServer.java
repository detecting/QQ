/*
 * 这个是真正的QQ服务器，用来监听等待某个QQ客户端连接；
 */
package com.qq.server.model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.qq.common.User;

public class MyQQServer {


	public MyQQServer() {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			// 等待链接；
			Socket socket = serverSocket.accept();
			// ***************************
			// 接受客户端发来的信息；用对象流的方式来处理会安全和多；
			// 补将对象流，在网络间传递对象；
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			try {
				User user = (User) objectInputStream.readObject();
				System.out.println("Name:" + user.getUserId() + "\r\n" + "Ps:" + user.getPasswd());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
