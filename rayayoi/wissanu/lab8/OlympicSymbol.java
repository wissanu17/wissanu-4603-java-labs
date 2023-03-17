 /**
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 17, 2022
 * 
 */
package rayayoi.wissanu.lab8;

import javax.swing.*;
import java.awt.*;

class OlympicSymbol extends JPanel {
    //Overide method paintComponent to draw 5 circle
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.blue);
        g2d.setStroke(new BasicStroke(5));
        g.drawOval(10,10,50,50);

        g.setColor(Color.red);
        g2d.setStroke(new BasicStroke(5));
        g.drawOval(60,10,50,50);

        g.setColor(Color.yellow);
        g2d.setStroke(new BasicStroke(5));
        g.drawOval(110,10,50,50);

        g.setColor(Color.green);
        g2d.setStroke(new BasicStroke(5));
        g.drawOval(35,35,50,50);

        g.setColor(Color.black);
        g2d.setStroke(new BasicStroke(5));
        g.drawOval(85,35,50,50);
        
    }
}
