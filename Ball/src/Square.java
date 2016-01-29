import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * 
 */

/**
 * @author Rosauro
 *
 */
public class Square extends MovingObject {

	/**
	 * @param x
	 * @param y
	 * @param left
	 * @param right
	 * @param top
	 * @param bottom
	 */
	
	private int width;
	final public int  initialHeight = 70;
	private int height;
	
	public Square(double x, double y, int left, int right, int top, int bottom) {
		super( x,y, left + 30, right - 30, top + 30, bottom - 30);
		width = 30;
		setHeight(initialHeight);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see MovingObject#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		// g.drawRect(50, 50, 50, 50);
		int drawX = (int) getX() - width;
		int drawY = (int) getY() - width;

		g.setColor(Color.green);
		g.fillRect(drawX + width / 2, drawY + width, width, width);

	}

	@Override
	public void animateOneStep() {
		// TODO Auto-generated method stub
		
	}

	public boolean Hit() {
		return isAttacked = true;
	}
	
	public void setHeight(int x) {
		// TODO Auto-generated metdhod stub
		this.height = x;
	}
	
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.height;
	}

	public void setWidth(int x) {
		// TODO Auto-generated method stub
		this.width = x;
	}
	
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.width;
	}
	
	private boolean isAttacked;
}
