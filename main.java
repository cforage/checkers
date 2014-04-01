import java.awt.*;
import javax.swing.JFrame;


//This is our main class

public class main extends JFrame{
	public static void main(String args[]){
		System.out.println("Would you like to play a game of checkers?");
		//								screen resolution, bit of colors, refresh rate
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		main m = new main();
		m.run(dm);
		
	}
	public void run(DisplayMode dm){
		setBackground(Color.BLUE);
		setForeground(Color.BLACK);
		setFont(new Font("Arial",Font.PLAIN,24));
		
		Screen s = new Screen();
		try{
			s.setFullScreen(dm, this);
			try{
				System.out.println("Game running");
				Thread.sleep(5000);
			}catch(Exception ex){}
		}finally{
			s.restoreScreen();
			System.out.println("Game no longer running");
		}
	}
	
	public void paint(Graphics g){
		g.drawString("This is gonna be awesome", 200, 200);
	}
}
