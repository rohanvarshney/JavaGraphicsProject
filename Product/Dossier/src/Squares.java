import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Squares extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  		
  	
  	
  	Random rand = new Random(); 
  	int things = rand.nextInt(7500) + 500;
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColor);
  	g.fillRect(0, 0, 2000, 1500);
  	
  	for(int x = 0; x < things; x++)
  	{
  		
  		Color randomColor1 = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  		g.setColor(randomColor1);
	  	g.fillRect(rand.nextInt(1600)-200, rand.nextInt(1000)-200, rand.nextInt(100), rand.nextInt(100));
	  	
  	}
  		  			
  			
  }			
  			

  }