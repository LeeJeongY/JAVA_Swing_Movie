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
		
		lblParking = new JLabel("주차등록 하시겠습니까?");
		lblParking.setFont(new Font("맑은고딕", Font.PLAIN,45));
		lblParking.setForeground(Color.WHITE);
		lblParking.setBounds(100, 270, 500, 100);
		
		btnYes = new JButton("예");
		btnYes.setForeground(Color.white);
		btnYes.setBorderPainted(false); //버튼 라인 삭제
		btnYes.setFocusPainted(false); //버튼 클릭 라인 삭제
		btnYes.setContentAreaFilled(false); //버튼 배경 삭제
		btnYes.setFont(new Font("맑은고딕", Font.PLAIN,35));
		btnYes.setBounds(100, 400, 200, 100);
		btnYes.addActionListener(this);
		
		btnNo = new JButton("아니오");
		btnNo.setForeground(Color.white);
		btnNo.setBorderPainted(false); //버튼 라인 삭제
		btnNo.setFocusPainted(false); //버튼 클릭 라인 삭제
		btnNo.setContentAreaFilled(false); //버튼 배경 삭제
		btnNo.setFont(new Font("맑은고딕", Font.PLAIN,35));
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
