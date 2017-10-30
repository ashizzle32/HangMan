import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class goofy extends GraphicsProgram
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 620;
	public static final int REFRESH = 50;
	public static final int PAUSE = 100;
////-----------------	
	public GImage goofy;

////-----------------
	private int x = 15;
	private int y = 15;
	private int dx = 30;
	private int dy = 20;
	public void run()
	{
		setupGame();
		while(true)
		{
			pause(REFRESH);
		}
	}
	public void setupGame()
	{
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		addMouseListeners();
		addKeyListeners();
		
		drawCharacter();
		moveCharacter();
		
	}
	public void drawCharacter()
	{
		goofy = new GImage("goofy.gif", x, y);
		add(goofy);
	}
	public void moveCharacter()
	{
		while(true){
			if(x + dx < 0 || x + 100 + dx > getWidth())
			{
				dx *= -1;
			}
			if(y + dy < 0 || y + 100 +dy > getHeight())
			{
				dy *= -1;
			}
			x += dx;
			y += dy;
			goofy.move(dx,dy);
			pause (PAUSE);
			}
	}
}
