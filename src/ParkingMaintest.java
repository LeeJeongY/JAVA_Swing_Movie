import javax.swing.JFrame;

public class ParkingMaintest extends JFrame {
	ParkingMain main;
	
	public ParkingMaintest() {
		main = new ParkingMain(this);
		this.setSize(700, 1000);
		this.setDefaultCloseOperation(3);
		this.add(main);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ParkingMaintest();
	}
}
