package rayayoi.wissanu.lab11;

 /**
 * This program call AhleteFormV16 that extends from AthleteFormV15
 * - When the user chooses menu Save, the program asks the user to specify three filenames for saving hobbies 
 * and saving the experience years. The program also opens the save file dialog to save an athlete object, 
 * the user then first displays the athlete object that is created from the data in the form 
 * and then displays the dialog message shows the file path that the athlete object is saved.
 * - When the user chooses menu Open, the program opens the Open file dialog three times to open those three saved files
 * Then, the program reads the contents of each file and displays the message to bio text area
 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 24, 2023
 * 
 */

import javax.swing.*;
import rayayoi.wissanu.lab6.AthleteV2;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AthleteFormV16 extends AthleteFormV15 {

    public AthleteFormV16(String Window) {
        super(Window);
    }
    public static void createAndShowGUI() {
        AthleteFormV16 msw = new AthleteFormV16("Athlete Form V16");
        msw.addComponents();
        msw.initValues();
        msw.addMenu();
        msw.addListeners();
        msw.setFrameFeatures();
    }

    @Override
    public void saveFile() {
        super.saveFile();
        JFileChooser fileChooser = new JFileChooser();
        File fileCurrent = new File("");
        fileChooser.setCurrentDirectory(fileCurrent);
        int option = fileChooser.showSaveDialog(AthleteFormV16.this);

        if (option == JFileChooser.APPROVE_OPTION) {
            fileCurrent = fileChooser.getSelectedFile();
            try {
                String filePath = fileCurrent.getAbsolutePath();

                double weightDouble = Double.parseDouble(weightField.getText());
                double heightDouble = Double.parseDouble(heightField.getText());
                AthleteV2 alt = new AthleteV2(nameField.getText(), weightDouble, heightDouble, toGender(), 
                    nationComboBox.getSelectedItem().toString(), dateField.getText());
                JOptionPane.showMessageDialog(AthleteFormV16.this,alt);
                JOptionPane.showMessageDialog(AthleteFormV16.this, "Saving the athlete in the file " + filePath);
                writeToFile(alt, filePath);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(AthleteFormV16.this, "Failed to save file: " + ex.getMessage());
            }
        }
    }

    public static void writeToFile(Object obj, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void openFile() {
        super.openFile();
        JFileChooser fileChooser = new JFileChooser();

        File fileCurrent = new File("");
        fileChooser.setCurrentDirectory(fileCurrent);
        int result = fileChooser.showOpenDialog(AthleteFormV16.this);
        String oneAthleteStr  = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            fileCurrent = fileChooser.getSelectedFile();
            try {
                ObjectInputStream athleteReader = new ObjectInputStream(new FileInputStream(fileCurrent.getAbsolutePath()));
                AthleteV2 athlete = (AthleteV2) athleteReader.readObject();
                athleteReader.close();
                oneAthleteStr = athlete.toString();
                
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        bioTextArea.append("\n" + oneAthleteStr);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
