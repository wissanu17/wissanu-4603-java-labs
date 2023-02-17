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
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class ReadImage extends JPanel {
    
    protected BufferedImage img;
    protected String fileImage = "Image/Athlete.png";
    //Overide method paintComponent to draw image from file location "Image/Athlete.png"
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }

    public ReadImage() {
        try {
            img = ImageIO.read(new File(fileImage));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }
}
