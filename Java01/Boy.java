package Java01;

import java.awt.*;
import java.applet.*;

public class Boy extends Applet{
   public void paint(Graphics g){
	g.setColor(Color.red);      
	g.drawString("hello java", 10, 20);

	g.setColor(Color.blue);      
	g.drawString("hello ", 15, 35);
    }
}
