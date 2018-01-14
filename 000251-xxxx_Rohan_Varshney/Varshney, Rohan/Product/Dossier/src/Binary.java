
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Binary extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  	
  	
  	Random rand = new Random(); 
  	int things = rand.nextInt(150000) + 5000;
  	
  	
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));	
  	g.fillRect(0, 0, 2000, 1500);
  	
  	
  	g.setColor(Color.black);
  	int yy = -30;
  	
  	for(int x = 0; x < 1400; x++)
  	{
  		String binary = "";
  		for(int y = 0; y < 250; y++)
  		{
  			int add = rand.nextInt(10);
  			binary+=add;
  		}
  		Color randomColor1 = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  		g.setColor(randomColor1);
  		g.drawString(binary, -10, yy);
  		yy = yy + 1;//10 optimal
  		
  		
  	}
  		  			
  			
  }			
  			

  }
