package rayayoi.wissanu.AdvCom;

import javax.swing.*;
import java.awt.event.*;

import rayayoi.wissanu.lab7.AthleteForm;

public class AthleteFormV8 extends AthleteForm implements ActionListener {

    protected String weightStr, nameStr, heightStr, dateStr, messageInfo;

    public AthleteFormV8(String Window) {
        super(Window);
    }
 
    public void getUserInfo() {
        weightStr = new String(weightField.getText());
        nameStr = new String(nameField.getText());
        heightStr = new String(heightField.getText());
        dateStr = new String(dateField.getText());
        messageInfo = "name : " + nameStr + "\nweight: " + 
                weightStr + "\nheight : " + heightStr + "\ndate of birth : " + dateStr;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if (event.getSource() == submitButton) {
            JOptionPane.showMessageDialog(null,messageInfo);
        }
    }

    public void addListeners() {
        submitButton.addActionListener(this);
    }

    public static void createAndShowGUI() {
        AthleteFormV8 msw = new AthleteFormV8("Athlete Form V8");
        msw.addComponents();
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
