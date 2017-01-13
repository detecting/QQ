/*
 * ÎÒµÄºÃÓÑÁÐ±í£ºÄ°ÉúÈË£¬ºÚÃûµ¥
 */
package com.qq.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class QQFriendList extends JFrame implements ActionListener,
		MouseListener {
	// ´¦ÀíµÚÒ»ÕÅ¿¨Æ¬£»
	JPanel jPanel_Friends1, jPanel_Friends2, jPanel_Friends3;
	JButton jButton_Friends1, jButton_Friends2, jButton_Friends3;
	JScrollPane jScrollPane_Friends;

	// ´¦ÀíµÚ¶þÕÅ¿¨Æ¬
	JPanel jPanel_Unknown1, jPanel_Unknown2, jPanel_Unknown3;
	JButton jButton_Unknown1, jButton_Unknown2, jButton_Unknown3;
	JScrollPane jScrollPane_Unknown;

	// ´¦ÀíµÚ¶þÕÅ¿¨Æ¬
	JPanel jPanel_Block1, jPanel_Block2, jPanel_Block3;
	JButton jButton_Block1, jButton_Block2, jButton_Block3;
	JScrollPane jScrollPane_Block;

	// °ÑÕû¸öJframe ÉèÖÃ³ÉÒ»¸öcardLayoutµÄ²¼¾Ö£»ÎªÏÈÕ¹Ê¾ÇÐ»»µÄÐ§¹û£»
	CardLayout cardLayout = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QQFriendList qqFriendList = new QQFriendList();
	}

	public QQFriendList() {
		// ´¦ÀíµÚÒ»ÕÅ¿¨Æ¬£¬µÚÒ»¸öÊÇ×î´óµÄpanel,border layout
		jPanel_Friends1 = new JPanel(new BorderLayout());
		// ÖÐ¼äµÄpanel£»¼Ù¶¨ÓÐ50¸öºÃÓÑ£¬Íø¸ñ²¼¾Ö,ºóÃæµÄ 4 4ÊÇÐÐ¼ä¾àºÍÁÐ¼ä¾à£»
		jPanel_Friends2 = new JPanel(new GridLayout(50, 1, 4, 4));

		// ¸øjPanel_Friends2 ³õÊ¼»¯ 50¸öºÃÓÑ£»
		// ´´½¨ jLable Êý×é£»
		JLabel[] jLabels = new JLabel[50];
		// ³õÊ¼»¯
		for (int i = 0; i < jLabels.length; i++) {
			// i+1 ±íÊ¾±àºÅ£¬¾¡Á¿¿¿×ó
			jLabels[i] = new JLabel(i + 1 + " ", new ImageIcon("image/mm.jpg"),
					JLabel.LEFT);
			jLabels[i].addMouseListener(this);
			jPanel_Friends2.add(jLabels[i]);
		}

		// ×îÄÏ±ßµÄpanel
		jPanel_Friends3 = new JPanel(new GridLayout(2, 1));

		jButton_Friends1 = new JButton("ÎÒµÄºÃÓÑ ");
		jButton_Friends1.addActionListener(this);
		jButton_Friends2 = new JButton("Ä°ÉúÈË");
		jButton_Friends2.addActionListener(this);
		jButton_Friends3 = new JButton("ºÚÃûµ¥");
		jButton_Friends3.addActionListener(this);

		jPanel_Friends3.add(jButton_Friends2);
		jPanel_Friends3.add(jButton_Friends3);

		jScrollPane_Friends = new JScrollPane(jPanel_Friends2);

		// ·ÅÔÚµÚÒ»¸öpanelÖÐ£»³õÊ¼»¯£»
		jPanel_Friends1.add(jButton_Friends1, "North");
		jPanel_Friends1.add(jScrollPane_Friends, "Center");
		jPanel_Friends1.add(jPanel_Friends3, "South");

		// ÉèÖÃ

		// ¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª¡ª
		// ´¦ÀíµÚ¶þ¸ö¿¨Æ¬
		// ´¦ÀíµÚÒ»ÕÅ¿¨Æ¬£¬µÚÒ»¸öÊÇ×î´óµÄpanel,border layout
		jPanel_Unknown1 = new JPanel(new BorderLayout());
		// ÖÐ¼äµÄpanel£»¼Ù¶¨ÓÐ50¸öºÃÓÑ£¬Íø¸ñ²¼¾Ö,ºóÃæµÄ 4 4ÊÇÐÐ¼ä¾àºÍÁÐ¼ä¾à£»
		jPanel_Unknown2 = new JPanel(new GridLayout(2, 1));
		jPanel_Unknown3 = new JPanel(new GridLayout(50, 1, 4, 4));

		jButton_Unknown1 = new JButton("ÎÒµÄºÃÓÑ");
		jButton_Unknown1.addActionListener(this);
		jButton_Unknown2 = new JButton("Ä°ÉúÈË");
		jButton_Unknown2.addActionListener(this);
		jButton_Unknown3 = new JButton("ºÚÃûµ¥");
		jButton_Unknown3.addActionListener(this);

		cardLayout = new CardLayout();

		// ¸øjPanel_Friends2 ³õÊ¼»¯ 50¸öºÃÓÑ£»
		// ´´½¨ jLable Êý×é£»
		JLabel[] jLabels1 = new JLabel[50];
		// ³õÊ¼»¯
		for (int j = 0; j < jLabels1.length; j++) {
			// i+1 ±íÊ¾±àºÅ£¬¾¡Á¿¿¿×ó
			jLabels1[j] = new JLabel(j + 1 + " ",
					new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jLabels1[j].addMouseListener(this);
			jPanel_Unknown3.add(jLabels1[j]);
		}

		// ×î±±±ßµÄpanel

		jPanel_Unknown2.add(jButton_Unknown1);
		jPanel_Unknown2.add(jButton_Unknown2);
		// ÖÐ¼ä£»
		jScrollPane_Unknown = new JScrollPane(jPanel_Unknown3);
		// ÄÏ±ß

		// ·ÅÔÚµÚÒ»¸öpanelÖÐ£»³õÊ¼»¯£»
		jPanel_Unknown1.add(jPanel_Unknown2, "North");
		jPanel_Unknown1.add(jScrollPane_Unknown, "Center");
		jPanel_Unknown1.add(jButton_Unknown3, "South");

		// ------------------
		// ´¦ÀíµÚÈý¸ö¿¨Æ¬£»
		jPanel_Block1 = new JPanel(new BorderLayout());
		// ÖÐ¼äµÄpanel£»¼Ù¶¨ÓÐ50¸öºÃÓÑ£¬Íø¸ñ²¼¾Ö,ºóÃæµÄ 4 4ÊÇÐÐ¼ä¾àºÍÁÐ¼ä¾à£»
		jPanel_Block2 = new JPanel(new GridLayout(3, 1));
		jPanel_Block3 = new JPanel(new GridLayout(50, 1, 4, 4));

		jButton_Block1 = new JButton("ÎÒµÄºÃÓÑ");
		jButton_Block1.addActionListener(this);
		jButton_Block2 = new JButton("Ä°ÉúÈË");
		jButton_Block2.addActionListener(this);
		jButton_Block3 = new JButton("ºÚÃûµ¥");
		jButton_Block3.addActionListener(this);

		// ¸øjPanel_Friends2 ³õÊ¼»¯ 50¸öºÃÓÑ£»
		// ´´½¨ jLable Êý×é£»
		JLabel[] jLabels2 = new JLabel[20];
		// ³õÊ¼»¯
		for (int k = 0; k < jLabels2.length; k++) {
			// i+1 ±íÊ¾±àºÅ£¬¾¡Á¿¿¿×ó
			jLabels2[k] = new JLabel(k + 1 + " ",
					new ImageIcon("image/mm.jpg"), JLabel.LEFT);
			jLabels2[k].addMouseListener(this);
			jPanel_Block3.add(jLabels2[k]);
		}

		// ×î±±±ßµÄpanel ¼ÇÉÏÈý¸ö°´Å¥

		jPanel_Block2.add(jButton_Block1);
		jPanel_Block2.add(jButton_Block2);
		jPanel_Block2.add(jButton_Block3);

		// ÖÐ¼äºÍÄÏ±ß£»
		jScrollPane_Block = new JScrollPane(jPanel_Block3);

		// ·ÅÔÚµÚÒ»¸öpanelÖÐ£»³õÊ¼»¯£»
		jPanel_Block1.add(jPanel_Block2, "North");
		jPanel_Block1.add(jScrollPane_Block, "Center");

		// ---------------------
		// Í³Ò»ÉèÖÃ£»
		this.setTitle("QQ2013");
		// panel Õ¹Ê¾¿¨Æ¬²¼¾Ö£»
		this.setLayout(cardLayout);
		// ½«ºÃÓÑÉèÖÃ³É1ºÅ¿¨Æ¬,ºÃÓÑµÄÄ£Ê½
		this.add(jPanel_Friends1, "1");
		// Ä°ÉúÈËÎª2ºÅ¿¨Æ¬£»Ä°ÉúÈËµÄÁÐ±íÄ£Ê½£»
		this.add(jPanel_Unknown1, "2");
		this.add(jPanel_Block1, "3");

		this.setSize(200, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// ÔÚµÚÒ»ÕÅ¿¨Æ¬ÖÐ
		if (e.getSource() == jButton_Friends2) {
			// ²»ÔÊÐíJframeÖ±½Ó¿ØÖÆ¿¨Æ¬£¬ÐèÒªÍ¨¹ýpanel½øÐÐ¿ØÖÆ
			// ************************
			cardLayout.show(this.getContentPane(), "2");
		}
		if (e.getSource() == jButton_Friends3) {
			cardLayout.show(this.getContentPane(), "3");
		}
		// ÔÚµÚ¶þÕÅ¿¨Æ¬ÖÐ
		if (e.getSource() == jButton_Unknown1) {
			cardLayout.show(this.getContentPane(), "1");
		}
		if (e.getSource() == jButton_Unknown3) {
			cardLayout.show(this.getContentPane(), "3");
		}
		// ÔÚµÚÈýÕÅ¿¨Æ¬ÖÐ

		if (e.getSource() == jButton_Block1) {
			cardLayout.show(this.getContentPane(), "1");
		}
		if (e.getSource() == jButton_Block2) {
			cardLayout.show(this.getContentPane(), "2");
		}
		// ÏÔÊ¾ºÃÓÑÄÇÒ»ÕÅ¿¨Æ¬

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		// ÏìÓ¦ÓÃ»§Ë«»÷µÄÊ±¼ä£¬²¢ÇÒµÃµ½±àºÅ£»
		// ************************
		if (e.getClickCount() == 2) {
			String friendMoString = ((JLabel) e.getSource()).getText();
			System.out.println("ÄãÐèÒªºÍ" + friendMoString + "ÁÄÌì");
			QQChat qqChat = new QQChat(friendMoString);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jLabel = (JLabel) e.getSource();
		jLabel.setForeground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JLabel jLabel = (JLabel) e.getSource();
		jLabel.setForeground(Color.black);

	}
}
