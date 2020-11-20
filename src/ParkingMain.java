import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ParkingMain extends JPanel implements ActionListener {
	Image backgroundImage;
	JLabel lblParking;
	JButton btnYes, btnNo;
	ParkingMaintest test;
	public ParkingMain(ParkingMaintest test) {
		this.test = test;
		
		this.setSize(700, 1000);
		this.setLayout(null);
		
		try {
			backgroundImage = ImageIO.read(new File("Background.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		lblParking = new JLabel("������� �Ͻðڽ��ϱ�?");
		lblParking.setFont(new Font("�������", Font.PLAIN,45));
		lblParking.setForeground(Color.WHITE);
		lblParking.setBounds(100, 270, 500, 100);
		
		btnYes = new JButton("��");
		btnYes.setForeground(Color.white);
		btnYes.setBorderPainted(false); //��ư ���� ����
		btnYes.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnYes.setContentAreaFilled(false); //��ư ��� ����
		btnYes.setFont(new Font("�������", Font.PLAIN,35));
		btnYes.setBounds(100, 400, 200, 100);
		btnYes.addActionListener(this);
		
		btnNo = new JButton("�ƴϿ�");
		btnNo.setForeground(Color.white);
		btnNo.setBorderPainted(false); //��ư ���� ����
		btnNo.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnNo.setContentAreaFilled(false); //��ư ��� ����
		btnNo.setFont(new Font("�������", Font.PLAIN,35));
		btnNo.setBounds(350, 400, 200, 100);
	
		this.add(lblParking);
		this.add(btnYes);
		this.add(btnNo);
	}
	
	@Override
	protected void paintComponent(Graphics g) {	
		super.paintComponent(g);
		g.drawImage(backgroundImage,0,0,700,1000,null);			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnYes) {
			new ParkingDialog(test);
		}
	}
}
