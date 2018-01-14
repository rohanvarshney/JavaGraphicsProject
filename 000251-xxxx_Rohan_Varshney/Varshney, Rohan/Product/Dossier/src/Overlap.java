import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Overlap extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  	
  	Random rand = new Random(); 	
  	
  	
  	Color randomColr = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColr);
  	g.fillRect(0, 0, 2000, 1500);
  	
  	int xx = -200;
  	int yy = -200;
  	Random b = new Random();
  	
  	int numof = b.nextInt(1200)+200;
  	int stepsize = 1400/numof;
  	System.out.println(stepsize);
  	for(int x = 0; x < rand.nextInt(40000) + 20000; x++)
  	{
  		Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  		g.setColor(randomColor);
  		
  		boolean up = false;
  		boolean down = true;
  		boolean left = false;
  		boolean right = true;
  		
  			g.fillRect(xx, yy, rand.nextInt(10) + 90, 100);
  			xx+=stepsize;
  			yy+=stepsize;
  			if(xx>1500)
  			{
  				xx = -200;
  			}
  			if(yy>900)
  			{
  				yy = -200;
  			}
  			
  		
  			
  		
  	}


  	
  	
  		  			
  			
  }			
  			

  }