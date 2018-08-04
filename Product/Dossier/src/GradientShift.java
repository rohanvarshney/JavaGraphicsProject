import java.util.*;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GradientShift extends JPanel {
	
  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  		
  	
  	Random rand = new Random(); 
  	int choice = rand.nextInt(10);//0-9
  	
  	Random color1 = new Random(); 
  	int c1 = color1.nextInt(255);
  	Random color2 = new Random(); 
  	int c2 = color2.nextInt(55);
  	Random color3 = new Random(); 
  	int c3 = color3.nextInt(200);   
  	
  	
  	switch (choice)
  	{
  		case 0:
  			
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(c1 - (x/200), c2 + x, c3 + (x/4))); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 1:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(c1, c2 + x, c3)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 2:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(c3 + (x/4), c2 + x, 37)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 3:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(x + (c1/8), c2 + (c3/2), c3 + c2)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 4:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(201 - x, c2 + x, c3 + (x/5))); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 5:
  			for(int x = 0; x < 200; x++)
  		  	{
  				
  				g.setColor (new Color((c1/4) + 150,c2 + x,c3 + (x/4))); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 6:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(252 - x/*255*/, c2+c3/*55*/, c2 + (2*x/3)/*200*/)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 7:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(74 - (x/4), c2+x, c3 + 1 + (x/4)/*200*/)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		case 8:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color((x/7)+x, c2+x/*55*/, c3 + (x/4)/*200*/)); 
  		  		g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		
  		default:
  			for(int x = 0; x < 200; x++)
  		  	{
  				g.setColor (new Color(0, 231-x, 5*(c3/8) + 50)); 
  				g.fillRect (7*x,0,50,2000);
  		  	}
  			
  			break;
  		
  	}
  	
  	
  	

  	
  	
  	
  			
  }			
  			

  }