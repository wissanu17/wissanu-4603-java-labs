package rayayoi.wissanu.AdvCom;

import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV9 extends AthleteFormV8 implements ItemListener {

    protected String genderInfo;

    public AthleteFormV9(String Window) {
        super(Window);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        JRadioButton selectItem = (JRadioButton) event.getItemSelectable();
        if (event.getStateChange() == ItemEvent.SELECTED) {
            genderInfo = selectItem.getActionCommand();
        }
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        messageInfo = messageInfo + "\nGender : " + genderInfo;
    }

    @Override
    public void addListeners() {
        super.addListeners();
        maleButton.addItemListener(this);
        femaleButton.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        getUserInfo();
        if (event.getSource() == submitButton) {
            JOptionPane.showMessageDialog(null,messageInfo);
        }
    }

    public static void createAndShowGUI() {
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V8");
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
