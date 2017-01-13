/*
 * 这是服务器端的控制界面
 * 启动服务器，关闭服务器，可以监控用户，强制某个用户下线；
 */
package com.qq.server.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyServerFrame extends JFrame {

	JPanel jPanel;
	JButton jButton, jButton2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServerFrame myServerFrame = new MyServerFrame();
	}

public MyServerFrame(){
		jPanel = new JPanel();
		jButton = new JButton("启动服务器");
		jButton2 = new JButton("关闭服务器");

		jPanel.add(jButton);
		jPanel.add(jButton2);

		this.add(jPanel);

		this.setSize(500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}
