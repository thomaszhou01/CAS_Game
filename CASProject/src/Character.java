
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Character {
	
	private Image image; 
	public int x;
	public int y;
	public int sizeX;
	public int sizeY;
	
	public Character(int characterNum, int shipNum) {
		sizeX = 100;
		sizeY = 100;
		if (characterNum == 0) {
			switch(shipNum) {
			case 0:
				image = new ImageIcon("Resources/Images/character.png").getImage();
				return;
			case 1:
				image = new ImageIcon("Resources/Images/ship2L.png").getImage();
				return;
			case 2:
				image = new ImageIcon("Resources/Images/ship3L.png").getImage();
				return;
			}
		}
		else {
			switch(shipNum) {
			case 0:
				image = new ImageIcon("Resources/Images/character2.png").getImage();
				return;
			case 1:
				image = new ImageIcon("Resources/Images/ship2R.png").getImage();
				return;
			case 2:
				image = new ImageIcon("Resources/Images/ship3R.png").getImage();
				return;
			}
		}
	}
	
	public Image getImg() {
		return image;
	}
	
	public void setPos(int x1, int y1) {
		x = x1;
		y = y1;
	}
	
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}
	
	public Rectangle bounds() {
		return(new Rectangle(x, y, sizeX, sizeY));
	}
}
