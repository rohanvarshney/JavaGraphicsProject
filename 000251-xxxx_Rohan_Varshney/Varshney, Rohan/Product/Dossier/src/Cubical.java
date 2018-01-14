
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cubical extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  	
  	
  	Random rand = new Random(); 
  	
  	
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColor);
  	g.fillRect(0, 0, 2000, 1500);
  	
  	
  	int size = rand.nextInt(80) + 10;
  	
  	int instances = (int) Math.ceil(1500/size);
  	
  	
  	int xx = 0;
  	int yy = 0;
  	for(int x = 0; x < 20000; x++)
  	{
  		
  		Color randomColor1 = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  		g.setColor(randomColor1);
  		g.drawLine(xx,yy,xx,yy+size);
  		g.drawLine(xx,yy+size,xx+size,yy+size);
  		g.drawLine(xx+size,yy+size,xx+size,yy);
  		g.drawLine(xx+size,yy,xx,yy);
  		
  		
  		
  		if(xx < 2000)
	  		xx+=size;
	  	else
	  	{
	  		xx = 0;
	  		yy = yy + size;
	  	}
  		  	
  	}
  	
  	
  	
  	
  	
  	
  	
  		  			
  			
  }			
  			

  }
