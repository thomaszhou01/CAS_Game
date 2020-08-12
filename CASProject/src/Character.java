
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Character {
	
	private Image image; 
	public int x;
	public int y;
	public int sizeX;
	public int sizeY;
	
	public Character(int characterNum) {
		sizeX = 100;
		sizeY = 100;
		if (characterNum == 1) {
			image = new ImageIcon("Resources/Images/character.png").getImage();
		}
		else {
			image = new ImageIcon("Resources/Images/character2.png").getImage();
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
