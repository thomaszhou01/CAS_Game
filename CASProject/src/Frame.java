
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Frame extends JFrame{

	public Game game;
	public Menu menu;
	private Container c = getContentPane();

	public Frame(String a) {
		super(a);
		c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        menu = new Menu();
		game = new Game();
		
		c.add(menu);
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		if(menu.getPlay()) {
			menu.reset();
			c.removeAll();
			c.add(game);
			game.setFocus();
		}
		repaint();
	}

	
}
