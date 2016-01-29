
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Rectangle;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015
 * 
 * @author Rosauro Tuazon adapted from Sam Scott & Christina Kemp
 */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener {


	int width = 500;
	int height = 300;
	int x, y;
	private boolean running = true;
	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 3;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 50;
	/**
	 * An array of balls.
	 */
	FlashingBall[] ball = new FlashingBall[numBalls];
	Square player;

	static boolean collision = false;
	/** main program (entry point) */
	public static void main(String[] args) {

		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
		
		
	}

	
	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);
		
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(50, 50, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math
					.random() * 256), (int) (Math.random() * 256)));
		}
		
		player = new Square(15, 15, 0, width, 0, height);
		addMouseMotionListener (this);
		
		Thread gameThread = new Thread(this);
		gameThread.start();
		
	}

	
	
	/**
	 * Repaints the frame periodically.
	 */
	public void run() {
		while (running) {
			repaint();
			
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}
	
	
	
	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		player.setX(x);
		player.setY(y);
		player.draw(g);
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(g);
		}

	}
	

	public boolean collision() {
		for (int i = 0; i < numBalls; i++) {
			if (x - 30 < ball[i].getX() && x + 30 > ball[i].getX() && y > ball[i].getY())
				return true;
			System.out.println("1. Add new contestant");
	}
		return false;
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	Runnable timer = new Runnable() {

		@Override
		public void run() {
			int time = 0;
			// TODO Auto-generated method stub
			time++;
		}
		
	};
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y = e.getY();
		for (int i = 0; i < numBalls; i++) {
			if (x - 30 <= ball[i].getX() && x + 30 >= ball[i].getX() && y >= ball[i].getY())
				player.Hit();
		}

	}

}
