package Client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.common.User;

public class MyClient {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient myClient = new MyClient();
	}

	public MyClient() {

		try {
			Socket socket = new Socket("127.0.0.1", 3456);
			// 通过ObjectOutputStream 给服务器传递对象；
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
			User user = new User();
			user.setName("huamin");
			user.setPassword("mprgan1985");
			
			// send the User
			objectOutputStream.writeObject(user);
			System.out.println("OK");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//

	}
}
