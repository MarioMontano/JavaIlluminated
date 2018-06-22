/**
 * Drawing of Alien Astronaut.
 *
 * Mario Montano
 * 
 */
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Drawing extends JApplet
{
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Color nicecolor = new Color(190, 80, 33);
        
        int sX = 100;
        int sY = 25;
        
        g.setColor(nicecolor);
        g.fillOval(sX + 60, sY, 75, 75);
        g.setColor(Color.GREEN);
        g.fillOval(sX+70, sY + 10, 55, 55);
        
        g.setColor(Color.BLACK);
        g.drawOval(sX + 83, sY + 27, 8, 8);
        g.drawOval(sX + 103, sY + 27, 8, 8);
        g.drawLine(sX + 97, sY + 35, sX + 99, sY + 43);
        g.drawLine(sX + 97, sY + 43, sX + 99, sY + 43);
        g.drawOval(sX + 90, sY + 48, 15, 6);
        
        g.setColor(nicecolor);
        g.fillRect(sX + 88, sY + 70, 20, 10);
        
        g.fillRect(sX + 65, sY + 80, 65, 85);
        
        g.fillRect(sX, sY + 80, 65, 20);
        g.fillRect(sX + 130, sY + 80, 65, 20);
        
        g.fillRect(sX + 75, sY + 165, 20, 80);
        g.fillRect(sX + 105, sY + 165, 20, 80);
        
        g.setColor(Color.BLUE);
        g.drawString("I am not from Earth...",
                            sX + 25, sY + 270);
                            
        Polygon hexagon = new Polygon( );
        hexagon.addPoint(49, 0);
        hexagon.addPoint(74, 32);
        hexagon.addPoint(34, 12);
        hexagon.addPoint(95, 10);
        hexagon.addPoint(34, 10);
        hexagon.addPoint(11, 190);
        g.drawPolygon(hexagon);
        
        Polygon hexagon2 = new Polygon( );
        hexagon.addPoint(73, 0);
        hexagon.addPoint(0, 37);
        hexagon.addPoint(30, 29);
        hexagon.addPoint(36, 11);
        hexagon.addPoint(100, 10);
        hexagon.addPoint(110, 55);
        g.drawPolygon(hexagon2);
        
        Polygon hexagon3 = new Polygon( );
        hexagon.addPoint(10, 90);
        hexagon.addPoint(58, 66);
        hexagon.addPoint(54, 30);
        hexagon.addPoint(20, 101);
        hexagon.addPoint(80, 15);
        hexagon.addPoint(126, 38);
        g.drawPolygon(hexagon3);       
}
}
