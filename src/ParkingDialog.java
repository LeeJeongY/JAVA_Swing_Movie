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
	String Carnumber[]={"가", "나", "다", "라", "마", "거", "너", "더", "러", "머", "버", "서", "어", "저", "고", "노", "도", "로", "모", "보", "소", "오", "조", "구", "누", "두", "루", "무", "부", "수", "우", "주", "아", "바", "사", "자", "배", "하", "허", "호"};
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnCancel, btnEnr, btnDelete;
	String str = ""; // 이렇게 쓰는 이유는 str; 이라고 잡으면 처음 숫자버튼을 클릭했을때 null로 뜨기 때문에 ""라고
	String str2 = "";
	JTextField tfCurrent;
	
	public ParkingDialog(ParkingMaintest maintest) {
		super(maintest, true);
		this.setSize(500, 340);
		this.setTitle("차량등록");
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		pn1 = new JPanel();
		pn1.setBackground(Color.WHITE);
		pn1.setLayout(null);
		
		lbl = new JLabel("차량의 번호를 선택해주세요");
		lbl.setFont(new Font("맑은고딕", Font.BOLD, 20));
		lbl.setBounds(70, -20, 300, 100);
		
		txt1 = new JTextField();
		txt1.setBounds(70, 60, 120, 20);
		txt1.addFocusListener(this);
//		txt1.setEditable(false); // 텍스트필드에 키보드로 값을 입력 할 수 없게 하는기능
		
		txt2 = new JTextField();
		txt2.setBounds(260, 60, 130, 20);
		txt2.addFocusListener(this);
//		txt2.setEditable(false); // 텍스트필드에 키보드로 값을 입력 할 수 없게 하는기능
		
		box = new JComboBox(Carnumber);
		box.setBounds(200, 60, 50, 20);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn1.setBounds(80, 100, 50, 50);
		btn1.setBorderPainted(false); //버튼 라인 삭제
		btn1.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn1.setContentAreaFilled(false); //버튼 배경 삭제
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn2.setBounds(140, 100, 50, 50);
		btn2.setBorderPainted(false); //버튼 라인 삭제
		btn2.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn2.setContentAreaFilled(false); //버튼 배경 삭제
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn3.setBounds(200, 100, 50, 50);
		btn3.setBorderPainted(false); //버튼 라인 삭제
		btn3.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn3.setContentAreaFilled(false); //버튼 배경 삭제
		btn3.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn4.setBounds(260, 100, 50, 50);
		btn4.setBorderPainted(false); //버튼 라인 삭제
		btn4.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn4.setContentAreaFilled(false); //버튼 배경 삭제
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn5.setBounds(320, 100, 50, 50);
		btn5.setBorderPainted(false); //버튼 라인 삭제
		btn5.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn5.setContentAreaFilled(false); //버튼 배경 삭제
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn6.setBounds(80, 160, 50, 50);
		btn6.setBorderPainted(false); //버튼 라인 삭제
		btn6.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn6.setContentAreaFilled(false); //버튼 배경 삭제
		btn6.addActionListener(this);
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn7.setBounds(140, 160, 50, 50);
		btn7.setBorderPainted(false); //버튼 라인 삭제
		btn7.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn7.setContentAreaFilled(false); //버튼 배경 삭제
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn8.setBounds(200, 160, 50, 50);
		btn8.setBorderPainted(false); //버튼 라인 삭제
		btn8.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn8.setContentAreaFilled(false); //버튼 배경 삭제
		btn8.addActionListener(this);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn9.setBounds(260, 160, 50, 50);
		btn9.setBorderPainted(false); //버튼 라인 삭제
		btn9.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn9.setContentAreaFilled(false); //버튼 배경 삭제
		btn9.addActionListener(this);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("맑은고딕", Font.PLAIN, 20));
		btn0.setBounds(320, 160, 50, 50);
		btn0.setBorderPainted(false); //버튼 라인 삭제
		btn0.setFocusPainted(false); //버튼 클릭 라인 삭제
		btn0.setContentAreaFilled(false); //버튼 배경 삭제
		btn0.addActionListener(this);
		
		btnCancel = new JButton(new ImageIcon("Back.png"));
		btnCancel.setBorderPainted(false); //버튼 라인 삭제
		btnCancel.setFocusPainted(false); //버튼 클릭 라인 삭제
		btnCancel.setContentAreaFilled(false); //버튼 배경 삭제
		btnCancel.setBounds(80, 220, 40, 40);	
		btnCancel.addActionListener(this);
	
		
		
		btnEnr = new JButton(new ImageIcon("Confirm.png"));
		btnEnr.setBorderPainted(false); //버튼 라인 삭제
		btnEnr.setFocusPainted(false); //버튼 클릭 라인 삭제
		btnEnr.setContentAreaFilled(false); //버튼 배경 삭제
		btnEnr.setBounds(320, 220, 40, 40);
		btnEnr.addActionListener(this);
		
		btnDelete = new JButton("지우기");
		btnDelete.setFont(new Font("맑은고딕", Font.BOLD, 20));
		btnDelete.setBorderPainted(false); //버튼 라인 삭제
		btnDelete.setFocusPainted(false); //버튼 클릭 라인 삭제
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
	// 조건문 쓸때 안에 새로 쓸때는 무조건 if(1)부터 시작
	// 숫자 버튼을 클릭했을 때 텍스트필드 입력 되기
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnDelete) { // 지우기 버튼을 클릭했을때
			if(tfCurrent == txt1 && !txt1.getText().trim().equals("")) { // txt1이 tfCurrent랑 같고 txt1에 들어있는 값이 공백이 아니면
				// tfCurrent는 포커스값(커서위치)을 정의
				txt1.setText((txt1.getText()).substring(0, txt1.getText().length() - 1)); // txt1의 값 길이를 불러와서 끝에서부터 한개씩 자른다.
				str = txt1.getText(); // txt1의 자른값을 str에 담음
			}
			
			if(tfCurrent == txt2 && !txt2.getText().trim().equals("")) { 
				txt2.setText((txt2.getText()).substring(0, txt2.getText().length() - 1));
				str2 = txt2.getText();
			} // 지우기 버튼을 눌렀을때 작동하는 코드
		} else if(e.getSource() == btnEnr) { // 등록 버튼을 클릭했을때
			 if (str.length() == 2 && str2.length() == 4) { // str은 txt1의 값 str2는 txt2의 값 그래서 첫번째 텍스트필드의 값이 2면서 4면
			String[] data = new String[3]; // txt1, box(콤보박스), txt2를 배열로 잡음
			data[0] = txt1.getText();
			data[1] = box.getSelectedItem().toString(); // tostring은 문자열로 표현 
			data[2] = txt2.getText();
			new ParkingEnrDialog(data, this); // 등록 버튼을 클릭했을때 자식 클래스인 ParkingEnrDialog를 불러오는 역할을 함
			this.setVisible(false); // 자식 클래스에서 확인 버튼을 누르면 부모 클래스도 종료
			} else {
				JOptionPane.showMessageDialog(null, "차량번호를 선택해주세요."); // 값을 선택하지 않으면 팝업창 출력
			} // 등록버튼을 클릭했을때 작동하는 코드
		} else {
			JButton btn = (JButton)e.getSource();
			if(tfCurrent == txt1) {
				str = str + btn.getActionCommand();
				tfCurrent.setText(str);	
				if(txt1.getText().length() > 2){
					str = "";
					txt1.setText("");
					JOptionPane.showMessageDialog(null, "2자리만 선택 가능합니다.");
				}
			} else {
				str2 = str2 + btn.getActionCommand();
				tfCurrent.setText(str2);
				if(txt2.getText().length() > 4){
					str2 = "";
					txt2.setText("");
					JOptionPane.showMessageDialog(null, "4자리만 선택 가능합니다.");
				}
			} // 숫자 버튼을 클릭했을때 텍스트필드에 들어가는 코드
		}
	}

	// 포커스 클릭할때 사용하는 메소드
	@Override
	public void focusGained(FocusEvent arg0) { // 포커스  이벤트는 값이 커서위치에 따라 실시간으로 바뀜
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