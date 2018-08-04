import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CirclePattern extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  		
  	
  	Random rand = new Random(); 
  	int things = rand.nextInt(50) + 50;
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColor);
  	g.fillRect(0, 0, 2000, 1500);
  	
  	
  	int xc = 0;
  	int yc = 0;
  	
  	int r = 1300/things;
  	System.out.println(things);
  	for(int x = 0; x < 10000; x++)
  	{
  		
  		Color randomColor1 = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  		g.setColor(randomColor1);
 
	  	g.fillArc(xc, yc, r, r, rand.nextInt(360), rand.nextInt(360));
	  	if(xc < 2000)
	  		xc+=r;
	  	else
	  	{
	  		xc = 0;
	  		yc = yc + r;
	  	}
	  	
	  	
	  	
  	}
  		  			
  			
  }			
  			

  }