import java.awt.*;


public class stoplight extends Frame{
	private Button btnSouth, btnCenter;
	public static final int WINDOW_WIDTH = 1000;
	public static final int WINDOW_HEIGHT = 620;
	
	public void run()
	{
		System.out.println("Please type your input"); 
		btnSouth = new Button("SOUTH");
	    //add(btnSouth, BorderLayout.SOUTH);
	     
	    btnCenter = new Button("CENTER");
	    //add(btnCenter, BorderLayout.CENTER);
	}
}
