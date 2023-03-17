package rayayoi.wissanu.lab10;

 /**
 * This program call AhleteFormV11 that extends from AthleteFormV10
 * 1) Create menu Data which has menu items  Add, Display, Clear, Search and menu Sort 
 * which has menu items “By Name”, “By Height”, and “By Height and Weight”   These menus 
 * and menu items should have the fonts the same as other menus and menu items
 * 2) When the user clicks menu item add, the program will display the information of the athlete 
 * which is the string returned from the function toString() of class AthleteV2 in 
 * the dialog. The program also adds this athlete object into the array list. 
 * 3) When the user clicks menu item Display, the program displays 
 * the list of the athletes 
 * 4) When the user clicks the menu item “Clear” the program removes all 	
 * athletes in the list.
 * 5) When the user clicks the menu item “Search”, the program opens the input dialog 	to accept the athlete name to search as shown in Figure 12.  If the athlete with that name is 	found, the program 	displays the message in the format <AthleteV2  a> is found as shown 	in Figure 13.
 * If the athlete enters. The search athlete that is not in the list,      
 * the program displays the message in the format "Athlete <name> is NOT found" 
 * 

 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 10, 2023
 * 
 */

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import rayayoi.wissanu.lab9.*;
import rayayoi.wissanu.lab5.*;
import rayayoi.wissanu.lab5.Athlete.*;
import rayayoi.wissanu.lab6.*;

public class AthleteFormV11 extends AthleteFormV10 {
    protected Color menuColor;
    protected Font serifFont, menuFont;
    protected JMenu dataMenu, sortItem;
    protected JMenuItem addItem, displayItem, clearItem, searchItem;
    protected JMenuItem byNameItem, byHeightItem, byHeightWeightItem;
    protected ArrayList<AthleteV2> altArrList =  new ArrayList<AthleteV2>();
    protected String athleteStr, fullStr, dataAtl;

    public AthleteFormV11(String Window) {
        super(Window);
    }
    
    @Override
    public void addMenu() {
        super.addMenu();
        //create data menu
        dataMenu = new JMenu("Data");
        //Create menu,item in data
        sortItem = new JMenu("Sort");
        addItem = new JMenuItem("Add");
        displayItem = new JMenuItem("Display");
        clearItem = new JMenuItem("Clear");
        searchItem = new JMenuItem("Search");
        dataMenu.add(addItem);
        dataMenu.add(displayItem);
        dataMenu.add(clearItem);
        dataMenu.add(searchItem);
        dataMenu.add(sortItem);
        //Create item for sort menu
        byNameItem = new JMenuItem("by Name");
        byHeightItem = new JMenuItem("by Height");
        byHeightWeightItem = new JMenuItem("By weight height");
        sortItem.add(byNameItem);
        sortItem.add(byHeightItem);
        sortItem.add(byHeightWeightItem);
        //Add data menu to menu bar
        menuBar.add(dataMenu);
        //Set font and foreground
        menuFont = new Font("SanSerif", Font.BOLD, 14);
        dataMenu.setFont(menuFont);
        addItem.setFont(menuFont);
        displayItem.setFont(menuFont);
        clearItem.setFont(menuFont);
        searchItem.setFont(menuFont);
        sortItem.setFont(menuFont);
        byHeightItem.setFont(menuFont);
        byNameItem.setFont(menuFont);
        byHeightWeightItem.setFont(menuFont);

        menuColor = new Color(6, 57, 112);
        dataMenu.setForeground(menuColor);
        addItem.setForeground(menuColor);
        displayItem.setForeground(menuColor);
        clearItem.setForeground(menuColor);
        searchItem.setForeground(menuColor);
        sortItem.setForeground(menuColor);
        byHeightItem.setForeground(menuColor);
        byNameItem.setForeground(menuColor);
        byHeightWeightItem.setForeground(menuColor);
    }

    @Override
    public void addListeners() {
        super.addListeners();
        addItem.addActionListener(this);
        displayItem.addActionListener(this);
        clearItem.addActionListener(this);
        searchItem.addActionListener(this);    
    }
    public Gender toGender() { //Check gender and return
        if (maleButton.isSelected()) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }

    public void addAthlete() {
        double weightDouble = Double.parseDouble(weightField.getText());
        double heightDouble = Double.parseDouble(heightField.getText());
        AthleteV2 alt = new AthleteV2(nameField.getText(), weightDouble, heightDouble, toGender(), 
            nationComboBox.getSelectedItem().toString(), dateField.getText());
        altArrList.add(alt); //Add AthleteV2 to athlete array list
        JOptionPane.showMessageDialog(null,  alt);
    }

    public void displayAthlete() { //Display the athlete
        dataAtl = "";
        int countalt = 0;
        for (Athlete alt : altArrList) { //Count athlete in athlete array list
            countalt++;
            dataAtl += countalt + ". "  + alt + "\n";
        }

        if (altArrList.size() == 0) {
            JOptionPane.showMessageDialog(null,"There is no athlete in the list.");
        } else {
            JOptionPane.showMessageDialog(null,"There are " + altArrList.size() + " as follows :" + "\n" + dataAtl);
        }
    }

    public void clearAthlete() { //Clear athlete in array list
        altArrList.clear();
    }

    public void searchAthlete() { //Method to search athlete
        String searchAlt = JOptionPane.showInputDialog("Please enter athlete name :");
        if (altArrList.size() == 0) { //if not have data in array list
            JOptionPane.showMessageDialog(null, "No data" );
        } else {
            for (int i = 0; i < altArrList.size(); i++) {
                if (searchAlt.equalsIgnoreCase(altArrList.get(i).getName())) {
                    JOptionPane.showMessageDialog(null, altArrList.get(i));
                    break;
                } else {
                    if (i == altArrList.size() - 1)
                    JOptionPane.showMessageDialog(null, "Athlete " + searchAlt + " is not found." );
                }
    
            }
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src = event.getSource();
        if (src == addItem) {
            addAthlete();
        } else if (src == displayItem) {
            displayAthlete();
        } else if (src == clearItem) {
            clearAthlete();
        } else if (src == searchItem) {
            searchAthlete();
        }
    }

    public static void createAndShowGUI() {
        AthleteFormV11 msw = new AthleteFormV11("Athlete Form V11");
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
