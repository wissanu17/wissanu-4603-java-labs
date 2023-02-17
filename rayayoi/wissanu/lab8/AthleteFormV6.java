 /**
 * This program call AhleteFormV6 that extends from AthleteFormV5
 * The output will show window that have the title of the program is "Athlete Form V6" and have all funtion as same as AthleteFormV4
 * but there will add symbolPanel that have 5 circle to the top of main Panel
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

public class AthleteFormV6 extends AthleteFormV5 {

    protected JPanel symbolandgroupPanel;
    OlympicSymbol  symbol;
    JPanel symbolPanel;

    @Override
    protected void addComponents() {
        super.addComponents();
        //Create symbol type OlympicSymbol
        symbol = new OlympicSymbol();
        symbol.setPreferredSize(new Dimension(200, 100));
        ////Create symbolPanel to add symbol and set background to white
        symbolPanel = new JPanel();
        symbolPanel.setBackground(Color.white);
        symbolPanel.add(symbol);
        //Create symbolandgroupPanel to group symbolPanel and groupPanel
        symbolandgroupPanel = new JPanel();
        symbolandgroupPanel.setLayout(new BorderLayout());
        symbolandgroupPanel.add(symbolPanel, BorderLayout.NORTH);
        symbolandgroupPanel.add(groupPanel, BorderLayout.SOUTH);
        //Add symbolandgroupPanel to main panel
        mainPanel.add(symbolandgroupPanel, BorderLayout.NORTH);

    }

    public AthleteFormV6(String Window) {
        super(Window);
    }

    public static void createAndShowGUI() {
        AthleteFormV6 msw = new AthleteFormV6("Athlete Form V6");
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
