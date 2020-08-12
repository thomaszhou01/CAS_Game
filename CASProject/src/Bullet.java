
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Bullet {
	
	private Image image;
	public int x;
	public int y;
	public int sizeX;
	public int sizeY;
	public boolean right; 
	
	public Bullet(int getX, int getY, boolean direction) {
		x = getX;
		y = getY;
		sizeX = 30;
		sizeY = 20;
		right = direction;
		if (right) {
			image = new ImageIcon("Resources/Images/bullet.png").getImage();
		}
		else {
			image = new ImageIcon("Resources/Images/bullet2.png").getImage();
		}
	}
	
	public Image getImg() {
		return image;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}
	public void moveBullet() {
		if (right) {
			x += 3;
		}
		else {
			x -= 3;
		}

	}
	
	public Rectangle bounds() {
		return(new Rectangle(x, y, sizeX, sizeY));
	}
}
