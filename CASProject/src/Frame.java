
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener{

	public Game game;
	public Menu menu;
	public CharacterSelect select;
	private Container c = getContentPane();

	public Frame(String a) {
		super(a);
		c.setLayout(null);
        c.setBackground(Color.DARK_GRAY);
        
        JMenuBar jmb = new JMenuBar();

        //file menubar with its items
        JMenu jmFile = new JMenu("Game");
        JMenuItem jmiOpen = new JMenuItem("Play");
        JMenuItem jmiClose = new JMenuItem("Close");
        JMenuItem jmiExit = new JMenuItem("Exit");
        //adding items to bar
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        jmb.add(jmFile);
        
        JMenu jmHelp = new JMenu("Help");
        JMenuItem jmiAbout = new JMenuItem("How to Play");
        //adding items to bar
        jmHelp.add(jmiAbout);
        jmb.add(jmHelp);

        
        //calling all buttons with actionListener
        jmiOpen.addActionListener(this);
        jmiClose.addActionListener(this);
        jmiExit.addActionListener(this);
        jmiAbout.addActionListener(this);
        menu = new Menu();
		select = new CharacterSelect();
		game = new Game();
		
        this.setJMenuBar(jmb);
		c.add(menu);
	}
	
	
	public void paint(Graphics g) {
		super.paint(g);
		if(menu.getPlay()) {
			menu.reset();
			c.removeAll();
			c.add(select);
			select.setFocus();
		}
		
		if(select.getStart()) {
			game.initialize(select.shipNum);
			select.reset();
			c.removeAll();
			c.add(game);
			game.setFocus();
		}
		
		repaint();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Exit")) {
			System.exit(1);
		 }
		 else if(e.getActionCommand().equals("Play")) {
			 game.initialize(select.shipNum);
			 select.reset();
			 c.removeAll();
			 c.add(game);
			 game.setFocus();
		 }
		 else if(e.getActionCommand().equals("Close")) {
			 c.removeAll();
			 c.add(menu);
		 }
		 else if(e.getActionCommand().equals("How to Play")) {
			 System.out.println(2);
			 JOptionPane.showMessageDialog(c, "Dodge the projectiles thrown by the enemy and throw projectiles back", "How to Play", JOptionPane.INFORMATION_MESSAGE);
		 }
	}

	
}
