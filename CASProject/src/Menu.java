import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.sound.sampled.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;


public class Menu extends JPanel implements ActionListener{
	
	private JButton play;
	
	public boolean playGame;
	
	public Menu() {
		super();
		this.setLayout(null);
		
		playGame = false;
		
		play = new JButton("Play");
		play.setBounds(300, 550, 200, 50);
		play.setBackground(Color.orange);
		play.addActionListener(this);
		this.add(play);
		
		
		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
		this.setBounds(200, 50, 800, 650);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand() == "Play") {
			playGame = true;
		}
		
	}
	
	public void reset() {
		playGame = false;
		this.setFocusable(false);
	}
	
	public boolean getPlay() {
		return playGame;
	}
	
}
