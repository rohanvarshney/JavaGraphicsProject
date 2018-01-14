import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Polygony extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  	Random rand = new Random(); 	
  	
  	
  	Color randomColr = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColr);
  	g.fillRect(0, 0, 2000, 1500);
  	
  	
  	
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColor);
  	
  	
  	
  	int[]xpoints = new int[1000];
  	int[]ypoints = new int[1000];
  	
  	for(int a=0; a<xpoints.length; a++)
  	{
  		xpoints[a] = 640 + (int)(Math.pow(rand.nextInt(8), 3.0) * (1 + rand.nextInt(2) * -2) * 2.50) + 1;
  		ypoints[a] = 380 + (int)(Math.pow(rand.nextInt(7), 3.0) * (1 + rand.nextInt(2) * -2) * 2.07) + 1;
  		//xpoints[a] = rand.nextInt(1280) + 1;
  		//ypoints[a] = rand.nextInt(760) + 1;
  	}
  	
  	g.fillPolygon(xpoints, ypoints, rand.nextInt(990)+10 );
  	
  	
  		  			
  			
  }			
  			

  }