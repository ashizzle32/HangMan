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
	public static final int PAUSE = 1000;
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
		//This is so I can refetch
		//Draws the man's head
		GImage strike = new GImage("Head.png", 290, 5);
		add(strike);
		pause(PAUSE);
		
		//Draws the man's body
		GImage body = new GImage("Body.png", 290, 175);
		add(body);
		pause(PAUSE);
		
		//Draws the man's left hand
		GImage LHand = new GImage ("LHand.png", 330, 193);
		add(LHand);
		pause(PAUSE);
		
		//Draws the man's right hand
		GImage RHand = new GImage("RHand.png", 110, 189);
		add(RHand);
		pause(PAUSE);
		
		//Draws the man's right leg
		GImage RLeg = new GImage("RLeg.png", 379, 340);
		add(RLeg);
		pause(PAUSE);
		
		//Draws the man's left leg
		GImage LLeg = new GImage("LLeg.png", 444, 330);
		add(LLeg);
		pause(PAUSE);
	}
		
	
	/**
	 * Weird serial id error fix for main class
	 */
	private static final long serialVersionUID = 1L;
	

}
