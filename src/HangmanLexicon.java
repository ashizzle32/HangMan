/*
 * File: HangmanLexicon.java
 * -------------------------
 * This file contains a stub implementation of the HangmanLexicon
 * class that you will re-implement for Part III of the assignment.
 */

import java.util.Arrays;
import java.util.Random;

import acm.util.*;

public class HangmanLexicon {
	
	public static String[] hangmanWords = {"aaron", "bouy","computer", "connoisseur", "dehydrate", "fuzzy", "hubbub", "keyhole", "quagmire", "slither", "zircon" };
	private static String word = hangmanWords[(int) (Math.random() * hangmanWords.length)];
	private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
	private static int count = 0;
	HangJava StrikeCount = new HangJava();
	
	//public String[] hangmanWords = {"marsh", "swamp","mountain","peninsula","beach"};
	public String hangmanTemp;
	public char[] hangmanBlank = {'-','-','-','-','-','-','-','-','-','-',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
	public char[] hangmanLetters;
	public char[] usedLetterList = {'-','-','-','-','-','-','-','-','-','-',
			'-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-','-',};
	char[]  charArray;
	char[] charArrayTest;
	boolean winOrLoose;
	boolean wrongChoice;
	int wrongGuess;
	boolean usedLetter;
	//chString;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	Random r;
/** Returns the number of words in the lexicon. */
	public int getWordCount() {
		return 10;
	}

/** Returns the word at the specified index. */
//	public String getWord(int index) {
//		switch (index) {
//			case 0: return "BUOY";
//			case 1: return "COMPUTER";
//			case 2: return "CONNOISSEUR";
//			case 3: return "DEHYDRATE";
//			case 4: return "FUZZY";
//			case 5: return "HUBBUB";
//			case 6: return "KEYHOLE";
//			case 7: return "QUAGMIRE";
//			case 8: return "SLITHER";
//			case 9: return "ZIRCON";
//			default: throw new ErrorException("getWord: Illegal index");
//		}
//	};
	
	public void chooseWord(){
		r = new Random();
		
		// choose a word from the list of words
	    hangmanTemp = hangmanWords[r.nextInt(hangmanWords.length)];
		//hangmanTemp = hangmanWords[1];
	    charArrayTest = hangmanTemp.toCharArray();
	    hangmanLetters = hangmanTemp.toCharArray();
	    charArray = hangmanTemp.toCharArray();
		for(int i = 0;i < charArray.length;i++){
			charArrayTest[i]=hangmanBlank[i];
			hangmanLetters[i]=hangmanBlank[i];
		}
		

	}
	public void checkWord(char ch){
		usedLetter= false;
		wrongChoice = false;
		char c = '-';
		int temp =0;
		for(int i = 0;i < charArray.length;i++){
				if(charArray[i] == ch){
					hangmanLetters[i] = ch; 
				}
		}
		for(int i = 0;i < usedLetterList.length;i++){
			if(usedLetterList[i] == ch){
				usedLetter = true;
			}
		}


		for(int i = 0;i < charArray.length;i++){
			if(charArray[i] == ch && wrongChoice == false){
				wrongChoice = true;
				
				//STIKES
				//StrikeCount.strikeCount(count);
				//count++;
			}
		}
		if(usedLetter == false){
			for(int i = 0;i < usedLetterList.length;i++){
				if(usedLetterList[i] == c){
					 temp = i;
					 break;
				}
			}
			usedLetterList[temp] = ch;
		}
		if(wrongChoice == false){
			wrongGuess = wrongGuess + 1;
			
			//StrikeCount.strikeCount(wrongGuess);
			if(usedLetter == true){
				wrongGuess = wrongGuess - 1;
			}
		}
		winOrLoose = Arrays.equals(charArray,hangmanLetters);
	}
	
}
