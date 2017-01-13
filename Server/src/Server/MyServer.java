package Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.common.User;

public class MyServer {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		MyServer myServer = new MyServer();
	}

	public MyServer() throws ClassNotFoundException {
		try

		{
			// 在3456端口进行监听；
			ServerSocket serverSocket = new ServerSocket(3456);
			Socket socket = serverSocket.accept();
			// 假设用户发送的是User对象；
			// 以对象流的方式读取
			// *******************
			ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
			User user=(User) objectInputStream.readObject();
			System.out.println("Name=" + user.getName() + "Password=" + user.getPassword());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
