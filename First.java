import java.applet.Applet;  
import java.awt.*;  
 
public class First extends Applet{  
 
public void paint(Graphics g){  
g.setColor(Color.red);  
g.drawString("ghhh",80,70);
g.drawLine(20,30,20,300);  
g.drawRect(70,100,30,30);  
g.fillRect(170,100,30,30);  
g.drawOval(70,200,30,30);  
 
g.setColor(Color.pink);  
g.fillOval(170,200,30,30);  

 
}  
}  