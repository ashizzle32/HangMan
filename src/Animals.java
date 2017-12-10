import acm.graphics.GImage;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.util.Random;

public class Animals extends GraphicsProgram {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static String[] animals = {"bear", "bunny","elephant", "Giraffe", "liger", "tiger"};
	
	//private RandomGenerator rgen = RandomGenerator.getInstance();
	public static String animal = animals[(int) (Math.random() * animals.length)];
	
	public void run()
	{
		chooseAnimal();
	}
	
	public void chooseAnimal()
	{
		Random rand = new Random();

		int  n = rand.nextInt(50) + 1;
		
		//private static string choice = "images/"animal + '.png';
		GImage img = new GImage("images/"+ n + ".png", 290, 5);
		add(img);
	}
}
