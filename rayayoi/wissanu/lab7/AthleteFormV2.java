 /**
 * This program call AhleteFormV2 that extends from AthleteForm
 * The output will show window that have the title of the program is "Athlete Form" and have all funtion as same as AthleteForm
 * but there are add JLabel : nationalityLabel, sportLabel, bioLabel on the left dide of window.
 * there add nationComboBox, sportList and bioTextArea tha have bioScrollPane to the right side of window
 * nationComboBox that have {"American", "Chinese", "Indonesian", "Japanese","Thai", "Vietnamese"}
 * sportList that have {"Boxing","Badminton","Football","Running"}
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab7;

import java.awt.*;
import javax.swing.*;

public class AthleteFormV2 extends AthleteForm {
    protected JLabel nationalityLabel, sportLabel, bioLabel;
    protected String[] nationality = {"American", "Chinese", "Indonesian", "Japanese","Thai", "Vietnamese"} ;
    protected String[] sport = {"Boxing","Badminton","Football","Running"};
    protected JPanel nationPanel, sportPanel, bioPanel, comboPanel;
    protected JComboBox nationComboBox;
    protected JList sportList;
    protected JTextArea bioTextArea;
    protected JScrollPane biScrollPane;

    public AthleteFormV2(String Window) {
        super(Window);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        //Create natoinalityLabel and create nationComboBox to select index 4 for show in window
        nationalityLabel = new JLabel("Nationality :");
        nationComboBox = new JComboBox<>(nationality);
        nationComboBox.setSelectedIndex(4);
        //Create sportLabel and create sportList to select each index to show in window
        sportLabel = new JLabel("Sport :");
        sportList = new JList<>(sport);
        sportList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        sportList.setSelectedIndex(2);
        //Create bioLabel and create bioTextArea that have scroll pane
        bioLabel = new JLabel("Bio :");
        bioTextArea = new JTextArea(4,40);
        bioTextArea.setText("");
        bioTextArea.setLineWrap(true);
        bioTextArea.setWrapStyleWord(true);
        biScrollPane = new JScrollPane(bioTextArea);
        //Create nationPanel to add nationalityLabel and nationComboBox
        nationPanel = new JPanel();
        nationPanel.setLayout(new GridLayout(1, 2));
        nationPanel.add(nationalityLabel);
        nationPanel.add(nationComboBox);
        //Create sportPanel to add sportLabel and sportList
        sportPanel = new JPanel();
        sportPanel.setLayout(new GridLayout(1, 2));
        sportPanel.add(sportLabel);
        sportPanel.add(sportList);
        //Create bioPanel to add bioLabel and bioTextfield that have bioScrollPane
        bioPanel = new JPanel();
        bioPanel.setLayout(new BorderLayout());
        bioPanel.add(bioLabel, BorderLayout.NORTH);
        bioPanel.add(biScrollPane, BorderLayout.SOUTH);
        //Create comboPanel to group nationPanel, sportPanel and bioPanel
        comboPanel = new JPanel();
        comboPanel.setLayout(new BorderLayout());
        comboPanel.add(nationPanel, BorderLayout.NORTH);
        comboPanel.add(sportPanel, BorderLayout.CENTER);
        comboPanel.add(bioPanel, BorderLayout.SOUTH);
        //Add comboPanel to main Panel
        mainPanel.add(comboPanel, BorderLayout.CENTER);
        this.add(mainPanel); 
    }
    
    public static void createAndShowGUI() {
        AthleteFormV2 msw = new AthleteFormV2("Athlete Form V2");
        msw.addComponents();
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
