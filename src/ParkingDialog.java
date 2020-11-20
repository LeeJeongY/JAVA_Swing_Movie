import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParkingDialog extends JDialog implements ActionListener, FocusListener {
	JPanel pn1;
	JLabel lbl;
	JTextField txt1, txt2;
	JComboBox box;	
	String Carnumber[]={"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ȣ"};
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnCancel, btnEnr, btnDelete;
	String str = ""; // �̷��� ���� ������ str; �̶�� ������ ó�� ���ڹ�ư�� Ŭ�������� null�� �߱� ������ ""���
	String str2 = "";
	JTextField tfCurrent;
	
	public ParkingDialog(ParkingMaintest maintest) {
		super(maintest, true);
		this.setSize(500, 340);
		this.setTitle("�������");
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		pn1 = new JPanel();
		pn1.setBackground(Color.WHITE);
		pn1.setLayout(null);
		
		lbl = new JLabel("������ ��ȣ�� �������ּ���");
		lbl.setFont(new Font("�������", Font.BOLD, 20));
		lbl.setBounds(70, -20, 300, 100);
		
		txt1 = new JTextField();
		txt1.setBounds(70, 60, 120, 20);
		txt1.addFocusListener(this);
//		txt1.setEditable(false); // �ؽ�Ʈ�ʵ忡 Ű����� ���� �Է� �� �� ���� �ϴ±��
		
		txt2 = new JTextField();
		txt2.setBounds(260, 60, 130, 20);
		txt2.addFocusListener(this);
//		txt2.setEditable(false); // �ؽ�Ʈ�ʵ忡 Ű����� ���� �Է� �� �� ���� �ϴ±��
		
		box = new JComboBox(Carnumber);
		box.setBounds(200, 60, 50, 20);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("�������", Font.PLAIN, 20));
		btn1.setBounds(80, 100, 50, 50);
		btn1.setBorderPainted(false); //��ư ���� ����
		btn1.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn1.setContentAreaFilled(false); //��ư ��� ����
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("�������", Font.PLAIN, 20));
		btn2.setBounds(140, 100, 50, 50);
		btn2.setBorderPainted(false); //��ư ���� ����
		btn2.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn2.setContentAreaFilled(false); //��ư ��� ����
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("�������", Font.PLAIN, 20));
		btn3.setBounds(200, 100, 50, 50);
		btn3.setBorderPainted(false); //��ư ���� ����
		btn3.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn3.setContentAreaFilled(false); //��ư ��� ����
		btn3.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("�������", Font.PLAIN, 20));
		btn4.setBounds(260, 100, 50, 50);
		btn4.setBorderPainted(false); //��ư ���� ����
		btn4.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn4.setContentAreaFilled(false); //��ư ��� ����
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("�������", Font.PLAIN, 20));
		btn5.setBounds(320, 100, 50, 50);
		btn5.setBorderPainted(false); //��ư ���� ����
		btn5.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn5.setContentAreaFilled(false); //��ư ��� ����
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("�������", Font.PLAIN, 20));
		btn6.setBounds(80, 160, 50, 50);
		btn6.setBorderPainted(false); //��ư ���� ����
		btn6.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn6.setContentAreaFilled(false); //��ư ��� ����
		btn6.addActionListener(this);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("�������", Font.PLAIN, 20));
		btn7.setBounds(140, 160, 50, 50);
		btn7.setBorderPainted(false); //��ư ���� ����
		btn7.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn7.setContentAreaFilled(false); //��ư ��� ����
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("�������", Font.PLAIN, 20));
		btn8.setBounds(200, 160, 50, 50);
		btn8.setBorderPainted(false); //��ư ���� ����
		btn8.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn8.setContentAreaFilled(false); //��ư ��� ����
		btn8.addActionListener(this);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("�������", Font.PLAIN, 20));
		btn9.setBounds(260, 160, 50, 50);
		btn9.setBorderPainted(false); //��ư ���� ����
		btn9.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn9.setContentAreaFilled(false); //��ư ��� ����
		btn9.addActionListener(this);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("�������", Font.PLAIN, 20));
		btn0.setBounds(320, 160, 50, 50);
		btn0.setBorderPainted(false); //��ư ���� ����
		btn0.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btn0.setContentAreaFilled(false); //��ư ��� ����
		btn0.addActionListener(this);
		
		btnCancel = new JButton(new ImageIcon("Back.png"));
		btnCancel.setBorderPainted(false); //��ư ���� ����
		btnCancel.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnCancel.setContentAreaFilled(false); //��ư ��� ����
		btnCancel.setBounds(80, 220, 40, 40);	
		btnCancel.addActionListener(this);
	
		
		
		btnEnr = new JButton(new ImageIcon("Confirm.png"));
		btnEnr.setBorderPainted(false); //��ư ���� ����
		btnEnr.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnEnr.setContentAreaFilled(false); //��ư ��� ����
		btnEnr.setBounds(320, 220, 40, 40);
		btnEnr.addActionListener(this);
		
		btnDelete = new JButton("�����");
		btnDelete.setFont(new Font("�������", Font.BOLD, 20));
		btnDelete.setBorderPainted(false); //��ư ���� ����
		btnDelete.setFocusPainted(false); //��ư Ŭ�� ���� ����
		btnDelete.setContentAreaFilled(false);
		btnDelete.setBounds(170, 226, 100, 30);
		btnDelete.addActionListener(this);
			
		pn1.add(lbl);
		pn1.add(txt1);
		pn1.add(box);
		pn1.add(txt2);
		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btn5);
		pn1.add(btn6);
		pn1.add(btn7);
		pn1.add(btn8);
		pn1.add(btn9);
		pn1.add(btn0);
		pn1.add(btnCancel);
		pn1.add(btnEnr);
		pn1.add(btnDelete);
		
		this.add(pn1);
		
		this.setVisible(true);
	}
	
	// if(1) - else if(2) - else(3)
	// ���ǹ� ���� �ȿ� ���� ������ ������ if(1)���� ����
	// ���� ��ư�� Ŭ������ �� �ؽ�Ʈ�ʵ� �Է� �Ǳ�
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnDelete) { // ����� ��ư�� Ŭ��������
			if(tfCurrent == txt1 && !txt1.getText().trim().equals("")) { // txt1�� tfCurrent�� ���� txt1�� ����ִ� ���� ������ �ƴϸ�
				// tfCurrent�� ��Ŀ����(Ŀ����ġ)�� ����
				txt1.setText((txt1.getText()).substring(0, txt1.getText().length() - 1)); // txt1�� �� ���̸� �ҷ��ͼ� ���������� �Ѱ��� �ڸ���.
				str = txt1.getText(); // txt1�� �ڸ����� str�� ����
			}
			
			if(tfCurrent == txt2 && !txt2.getText().trim().equals("")) { 
				txt2.setText((txt2.getText()).substring(0, txt2.getText().length() - 1));
				str2 = txt2.getText();
			} // ����� ��ư�� �������� �۵��ϴ� �ڵ�
		} else if(e.getSource() == btnEnr) { // ��� ��ư�� Ŭ��������
			 if (str.length() == 2 && str2.length() == 4) { // str�� txt1�� �� str2�� txt2�� �� �׷��� ù��° �ؽ�Ʈ�ʵ��� ���� 2�鼭 4��
			String[] data = new String[3]; // txt1, box(�޺��ڽ�), txt2�� �迭�� ����
			data[0] = txt1.getText();
			data[1] = box.getSelectedItem().toString(); // tostring�� ���ڿ��� ǥ�� 
			data[2] = txt2.getText();
			new ParkingEnrDialog(data, this); // ��� ��ư�� Ŭ�������� �ڽ� Ŭ������ ParkingEnrDialog�� �ҷ����� ������ ��
			this.setVisible(false); // �ڽ� Ŭ�������� Ȯ�� ��ư�� ������ �θ� Ŭ������ ����
			} else {
				JOptionPane.showMessageDialog(null, "������ȣ�� �������ּ���."); // ���� �������� ������ �˾�â ���
			} // ��Ϲ�ư�� Ŭ�������� �۵��ϴ� �ڵ�
		} else {
			JButton btn = (JButton)e.getSource();
			if(tfCurrent == txt1) {
				str = str + btn.getActionCommand();
				tfCurrent.setText(str);	
				if(txt1.getText().length() > 2){
					str = "";
					txt1.setText("");
					JOptionPane.showMessageDialog(null, "2�ڸ��� ���� �����մϴ�.");
				}
			} else {
				str2 = str2 + btn.getActionCommand();
				tfCurrent.setText(str2);
				if(txt2.getText().length() > 4){
					str2 = "";
					txt2.setText("");
					JOptionPane.showMessageDialog(null, "4�ڸ��� ���� �����մϴ�.");
				}
			} // ���� ��ư�� Ŭ�������� �ؽ�Ʈ�ʵ忡 ���� �ڵ�
		}
	}

	// ��Ŀ�� Ŭ���Ҷ� ����ϴ� �޼ҵ�
	@Override
	public void focusGained(FocusEvent arg0) { // ��Ŀ��  �̺�Ʈ�� ���� Ŀ����ġ�� ���� �ǽð����� �ٲ�
		if(arg0.getSource() == txt1){
			tfCurrent = txt1;
		} else {
			tfCurrent = txt2;

		}
	}

	@Override
	public void focusLost(FocusEvent arg0) {}

	/*public static void main(String[] args) {
			new ParkingDialog();
	}*/
}