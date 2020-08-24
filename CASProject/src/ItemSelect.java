import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ItemSelect extends JPanel implements ActionListener{

	
	private JButton playAgain;
	
	public static boolean resumePlay;
	public Game game;
	
	public ItemSelect() {
		super();
		this.setLayout(null);
		
		playAgain = new JButton("Play");
		playAgain.setBounds(300, 550, 200, 50);
		playAgain.setBackground(Color.orange);
		playAgain.addActionListener(this);
		this.add(playAgain);
		
		resumePlay = false;
		
		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
		this.setBounds(200, 50, 800, 650);
	}

	public void resetGame(Game g) {
		game = g;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Play") {
			resumePlay = true;
			game.resetRound();
		}
		
	}
	
	public void setFocus() {
		this.setFocusable(true);
		this.requestFocusInWindow();
	}
}
