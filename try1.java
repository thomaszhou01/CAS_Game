import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class try1 extends JFrame {
	static JFrame f1, f2;
	static JButton button1;
	public static void main(String[]args) {
		f1 = new JFrame("Frame 1");
		f2 = new JFrame();
		
		button1 = new JButton("Click to go to frame 2");
		listener listen = new listener();
		button1.addActionListener(new actionPerformed());
		f1.add(button1);
		
		
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(300,300);
		f1.setVisible(true);
	}
	public void actionPerformed(ActionEvent event) {
		if (event.getSource()==button1)
		System.out.println("hi");
	}
}

	
