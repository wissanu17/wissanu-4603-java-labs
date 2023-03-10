 package rayayoi.wissanu.lab9;
 /**
 * This program call AhleteFormV8 that extends from AthleteFormV7
 * Create initValue for set default value of Component
 * 1. When user click Submit button  the program gets all values from all components 
 * except the “Bio” text area, and then displays all values in the “Bio” text area.
 * 2. When the user clicks the “Cancel” button, the program undo all 
 * settings that are performed in the method initValues() and also cancel 
 * the background color setting of all text fields as the status the same as AthleteFormV6.
 * 3. When the user clicks the “Reset” button ,the program reset all 
 * values and also reset the background color of all text fields to white color.

 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 10, 2023
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

import rayayoi.wissanu.lab8.AthleteFormV6;

public class AthleteFormV8 extends AthleteFormV6 implements ActionListener {

    protected java.util.List<JTextField> textFieldsList;
    protected ArrayList<JTextField> textFieldsArrayList;
    protected java.util.List<JCheckBox> hobbiesCheckList;
    protected ArrayList<JCheckBox> hobbiesArrayList;
    protected String weightStr, nameStr, heightStr, dateStr, genderInfo, hobbiesStr, 
                        nationStr, SportStr, ExperienceStr, resultTxt;

    public AthleteFormV8(String Window) {
        super(Window);
    }
    @Override
    protected void addComponents() {
        super.addComponents();
        //Create array list of textfield for shorter code
        textFieldsList = Arrays.asList(nameField, weightField, heightField, dateField);
        textFieldsArrayList = new ArrayList<JTextField>(textFieldsList);
        //Create array list of hibby checkbox for shorter code.
        hobbiesCheckList = Arrays.asList(readingBox, gardeningBox, watchingMovieBox, ShoppingBox, othersBox);
        hobbiesArrayList = new ArrayList<JCheckBox>(hobbiesCheckList);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object srcObject = event.getSource();
        if (srcObject == submitButton) {
            handleSubmitButton();
        }

        else if (srcObject == cancelButton) {
            handleCancelButton();
        }

        else if (srcObject == resetButton) {
            handleResetButton();
        }
    }

    public void addListeners() {
        //Add listener to "Submit", "Cancel" and "Reset" button
        submitButton.addActionListener(this);
        cancelButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    protected void handleResetButton() {
        //Loop for set text and background of textfield 
        for (JTextField tf: textFieldsArrayList) {
            tf.setText("");
            tf.setBackground(null);
        }
        //Clear selected of Gender button
        groupRadioButton.clearSelection();
        //Loop for set false selected to hobby check box
        for (JCheckBox cb : hobbiesArrayList) {
            cb.setSelected(false);
        }
        //Remove selected sport list from index 0 -3
        sportList.removeSelectionInterval(0, 3);
        //Set selected to nationality combo box to null
        nationComboBox.setSelectedItem(null);
    }

    protected void handleCancelButton() {
        //Loop for set text and background
        for (JTextField tf : textFieldsArrayList) {
            tf.setText("");
            tf.setBackground(null);
        }
        //Clear selected of Gender radio button
        groupRadioButton.clearSelection();
    }

    protected void handleSubmitButton() {
        //Get value for use resultTxt(String)
        getValues();
        bioTextArea.setText(resultTxt);
    }

    protected String getValues() {
        genderInfo = maleButton.isSelected() ? "Male" : "Female" ;
        weightStr = new String(weightField.getText());
        nameStr = new String(nameField.getText());
        heightStr = new String(heightField.getText());
        dateStr = new String(dateField.getText());
        //Get text from hobby check box
        hobbiesStr = new String("");
        for (JCheckBox hobbie : hobbiesArrayList) {
            if (hobbie.isSelected()) {
                hobbiesStr = hobbiesStr  + hobbie.getText() + " " ;
            }
        }
        //Get String of experience slider
        int value = experienceSlider.getValue();
        ExperienceStr = Integer.toString(value);
        //Get string from sport list and nationality combo box
        nationStr = new String(nationComboBox.getSelectedItem().toString());
        SportStr = new String(sportList.getSelectedValue().toString());
        //Create variable to accept all value to string and return
        resultTxt = "name : " + nameStr + "\nweight: " + 
                weightStr + "\nheight : " + heightStr + "\ndate of birth : " + dateStr + "\nGender : " + genderInfo + 
                "\nHobbies : " + hobbiesStr + "\nNationality : " + nationStr + "\nSport : " + "[" + SportStr + "]" + "\nExperience : " + ExperienceStr;
        return resultTxt;
    }
    //Set default value
    protected void initValues() {
        nameField.setText("Wissanu Rayayoi");
        weightField.setText("65");
        heightField.setText("180");
        dateField.setText("17/11/2003");
        for (JTextField tf: textFieldsArrayList) {
            tf.setBackground(Color.PINK);
        }
        maleButton.setSelected(true);
        experienceSlider.setValue(7);
    }

    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
        msw.initValues();
        msw.addMenu();
        msw.addListeners();
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
