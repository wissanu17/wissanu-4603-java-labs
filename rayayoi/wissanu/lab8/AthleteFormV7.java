 /**
 * This program call AhleteFormV7 that extends from AthleteFormV6
 * The output will show window that have the title of the program is "Athlete Form V7" and have all funtion as same as AthleteFormV4
 * but there will add imgPanel that have image to between buttonPanel and experiencePanel of main Panel
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 17, 2022
 * 
 */
package rayayoi.wissanu.lab8;

import javax.swing.*;
import java.awt.*;

public class AthleteFormV7 extends AthleteFormV6 {

    protected JPanel imgPanelAndallPanel;
    ReadImage readImg;
    JPanel imgPanel;

    @Override
    protected void addComponents() {
        super.addComponents();
        //Create readImg as type ReadImage and set prefer size
        readImg = new ReadImage();
        readImg.setPreferredSize(new Dimension(500, 300));
        //Create imgPanel and add readImg to imgPanel
        imgPanel = new JPanel();
        imgPanel.add(readImg);
        //Create imgPanelAndallPanel to group allPanel and imgPanel
        imgPanelAndallPanel = new JPanel();
        imgPanelAndallPanel.setLayout(new BorderLayout());
        imgPanelAndallPanel.add(imgPanel, BorderLayout.SOUTH);
        imgPanelAndallPanel.add(allPanel, BorderLayout.NORTH);
        //Add imgPanelAndallPanel to main panel
        mainPanel.add(imgPanelAndallPanel, BorderLayout.CENTER);
    }

    public AthleteFormV7(String Window) {
        super(Window);
    }

    public static void createAndShowGUI() {
        AthleteFormV7 msw = new AthleteFormV7("Athlete Form V7");
        msw.addComponents();
        msw.addMenu();
        msw.setFrameFeatures();
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    
}
