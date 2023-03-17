 /**
 * This program call AhleteFormV4 that extends from AthleteForm3FormV3
 * The output will show window that have the title of the program is "Athlete Form V4" and have all funtion as same as AthleteFormV3FormV3
 * but there are add JLabel : hobbiesLabel, experienceLabel on the left side of window.
 * there add JCheckBox : readingBox, gardeningBox, watchingMovieBox, ShoppingBox, othersBox to the under hobbiesLabel of window
 * there add JSlider : experienceSlider under bioTextArea
 * and there add hobbiesPanel between genderPanel and nationPanel
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
import rayayoi.wissanu.lab7.*;

public class AthleteFormV4 extends AthleteFormV3FormV3 {

    protected JLabel hobbiesLabel, experienceLabel;
    protected JCheckBox readingBox, gardeningBox, watchingMovieBox, ShoppingBox, othersBox; 
    protected JPanel hobbiesBoxPanel,hobbiesLabelPanel, hobbiesPanel, experienceLabelPanel, experiencePanel, allPanel;
    protected String[] hobbies = {"Reading", "Gardening", "Watching movies", "Shopping", "Others"};
    protected JSlider experienceSlider;

    public AthleteFormV4(String Window) {
        super(Window);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        //Create JLabel
        hobbiesLabel = new JLabel("Hobbies : ");
        experienceLabel = new JLabel("Year of experience of this sport : ");
        //Create hobbiesLabelPanel and add hobbiesLabel
        hobbiesLabelPanel = new JPanel();
        hobbiesLabelPanel.setLayout(new GridLayout(1,2));
        hobbiesLabelPanel.add(hobbiesLabel);
        //Create experienceLabelPanel and add experienceLabel
        experienceLabelPanel = new JPanel(new GridLayout(1, 2));
        experienceLabelPanel.add(experienceLabel);
        //Create JCheckBox of hobbies
        readingBox = new JCheckBox(hobbies[0]);
        gardeningBox = new JCheckBox(hobbies[1]);
        watchingMovieBox = new JCheckBox(hobbies[2]);
        ShoppingBox = new JCheckBox(hobbies[3]);
        othersBox = new JCheckBox(hobbies[4]);
        //Set selected to watchingMovieBox at first
        watchingMovieBox.setSelected(true);
        //Create hobbiesBoxPanel and add all JCheckBox of hobbies
        hobbiesBoxPanel = new JPanel(new GridLayout(1, 5));
        hobbiesBoxPanel.add(readingBox);
        hobbiesBoxPanel.add(gardeningBox);
        hobbiesBoxPanel.add(watchingMovieBox);
        hobbiesBoxPanel.add(ShoppingBox);
        hobbiesBoxPanel.add(othersBox);
        //Create hobbiesPanel and add hobbiesLabelPanel and hobbiesBoxPanel
        hobbiesPanel = new JPanel();
        hobbiesPanel.setLayout(new BorderLayout());
        hobbiesPanel.add(hobbiesLabelPanel, BorderLayout.NORTH);
        hobbiesPanel.add(hobbiesBoxPanel, BorderLayout.SOUTH);
        //Create experienceSlider type JSlider 
        experienceSlider = new JSlider(0, 20, 0);
        experienceSlider.setPaintTrack(true);
        experienceSlider.setPaintTicks(true);
        experienceSlider.setPaintLabels(true);
        //set spacing
        experienceSlider.setMajorTickSpacing(5);
        experienceSlider.setMinorTickSpacing(1);
        //Create experiencePanel and add experienceLabelPanel and experienceSlider
        experiencePanel = new JPanel();
        experiencePanel.setLayout(new BorderLayout());
        experiencePanel.add(experienceLabelPanel, BorderLayout.NORTH);
        experiencePanel.add(experienceSlider, BorderLayout.SOUTH);
        //Create allPanel to group hobbiesPanel, comboPanel and experiencePanel
        allPanel = new JPanel();
        allPanel.setLayout(new BorderLayout());
        allPanel.add(hobbiesPanel, BorderLayout.NORTH);
        allPanel.add(comboPanel, BorderLayout.CENTER);
        allPanel.add(experiencePanel, BorderLayout.SOUTH);
        //Add allPanel to mainPanel
        mainPanel.add(allPanel, BorderLayout.CENTER);
        this.add(mainPanel); 
    }

    public static void createAndShowGUI() {
        AthleteFormV4 msw = new AthleteFormV4("Athlete Form V4");
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
