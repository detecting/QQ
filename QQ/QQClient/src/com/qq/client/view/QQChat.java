/*
 * 
 * 
 */
package com.qq.client.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QQChat extends JFrame implements ActionListener {

	/**
	 * @param args
	 */
	// ¶¨ÒåÐèÒªµÄ¶«Î÷£»
	JTextArea jTextArea = null;
	JPanel jPanel;
	JTextField jTextField = null;
	JButton jButton = null;
	JScrollPane jScrollPane = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQChat qqChat = new QQChat("");
	}

	public QQChat(String friend) {

		jTextArea = new JTextArea();
		jPanel = new JPanel();

		jTextField = new JTextField(15);
		jButton = new JButton("·¢ËÍ");
		jScrollPane = new JScrollPane(jTextArea);
		jPanel.add(jTextField);
		jPanel.add(jButton);
		jPanel.add(jScrollPane);

		this.add(jScrollPane);
		this.add(jPanel, "South");
		
		this.setTitle("你正在和"+friend+"聊天");
		this.setIconImage(new ImageIcon("image/qq.gif").getImage());
		this.setSize(300, 250);
		this.setVisible(true);
//		如果有这个，点击聊天窗口，程序窗口也会跟着关闭；
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
