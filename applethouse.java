/*<applet code="applethouse.class" width=1000 height=800>
</applet>*/
import java.awt.*;
import java.applet.*;
public class applethouse extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.gray);
g.drawRect(250,250,500,350);
g.fillRect(250,250,500,350);

g.setColor(Color.white);
g.drawRect(300,300,70,100);
g.drawRect(630,300,70,100);
g.drawRect(450,300,100,300);

g.setColor(Color.black);
int xpoints[]={180,500,830,180};
int ypoints[]={250,150,250,250};

g.setColor(Color.orange);
g.drawPolygon(xpoints,ypoints,3);
g.fillPolygon(xpoints,ypoints,3);
}
}
