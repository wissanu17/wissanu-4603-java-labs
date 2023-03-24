package rayayoi.wissanu.lab11;

 /**
 * This program call AhleteFormV14 that extends from AthleteFormV13
 * - After the user chooses menu Save the program will open the save file dialog to ask the user 
 * to enter the filename. The user can enter any filename but it should have an extension .txt 
 * - When the user clicks menu Open. The program displays the hobbies delimited with “,” 
 * in the Bio text area in the format “<athlete name> has hobbies as <hobby 1>, <hobby 2>, …, <hobby n>”
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 24, 2023
 * 
 */

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.io.*;

import rayayoi.wissanu.lab10.*;

public class AthleteFormV14 extends AthleteFormV13 {

    protected String hobbieOfAthleteToBio; 
    protected File file;
    protected String hobbyStrToFile = "";

    public AthleteFormV14(String Window) {
        super(Window);
    }

    @Override
    public void actionPerformed(ActionEvent event) { // Add action to save and open menu 
        Object src = event.getSource();
        if (src == saveMenuItem) {
            saveFile();
        } else if (src ==  openMenuItem) {
            openFile();
        } else {
            super.actionPerformed(event);
        }
    }

    public void saveFile() {
        getValues(); //  Get the value
        JFileChooser fileChooser = new JFileChooser();
        File fileCurrent = new File("");
        fileChooser.setCurrentDirectory(fileCurrent);
        int result = fileChooser.showSaveDialog(AthleteFormV14.this);
        if (result == JFileChooser.APPROVE_OPTION) {
            fileCurrent = fileChooser.getSelectedFile();
            try {
                FileWriter fileWriter = new FileWriter(fileCurrent);
                PrintWriter writer = new PrintWriter(fileWriter);
                String[] hobbiesSplit = hobbiesStr.split(", ");
                String hobbyStrToFile = String.join(", ", hobbiesSplit);
                writer.print(nameStr + "\n" + hobbyStrToFile);
                writer.close();
                String filePath = fileCurrent.getAbsolutePath();
                fileChooser.setVisible(false);
                if (hobbiesSplit.length != 1) {
                    JOptionPane.showMessageDialog(AthleteFormV14.this, "Saving hobbies in file " + filePath);
                } else {
                    JOptionPane.showMessageDialog(AthleteFormV14.this, "Saving a hobby in file " + filePath);        
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(AthleteFormV14.this, "Failed to save file: " + ex.getMessage());
            }
            
        }
    }

    public void openFile() {
        String[] hobbiesData = new String[2];
        bioTextArea.setText("");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(""));
        int result = fileChooser.showOpenDialog(AthleteFormV14.this);
        String hobbieOfAthleteToBio = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                int lines = 0;

                while ((line = reader.readLine()) != null) {
                    if (lines%2 == 0) {
                        hobbiesData[0] = line;
                    }
                    if (lines%2 == 1) {
                        hobbiesData[1] = line;
                        String[] splitHobby = line.split(", ");
                        if (splitHobby.length == 1) {
                            hobbieOfAthleteToBio += hobbiesData[0] + " has a hobby as " + hobbiesData[1];
                        } else if (splitHobby.length >= 1) {
                            hobbieOfAthleteToBio += hobbiesData[0] + " has hobbies as " + hobbiesData[1];
                        } if (splitHobby.length == 0) {
                            hobbieOfAthleteToBio += hobbiesData[0] + " does not have any hobby";
                        }
                    }
                    lines++;
                }
                if (lines == 1) {
                    hobbieOfAthleteToBio += hobbiesData[0] + " does not have any hobby";
                }
                reader.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(AthleteFormV14.this, "Failed to open file: " + ex.getMessage());
            }
        }
        bioTextArea.setText(hobbieOfAthleteToBio);
    }
    

    
    
    public static void createAndShowGUI() {
        AthleteFormV14 msw = new AthleteFormV14("Athlete Form V14");
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
