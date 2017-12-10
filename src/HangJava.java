import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;
//import java.awt.Color;
//import java.applet.*;
//import java.awt.event.*
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;

public class HangJava extends GraphicsProgram{
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 620+30;
	public static final int REFRESH = 50;
	public static final int PAUSE = 750;
	
	public JButton startButton = new JButton ("Start");
	HangmanLexicon chString;

	public void init()
	{
		add(startButton, SOUTH);
	}
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

		
		HangmanCanvas canvas = new HangmanCanvas();
		canvas.reset();
		
		
		drawScaffold();
		

		
		addActionListeners();
		addMouseListeners();
		addKeyListeners();
	}
	public void drawScaffold()
	{
		GImage scaffold = new GImage("/HangMan/image/wallpaper1000.jpg");
		//GImage scaffold = new GImage("image/wallpaper1000.jpg");
		add(scaffold);
	}
	int count = 0;
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Start")){
			
			chString = new HangmanLexicon();
			chString.chooseWord();
			
			for (int i = 0;i < chString.charArray.length;i++){
				GRect line = new GRect(lineX,lineY,lineWidth,lineHeight);
				line.setFilled(true);
				add(line);
				lineX += lineWidth + 20;
				
				repaint();
			}
			
			
		}
		
	}
	public void paint(Graphics g)
	{
		char[] letters = chString.hangmanLetters;
		
		g.drawChars( letters, 0, 5, lineX - 50, lineY - 50);
	}
//	private String newWord()
//	{
//    	HangmanLexicon word = new HangmanLexicon();
//		int index = rgen.nextInt(0, word.getWordCount() - 1);
//		return(word.getWord(index));
//	}
	public void strikeCount(int index) {
		switch (index) {
			case 1: 
				GImage head = new GImage("image/Head.png", 290, 5);
				add(head);
				break;
			case 2: 
				GImage body = new GImage("image/Body.png", 290, 175);
				add(body);
				break;
			case 3: 
				GImage LHand = new GImage ("image/LHand.png", 330, 193);
				add(LHand);
				break;
			case 4: 
				GImage RHand = new GImage("image/RHand.png", 110, 189);
				add(RHand);
				break;
			case 5: 
				GImage RLeg = new GImage("image/RLeg.png", 379, 340);
				add(RLeg);
				break;
			case 6: 
				GImage LLeg = new GImage("image/LLeg.png", 444, 330);
				add(LLeg);
				break;
			
			default: throw new ErrorException("getWord: Illegal index");
		}
	};

	@Override
	public void keyPressed(KeyEvent e) {
	
		char mX = e.getKeyChar(); 
		//int mY = e.getY();
	 ///the If statement below will activated when man is hanged or user wins 
		if(chString.wrongGuess == 6 || chString.winOrLoose == true){
			chString.wrongGuess = 0;
			chString.chooseWord();
			chString.winOrLoose = false;
			for(int i = 0; i < 26; i++){ 
				chString.usedLetterList[i] = '-';
			}
		}
		
		 // the if statements below is the areas of the letters to be clicked.
		chString.checkWord(mX);
		
		strikeCount(chString.wrongGuess);
		//count ++;

	}
	
	/**
	 * Weird serial id error fix for main class
	 */
	private static final long serialVersionUID = 1L;
	
	private int lineWidth = 50;
	private int lineHeight = 10;
	private int lineX = 20;
	private int lineY = WINDOW_HEIGHT - 120;
	private String hangmanWord;
	private int incorrectGuesses = 0;
	private int maxIncorrectGuesses = 8;
	private int correctGuess = 0;
	private HangmanCanvas canvas;

}
