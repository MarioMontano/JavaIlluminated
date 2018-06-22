/**
 * An applet that displays a basic house.
 *
 * Mario Montano
 * 
 */

import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

public class BasicHouse extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Color facade = new Color(60, 40, 2);
        Color door = new Color(9, 43, 76);
        
        g.setColor(facade);
        g.fillRect(45,45,200,170);
        
        g.setColor(door);
        g.fillRect(180,170,10,45);
                
        g.drawLine(45,45,123,15);
        g.drawLine(123,15,245,45);
        
        g.drawString("Java House", 60, 20);
    }
}
