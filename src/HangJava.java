import acm.program.*;
//import acm.util.*;

//import java.awt.Color;

import acm.graphics.*;
//import java.applet.*;
//import java.awt.*;
//import java.awt.event.*;
public class HangJava extends GraphicsProgram{
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 620;
	public static final int REFRESH = 50;
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
		
		drawScaffold();
		strike();
	}
	public void drawScaffold()
	{
		GImage scaffold = new GImage("wallpaper1000.jpg");
		add(scaffold);
	}
	public void strike()
	{
		GImage strike = new GImage("Head.png", 290, 5);
		add(strike);
		
		GImage body = new GImage("Body.png", 290,175);
		add(body);
		
		GImage LHand = new GImage ("LHand.png",330,193);
		add(LHand);
		
		GImage RHand = new GImage("RHand.png",110,189);
		add(RHand);
		
		GImage RLeg = new GImage("RLeg.png",379,340);
		add(RLeg);
		
		GImage LLeg = new GImage("LLeg.png",444,330);
		add(LLeg);
		

	}
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
