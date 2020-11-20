import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ParkingEnrDialog extends JDialog implements ActionListener {
	JPanel pn;
	JLabel lblEnr, lblEnr1, lblEnr2;
	JButton btnOk;
	ImageIcon car;
	JLabel carlb;
	
	public ParkingEnrDialog(String data[], ParkingDialog pdialog) {
		super(pdialog, true);
		this.setTitle("������ϿϷ�");
		this.setSize(500, 340);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		car = new ImageIcon("car.png");
		carlb = new JLabel(car);
		carlb.setBounds(15, 15, 180, 180);
		
		pn = new JPanel();
		pn.setLayout(null);
		pn.setBackground(Color.WHITE);
		
		lblEnr = new JLabel(data[0]+""+data[1]+""+data[2]);
		lblEnr.setFont(new Font("�������", Font.BOLD, 25));
		lblEnr.setBounds(250, 50, 200, 35);
		
		lblEnr1 = new JLabel("��� �Ϸ�!");
		lblEnr1.setFont(new Font("�������", Font.BOLD, 35));
		lblEnr1.setBounds(250, 120, 200, 40);
		
		lblEnr2 = new JLabel("���� ���� ���� �ð��� 3�ð� �Դϴ�.");
		lblEnr2.setFont(new Font("�������", Font.BOLD, 15));
		lblEnr2.setBounds(125, 200, 400, 40);
		
		btnOk = new JButton(new ImageIcon("Confirm2.png"));
		btnOk.setBorderPainted(false); //��ư ���� ����
		btnOk.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnOk.setContentAreaFilled(false); //��ư ��� ����
		btnOk.setBounds(225, 250, 40, 40);
		btnOk.addActionListener(this);
		
		pn.add(lblEnr);
		pn.add(lblEnr1);
		pn.add(lblEnr2);
		pn.add(btnOk);
		pn.add(carlb);
		
		this.add(pn);
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			this.setVisible(false);
		}
	}
}
