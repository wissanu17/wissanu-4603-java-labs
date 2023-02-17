 /**
 * This program call AhleteFormV5 that extends from AthleteFormV4
 * The output will show window that have the title of the program is "Athlete Form V5" and have all funtion as same as AthleteFormV4
 * but there will change the font, color and background color to JLabel, JTextField, JMenu, JMenuItem and JButton
 * and add tool tips to JButton and JMenu
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

public class AthleteFormV5 extends AthleteFormV4 {

    Color sportListColor, textFieldColor, textFieldColor2, menuColor;
    Font serifFont, bottonFont, menuFont;

    public AthleteFormV5(String Window) {
        super(Window);
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        //Set background color to nameField, weightField, heightField, dateField and bioTextArea
        textFieldColor = new Color(167,59,36);
        textFieldColor2 = new Color(200, 200, 200);
        nameField.setBackground(textFieldColor);
        weightField.setBackground(textFieldColor);
        heightField.setBackground(textFieldColor);
        dateField.setBackground(textFieldColor);
        bioTextArea.setBackground(textFieldColor2);
        //Set Font of type JLabel and JButton
        serifFont = new Font("Serif", Font.BOLD, 14);
        bottonFont = new Font("Serif", Font.ITALIC | Font.BOLD, 16);
        nameLabel.setFont(serifFont);
        weightLabel.setFont(serifFont);
        heightLabel.setFont(serifFont);
        birthdateLabel.setFont(serifFont);
        genderLabel.setFont(serifFont);
        hobbiesLabel.setFont(serifFont);
        nationalityLabel.setFont(serifFont);
        sportLabel.setFont(serifFont);
        bioLabel.setFont(serifFont);
        experienceLabel.setFont(serifFont);
        cancelButton.setFont(bottonFont);
        resetButton.setFont(bottonFont);
        submitButton.setFont(bottonFont);
        //Set fore ground to sportList
        sportListColor = new Color(35, 45, 222);
        sportList.setForeground(sportListColor);
        //Add tool tips to cancelButton, resetButton and submitButton
        cancelButton.setToolTipText("Press the cancel button to cancel this form");
        resetButton.setToolTipText("Press the reset button to reset this form");
        submitButton.setToolTipText("Press the submit button to submit this form");
    }

    @Override
    public void addMenu() {
        super.addMenu();
        //Set font to menu
        menuFont = new Font("SanSerif", Font.BOLD, 14);
        fileMenu.setFont(menuFont);
        configMenu.setFont(menuFont);
        colourMenu.setFont(menuFont);
        sizeMenu.setFont(menuFont);
        newMenuItem.setFont(menuFont);
        openMenuItem.setFont(menuFont);
        saveMenuItem.setFont(menuFont);
        exitMenuItem.setFont(menuFont);
        redMenuItem.setFont(menuFont);
        greenMenuItem.setFont(menuFont);
        blueMenuItem.setFont(menuFont);
        smallMenuItem.setFont(menuFont);
        mediumMenuItem.setFont(menuFont);
        largeMenuItem.setFont(menuFont);
        //Set color to menu
        menuColor = new Color(6, 57, 112);
        fileMenu.setForeground(menuColor);
        configMenu.setForeground(menuColor);
        colourMenu.setForeground(menuColor);
        sizeMenu.setForeground(menuColor);
        newMenuItem.setForeground(menuColor);
        openMenuItem.setForeground(menuColor);
        saveMenuItem.setForeground(menuColor);
        exitMenuItem.setForeground(menuColor);
        redMenuItem.setForeground(menuColor);
        greenMenuItem.setForeground(menuColor);
        blueMenuItem.setForeground(menuColor);
        smallMenuItem.setForeground(menuColor);
        mediumMenuItem.setForeground(menuColor);
        largeMenuItem.setForeground(menuColor);
        //Add tool tips to fileMenu and configMenu
        fileMenu.setToolTipText("To create new, open, save form or exit");
        configMenu.setToolTipText("To configure size and color of a component");

    }

    public static void createAndShowGUI() {
        AthleteFormV5 msw = new AthleteFormV5("Athlete Form V4");
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
