 /**
 * This program call AhleteForm that extends from MySimpleWindow
 * The output will show window that have the title of the program is "Athlete Form"
 * There are three buttons whose names are "Cancel", "Reset" and "Submit" from MySimple window.
 * There are four panels, the main panel, the panel for the button, gender panel and group panel.
 * There are JLabel : nameLabel, weightLabel, heightLabel, birthdateLabel, 
 * genderLabel on left side of widow.
 * There are JTextField : nameField, weightField, heightField, dateField on the right of window.
 * There are JRadioButton : maleButton, femaleButton on the right of window and on same row with genderLabel.
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


public class AthleteForm extends MySimpleWindow {
    protected JLabel nameLabel, weightLabel, heightLabel, birthdateLabel, genderLabel;
    protected JTextField nameField, weightField, heightField, dateField;
    protected JRadioButton maleButton, femaleButton;
    protected JPanel genderPanel, groupPanel;
    protected ButtonGroup groupRadioButton;

    public AthleteForm(String Window) {
        super(Window);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        //Create Jlabel
        nameLabel = new JLabel("Name :");
        weightLabel = new JLabel("Weight :");
        heightLabel = new JLabel("Height :");
        birthdateLabel = new JLabel("Date of Birth (dd-mm-yyyy) :");
        genderLabel = new JLabel("Gender :");
        //Create JTextfield
        nameField = new JTextField(15);
        weightField = new JTextField(15);
        heightField = new JTextField(15);
        dateField = new JTextField(15);
        //Create JRadioButton
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        //Use ButtonGroup for user can choose just one choice. 
        groupRadioButton = new ButtonGroup();
        groupRadioButton.add(maleButton);
        groupRadioButton.add(femaleButton);
        //create genderPanel type JPanel for male and female button
        genderPanel = new JPanel();
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        //Create groupPanel type JPanel to group all component
        groupPanel = new JPanel();
        groupPanel.setLayout(new GridLayout(5,2));
        groupPanel.add(nameLabel);
        groupPanel.add(nameField);
        groupPanel.add(weightLabel);
        groupPanel.add(weightField);
        groupPanel.add(heightLabel);
        groupPanel.add(heightField);
        groupPanel.add(birthdateLabel);
        groupPanel.add(dateField);
        groupPanel.add(genderLabel);
        groupPanel.add(genderPanel);
        //Set layout for main panel
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(groupPanel, BorderLayout.NORTH);   
        mainPanel.add(buttonPanel, BorderLayout.SOUTH); 
        this.add(mainPanel);    
    }
    
    public static void createAndShowGUI() {
        AthleteForm msw = new AthleteForm("Athlete Form");
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