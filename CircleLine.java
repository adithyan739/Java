// Program to draw Circle, Rectangle, Line in Applet.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class  CircleLine extends Applet 
{
    int x=300,y=100,r=50;
    

    public void paint(Graphics g)
    {
        g.drawLine(3,300,200,10);
        g.drawString("Line",100,100);
        g.drawOval(x-r,y-r,100,100);
        g.drawString("Circle",275,100);
        g.setColor(Color.blue);
        g.drawRect(400,50,200,100);
        g.setColor(Color.yellow);   
        g.fillRect( 400,50, 200, 100 );
        g.setColor(Color.blue);
        g.drawString("Rectangle",450,100);
       
   }

 }

/* 
<APPLET CODE="CircleLine.class" WIDTH="800" HEIGHT="500"></APPLET> 


*/  