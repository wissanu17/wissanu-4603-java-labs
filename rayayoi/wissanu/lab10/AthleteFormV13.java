package rayayoi.wissanu.lab10;

 /**
 * 1) After the user clicks menu Add, then the program checks the value of weight and finds that weight is not a number text.
 * Then, the program displays the dialog with the message “Please enter a valid number for Weight”
 * 2) After the user clicks menu Add, then the program checks the value of height and finds that height is not a number text.  
 * Then, the program displays the dialog with the message “Please enter a valid number for Height” 
 * 3) And check number of weight(0-200) and height(0-300)
 * 4) If the user enters both invalid weight and invalid height, the program will check weight and display 
 * the error message and then stop the program execution. 
 *  
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 10, 2023
 * 
 */

import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV13 extends AthleteFormV12 {

    protected double weightReturn, heightReturn;
    protected Boolean checkAddBl;

    public AthleteFormV13(String Window) {
        super(Window);
    }

    public double getValidNumber(String number, JTextField name, int max) {
        double returnCase = 0;
        if (!number.matches("\\d+(\\.\\d+)?")) { // check if input string is not numeric characters
            returnCase = -1;
        } else if (name == weightField) {
            double weight = Double.parseDouble(number);
            if (weight >= 0 && weight <= max) {
                returnCase = 1;
            } else {
                returnCase = 0;
            }
        } else if (name == heightField) {
            double height = Double.parseDouble(number);
            if (height >= 0 && height <= max) {
                returnCase = 1;
            } else {
                returnCase = 0;
            }
        }
        return returnCase;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object src = event.getSource();
        if (src == weightField || src == heightField) {
            notifyNumberTxtFieldChange(heightField);
            notifyNumberTxtFieldChange(weightField);
            messageWarn();
            if (checkAddBl == true) {
                super.actionPerformed(event);           
            } else {
                return;
            }
        } else {
            super.actionPerformed(event);
        }
    }

    @Override
    public void addAthlete() {
        notifyNumberTxtFieldChange(heightField);
        notifyNumberTxtFieldChange(weightField);
        messageWarn();
        System.out.println(checkAddBl);
        if (checkAddBl == true) {
            super.addAthlete();           
        } else {
            return;
        }
    }

    public void messageWarn() {
        if ((weightReturn == 0 || weightReturn == -1) && (heightReturn == 0 || heightReturn == -1)) {
            JOptionPane.showMessageDialog(null, "Wrong input", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
            System.exit(0);
        } else if (weightReturn == 0 || heightReturn == 0) {
            if (weightReturn == 0){
                JOptionPane.showMessageDialog(null, "Wrong Weight, it should between 0-200", athleteStr, JOptionPane.ERROR_MESSAGE);
            } else if (heightReturn == 0) {
                JOptionPane.showMessageDialog(null, "Wrong height, it should between 0-200", athleteStr, JOptionPane.ERROR_MESSAGE);
            
            }
            checkAddBl = false;
        } else if (weightReturn == -1 || heightReturn == -1) {
            if (weightReturn == -1) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for Weight", athleteStr, JOptionPane.ERROR_MESSAGE);
            } else if (heightReturn == -1) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number for Height", athleteStr, JOptionPane.ERROR_MESSAGE);
             
            } 
            checkAddBl = false;
        } else if (weightReturn == 1 || heightReturn == 1) {
            checkAddBl = true;
        } 
    }


    public void notifyNumberTxtFieldChange(JTextField txtField) {
        String numberTxt = txtField.getText();
        if (txtField == weightField) {
            weightReturn = getValidNumber(numberTxt, txtField, 200);
            //System.out.println(weightReturn);
        } else if (txtField == heightField) {
            heightReturn = getValidNumber(numberTxt, txtField, 300);
            //System.out.println(heightReturn);
        }
    }

    public static void createAndShowGUI() {
        AthleteFormV13 msw = new AthleteFormV13("Athlete Form V13");
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
