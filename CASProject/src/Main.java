import javax.swing.WindowConstants;

public class Main {
	
	public static void main(String[] args) {
		Frame frame = new Frame("Mundo Dodgeball");
		frame.setSize(1200, 800);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false); 
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
