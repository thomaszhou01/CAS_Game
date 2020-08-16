import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CharacterSelect extends JPanel implements ActionListener{
	
	private JButton play, ship1, ship2, ship3, bestOf3, bestOf5;
	private ImageIcon image; 
	
	public int shipNum;
	public int gameRounds;
	public boolean startGame;
	
	public CharacterSelect() {
		super();
		this.setLayout(null);
		startGame = false;
		shipNum = 0;
		gameRounds = 3;
		
		play = new JButton("Start");
		play.setBounds(300, 550, 200, 50);
		play.setBackground(Color.orange);
		play.addActionListener(this);
		this.add(play);
		
		ship1 = new JButton("Ship1");
		ship1.setBounds(250, 250, 100, 100);
		Image y = new ImageIcon("Resources/Images/character.png").getImage();
		Image x = y.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		image = new ImageIcon(x);
		ship1.setIcon(image);
		ship1.addActionListener(this);
		this.add(ship1);

		ship2 = new JButton("Ship2");
		ship2.setBounds(350, 250, 100, 100);
		y = new ImageIcon("Resources/Images/ship2L.png").getImage();
		x = y.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		image = new ImageIcon(x);
		ship2.setIcon(image);
		ship2.addActionListener(this);
		this.add(ship2);
		
		ship3 = new JButton("Ship3");
		ship3.setBounds(450, 250, 100, 100);
		y = new ImageIcon("Resources/Images/ship3L.png").getImage();
		x = y.getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		image = new ImageIcon(x);
		ship3.setIcon(image);
		ship3.addActionListener(this);
		this.add(ship3);
		
		bestOf3 = new JButton("Best of 3");
		bestOf3.setBounds(300, 350, 100, 100);
		bestOf3.addActionListener(this);
		this.add(bestOf3);
		
		bestOf5 = new JButton("Best of 5");
		bestOf5.setBounds(400, 350, 100, 100);
		bestOf5.addActionListener(this);
		this.add(bestOf5);
		
		this.setBackground(Color.gray);
		this.setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.black));
		this.setBounds(200, 50, 800, 650);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		switch (e.getActionCommand()) {
		case "Start":
			startGame = true;
			return;
		case "Ship1":
			shipNum = 0;
			return;
		case "Ship2":
			shipNum = 1;
			return;
		case "Ship3":
			shipNum = 2;
			return;
		case "Best of 3":
			gameRounds = 3;
			return;
		case "Best of 5":
			gameRounds = 5;
			return;
		}
		
		
		
	}
	
	public void reset() {
		startGame = false;
		this.setFocusable(false);
	}
	
	public boolean getStart() {
		return startGame;
	}
	
	public int getShip() {
		return shipNum;
	}
	
	public void setFocus() {
		this.setFocusable(true);
		this.requestFocusInWindow();
	}
}
