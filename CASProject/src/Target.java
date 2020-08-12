import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Target {
	
	private static Image image;
	public int x;
	public int y;
	public int sizeX;
	public int sizeY;
	
	
	public Target(int getX, int getY) {
		image = new ImageIcon("Resources/Images/target.png").getImage();
		x = getX;
		y = getY;
		sizeX = 50;
		sizeY = 200;
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
	
	public Rectangle bounds() {
		return(new Rectangle(x, y, sizeX, sizeY));
	}
}
