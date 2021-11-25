import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("衣服團購系統");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 600);
		/*
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0,0,484,411);
		frame.getContentPane().add(scrollPane);
		*/
		InitiatePanel initiatePanel = new InitiatePanel();
		frame.add(initiatePanel);
		//scrollPane.add(initiatePanel);
		
		frame.setVisible(true);
	}
}
