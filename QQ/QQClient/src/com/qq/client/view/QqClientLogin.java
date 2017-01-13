/*
 * QQ客户端登陆界面；
 */
package com.qq.client.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import com.qq.client.model.QQClientUser;
import com.qq.common.User;

public class QqClientLogin extends JFrame implements ActionListener {
	// 定义北部需要的组件
	JLabel jLabel = null;
	// 中部需要的组件,
	JTabbedPane jTabbedPane = null;
	JPanel jPanel2, jPanel3, jPanel4;

	JLabel jPanel2_jLabel1, jPanel2_jLabel2, jPanel2_jLabel3, jPanel2_jLabel4;
	JButton jPanel2_jButton;
	JTextField jPanel2_jTextField;
	JPasswordField jPanel2_jPasswordField;
	JCheckBox jPanel2_jCheckBox, jPanel2_jCheckBox2;

	// 南部需要的组件
	JPanel jPanel;
	JButton jPanel_jButton, jPanel_jButton2, jPanel_jButton3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QqClientLogin qqClientLogin = new QqClientLogin();
	}

	public QqClientLogin() {

		// 处理北部
		// ********************注意图片的添加格式
		jLabel = new JLabel(new ImageIcon("image/tou.gif"));

		// 处理中部；中间有三个jpanel， 有一个叫做选项卡窗口管理；
		jTabbedPane = new JTabbedPane();
		// 第一个选项卡的内容；网格布局
		jPanel2 = new JPanel(new GridLayout(3, 3));
		jPanel3 = new JPanel(new GridLayout(3, 3));
		jPanel4 = new JPanel(new GridLayout(3, 3));

		jPanel2_jLabel1 = new JLabel("QQ号码", JLabel.CENTER);
		jPanel2_jLabel2 = new JLabel("QQ密码", JLabel.CENTER);
		jPanel2_jLabel3 = new JLabel("忘记密码", JLabel.CENTER);
		// 修改字体颜色；前景色；
		jPanel2_jLabel3.setForeground(Color.blue);
		jPanel2_jLabel4 = new JLabel("申请密码保护", JLabel.CENTER);

		jPanel2_jButton = new JButton(new ImageIcon("image/clear.gif"));
		jPanel2_jTextField = new JTextField();
		jPanel2_jPasswordField = new JPasswordField();
		jPanel2_jCheckBox = new JCheckBox("隐身登录");
		jPanel2_jCheckBox2 = new JCheckBox("记住密码");
		// 把控件加入到jPanel2,从上倒下，从左到 右；
		jPanel2.add(jPanel2_jLabel1);
		jPanel2.add(jPanel2_jTextField);
		jPanel2.add(jPanel2_jButton);
		jPanel2.add(jPanel2_jLabel2);
		jPanel2.add(jPanel2_jPasswordField);
		jPanel2.add(jPanel2_jLabel3);
		jPanel2.add(jPanel2_jCheckBox);
		jPanel2.add(jPanel2_jCheckBox2);
		jPanel2.add(jPanel2_jLabel4);

		// 创建选项卡
		jTabbedPane = new JTabbedPane();
		jTabbedPane.add("QQ号码", jPanel2);
		jTabbedPane.add("手机号码", jPanel3);
		jTabbedPane.add("电子邮件", jPanel4);

		// 处理南部
		// jpanel 流布局
		jPanel = new JPanel();
		// 登陆按钮；
		jPanel_jButton = new JButton(new ImageIcon("image/denglu.gif"));
		jPanel_jButton.addActionListener(this);
		// 取消按钮
		jPanel_jButton2 = new JButton(new ImageIcon("image/quxiao.gif"));
		jPanel_jButton2.addActionListener(this);
		// 注册向导
		jPanel_jButton3 = new JButton(new ImageIcon("image/xiangdao.gif"));
		jPanel_jButton3.addActionListener(this);

		// 加入到jp中
		jPanel.add(jPanel_jButton);
		jPanel.add(jPanel_jButton2);
		jPanel.add(jPanel_jButton3);

		// 下面实际上是要把选项卡加在中间；jTabbedPane
		this.add(jTabbedPane, "Center");
		this.add(jLabel, "North");
		this.add(jPanel, "South");
		this.setSize(350, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jPanel_jButton) {
			QQClientUser qqClientUser = new QQClientUser();
			User user = new User();
			user.setUserId(jPanel2_jTextField.getText().trim());

			// ******************
			// 密码这块需要注意一下；得到的是字符串数组；
			user.setPasswd(new String(jPanel2_jPasswordField.getPassword()));

		}

	}

}
