package rayayoi.wissanu.lab10;

import javax.swing.*;

import rayayoi.wissanu.lab6.AthleteV2;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.ParseException;


public class AthleteFormV13 extends AthleteFormV12 {

    protected double weightReturn, heightReturn;
    protected Boolean checkAddBl;

    public AthleteFormV13(String Window) {
        super(Window);
    }

    public double getValidNumber(String number, JTextField name, int max) {
        double returnCase = 0;
        if (!number.matches("\\d+(\\.\\d+)?")) { // check if input string contains only numeric characters
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
        System.out.println("โปเต้สุดหล่ออะ");
        notifyNumberTxtFieldChange(heightField);
        notifyNumberTxtFieldChange(weightField);
        System.out.println(weightReturn);
        System.out.println(heightReturn);
        messageWarn();
        System.out.println(checkAddBl);
        if (checkAddBl == true) {
            System.out.println(checkAddBl + "right");
            super.actionPerformed(event);           
        } else {
            System.out.println(checkAddBl+ "wrong");
            return;
        }
    } else {
        System.out.println("kkkkkkk");
        super.actionPerformed(event);
    }
}

    @Override
    public void addAthlete() {
        notifyNumberTxtFieldChange(heightField);
        notifyNumberTxtFieldChange(weightField);
        System.out.println(weightReturn);
        System.out.println(heightReturn);
        messageWarn();
        System.out.println(checkAddBl);
        if (checkAddBl == true) {
            System.out.println(checkAddBl + "right");
            super.addAthlete();           
        } else {
            System.out.println(checkAddBl+ "wrong");
            return;
        }
    }

    public void messageWarn() {
        if ((weightReturn == 0 || weightReturn == -1) && (heightReturn == 0 || heightReturn == -1)) {
            JOptionPane.showMessageDialog(null, "Wrong both", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
            System.exit(0);
        } else if (weightReturn == 0) {
            JOptionPane.showMessageDialog(null, "Wrong Weight 0-200", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
        } else if (weightReturn == 1) {
            checkAddBl = true;
        } else if (weightReturn == -1) {
            JOptionPane.showMessageDialog(null, "Wrong type weight", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
        } else if (heightReturn == 0) {
            JOptionPane.showMessageDialog(null, "Wrong height 0-200", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
        } else if (heightReturn == 1) {
            checkAddBl = false;
        } else if (heightReturn == -1) {
            JOptionPane.showMessageDialog(null, "Wrong type tall", athleteStr, JOptionPane.ERROR_MESSAGE);
            checkAddBl = false;
        }
    }


    public void notifyNumberTxtFieldChange(JTextField txtField) {
        String numberTxt = txtField.getText();
        //String name = txtField.getName();
        //System.out.println(numberTxt);
        //if (numberTxt.trim().isEmpty()) { // check if text is empty or only contains whitespace
            // handle empty text
            //return;
        //}
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
