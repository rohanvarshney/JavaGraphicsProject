
import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RubixCube extends JPanel {

  public void paint(Graphics g) {
  	Graphics clippedGraphics = g.create();	
  		//black,blue,cyan,gray,green,magenta,orange,pink,red
  		//g.setColor (Color.black); g.fillRect (0,0,2000,2000);g.setColor (Color.yellow); g.fillArc (25,25,120,120,25,310);
  		//Color randomColor1 = new Color (97, 67, 176);
  	
  	
  	Random rand = new Random(); 
  	
  	
  	Color randomColor = new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
  	g.setColor(randomColor);
  	g.fillRect(0, 0, 2000, 1500);
  	g.setColor(Color.black);
  	
  	
  	
  	//draw shape
  	
  	
  	//middle is 650,400
  	
  	int xr1[] = {650, 700,700,650,650};
  	int yr1[] = {400, 375,450,475,400};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr1,yr1,xr1.length);
  	
  	
  	int xr2[] = {650 + 50, 700 + 50, 700 + 50, 650 + 50, 650 + 50};
  	int yr2[] = {400 - 25, 375 - 25 ,450 - 25,475 - 25,400 - 25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr2,yr2,xr1.length);
  	
  	int xr3[] = {650 + 100, 700 + 100, 700 + 100, 650 + 100, 650 + 100};
  	int yr3[] = {400 - 50, 375 - 50 ,450 - 50,475 - 50,400 - 50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr3,yr3,xr1.length);
  	
  	int xr4[] = {650, 700,700,650,650};
  	int yr4[] = {400 + 75, 375 + 75 ,450 + 75,475 + 75,400 + 75};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr4,yr4,xr1.length);
  	
  	int xr5[] = {650 + 50, 700 + 50,700 + 50,650 + 50,650 + 50};
  	int yr5[] = {400 +50, 375 + 50 ,450 + 50,475 + 50,400 + 50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr5,yr5,xr1.length);
  	
  	int xr6[] = {650 + 100, 700 + 100,700 + 100,650 + 100,650 + 100};
  	int yr6[] = {400 +25, 375 + 25 ,450 + 25,475 + 25,400 + 25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr6,yr6,xr1.length);
  	
  	int xr7[] = {650, 700,700,650,650};
  	int yr7[] = {400 + 150, 375 + 150 ,450 + 150,475 + 150,400 + 150};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr7,yr7,xr1.length);
  	
  	int xr8[] = {650+50, 700+50,700 + 50,650+50,650+50};
  	int yr8[] = {400 + 125, 375 + 125 ,450 + 125,475 + 125,400 + 125};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr8,yr8,xr1.length);
  	
  	int xr9[] = {650+100, 700+100,700 + 100,650+100,650+100};
  	int yr9[] = {400 + 100, 375 + 100 ,450 + 100,475 + 100,400 + 100};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xr9,yr9,xr1.length);
  	
  	//
  	
  	int xl1[] = {650, 600,600,650,650};
  	int yl1[] = {400, 375,450,475,400};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl1,yl1,xr1.length);
  	
  	int xl2[] = {650 - 50, 600 - 50,600 - 50,650 - 50,650 - 50};
  	int yl2[] = {400 - 25, 375 - 25,450 - 25 ,475 - 25 ,400 - 25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl2,yl2,xr1.length);
  	
  	int xl3[] = {650 - 100, 600 - 100,600 - 100,650 - 100,650 - 100};
  	int yl3[] = {400 - 50, 375 - 50,450 - 50 ,475 - 50 ,400 - 50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl3,yl3,xr1.length);
  	
  	int xl4[] = {650, 600,600,650,650};
  	int yl4[] = {400 + 75, 375 + 75 ,450 + 75,475 + 75,400 + 75};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl4,yl4,xr1.length);
  	
  	int xl5[] = {650 - 50, 600 - 50,600 - 50,650 - 50,650 - 50};
  	int yl5[] = {400 + 50, 375 + 50 ,450 + 50,475 + 50,400 + 50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl5,yl5,xr1.length);
  	
  	int xl6[] = {650 - 100, 600 -100,600 - 100,650 - 100,650 - 100};
  	int yl6[] = {400 + 25, 375 + 25 ,450 + 25,475 + 25,400 + 25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl6,yl6,xr1.length);
  	
  	int xl7[] = {650, 600,600,650,650};
  	int yl7[] = {400 + 150, 375 + 150 ,450 + 150,475 + 150,400 + 150};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl7,yl7,xr1.length);
  	
  	int xl8[] = {650 - 50, 600 - 50,600 - 50,650 - 50,650 - 50};
  	int yl8[] = {400 + 125, 375 + 125 ,450 + 125,475 + 125,400 + 125};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl8,yl8,xr1.length);
  	
  	int xl9[] = {650 - 100, 600 -100,600 - 100,650 - 100,650 - 100};
  	int yl9[] = {400 + 100, 375 + 100 ,450 + 100,475 + 100,400 + 100};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xl9,yl9,xr1.length);
  	
  	
  	//
  	
  	int xt1[] = {650, 700, 650, 600, 650};
  	int yt1[] = {400,375,350,375,400};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt1,yt1,xr1.length);
  	
  	int xt2[] = {650+50, 700+50, 650+50, 600+50, 650+50};
  	int yt2[] = {400-25,375-25,350-25,375-25,400-25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt2,yt2,xr1.length);
  	
  	int xt3[] = {650+100, 700+100, 650+100, 600+100, 650+100};
  	int yt3[] = {400-50,375-50,350-50,375-50,400-50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt3,yt3,xr1.length);
  	
  	int xt4[] = {650-50, 700-50, 650-50, 600-50, 650-50};
  	int yt4[] = {400-25,375-25,350-25,375-25,400-25};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt4,yt4,xr1.length);
  	
  	int xt5[] = {650-100, 700-100, 650-100, 600-100, 650-100};
  	int yt5[] = {400-50,375-50,350-50,375-50,400-50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt5,yt5,xr1.length);
  	
  	int xt6[] = {650, 700, 650, 600, 650};
  	int yt6[] = {400-50,375-50,350-50,375-50,400-50};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt6,yt6,xr1.length);
  	
  	int xt7[] = {650, 700, 650, 600, 650};
  	int yt7[] = {400-100,375-100,350-100,375-100,400-100};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt7,yt7,xr1.length);
  	
  	int xt8[] = {650+50, 700+50, 650+50, 600+50, 650+50};
  	int yt8[] = {400-75,375-75,350-75,375-75,400-75};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt8,yt8,xr1.length);
  	
  	int xt9[] = {650-50, 700-50, 650-50, 600-50, 650-50};
  	int yt9[] = {400-75,375-75,350-75,375-75,400-75};
  	g.setColor(new Color (rand.nextInt(255), rand.nextInt(255), rand.nextInt(255)));
  	g.fillPolygon(xt9,yt9,xr1.length);
  	
  	
 
  
  		  			
  			
  }			
  			

  }
