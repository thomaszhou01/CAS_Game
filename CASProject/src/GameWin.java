import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameWin  extends JPanel implements ActionListener{


	public GameWin() {
		super();
		this.setLayout(null);
		
		
		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
		this.setBounds(200, 50, 800, 650);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("YOU WIN", 250, 250);
		repaint();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public void setFocus() {
		this.setFocusable(true);
		this.requestFocusInWindow();
	}
}
