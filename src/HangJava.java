import acm.program.*;
import acm.util.*;

import java.awt.Color;

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
	}
	public void drawScaffold()
	{
		GImage scaffold = new GImage("wallpaper1000.jpg");
		add(scaffold);
	}
	public void strike()
	{
		
	}
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
