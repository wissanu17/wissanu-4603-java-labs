package rayayoi.wissanu.lab11;

 /**
 * This program call AhleteFormV15 that extends from AthleteFormV14
 * - After the user chooses menu Save, then the program will open the Save file dialog box, 
 * which the user then enters the filename. The program not only saves hobbies but also 
 * saves the number of experience years in another binary file.
 * - When the user chooses menu Open, the program opens the Open file dialog box which we then select the text filename 
 * and then show open dialog again and user choose binary file. Then, the program displays the hobbies that is read from the text file 
 * and the  years of experiences in the Bio text area in the format “<athlete name> has <years> years of experiences”
 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 24, 2023
 * 
 */

import javax.swing.*;
import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AthleteFormV15  extends AthleteFormV14 {

    protected String exOfAthleteToBio;

    public AthleteFormV15(String Window) {
        super(Window);
    }

    @Override
    public void saveFile() {
        super.saveFile();
        JFileChooser fileChooser = new JFileChooser();
        File fileCurrent = new File("");
        fileChooser.setCurrentDirectory(fileCurrent);
        int result = fileChooser.showSaveDialog(AthleteFormV15.this);
        if (result == JFileChooser.APPROVE_OPTION) {
            fileCurrent = fileChooser.getSelectedFile();
            try {
                FileOutputStream fos = new FileOutputStream(fileCurrent);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeUTF(nameStr);
                dos.writeInt(experienceSlider.getValue());
                dos.close();
                String filePath = fileCurrent.getAbsolutePath();
                fileChooser.setVisible(false);
                JOptionPane.showMessageDialog(AthleteFormV15.this, "Saving experiences year in file " + filePath);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(AthleteFormV15.this, "Failed to save file: " + ex.getMessage());
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
        fileChooser.setCurrentDirectory(new File(""));
        int result = fileChooser.showOpenDialog(AthleteFormV15.this);
        String exOfAthleteToBio = "";
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                FileInputStream fis = new FileInputStream(file);
                DataInputStream dis = new DataInputStream(fis);
                String name = dis.readUTF();
                int experience = dis.readInt();
                dis.close();
                if (experience <= 1) {
                    exOfAthleteToBio = name + " has " + experience + " year of experience";
                } else {
                    exOfAthleteToBio = name + " has " + experience + " years of experience";
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(AthleteFormV15.this, "Failed to open file: " + ex.getMessage());
            }
        }
        bioTextArea.append("\n" + exOfAthleteToBio);
    }
    
    public static void createAndShowGUI() {
        AthleteFormV15 msw = new AthleteFormV15("Athlete Form V15");
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
