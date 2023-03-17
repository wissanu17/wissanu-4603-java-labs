package rayayoi.wissanu.lab10;

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

    //protected Gender genderType; 

    public AthleteFormV11(String Window) {
        super(Window);
    }
    
    @Override
    public void addMenu() {
        super.addMenu();   
        dataMenu = new JMenu("Data");

        sortItem = new JMenu("Sort");

        addItem = new JMenuItem("Add");
        displayItem = new JMenuItem("Display");
        clearItem = new JMenuItem("Clear");
        searchItem = new JMenuItem("Search");

        byNameItem = new JMenuItem("by Name");
        byHeightItem = new JMenuItem("by Height");
        byHeightWeightItem = new JMenuItem("By weight height");

        sortItem.add(byNameItem);
        sortItem.add(byHeightItem);
        sortItem.add(byHeightWeightItem);
        
        dataMenu.add(addItem);
        dataMenu.add(displayItem);
        dataMenu.add(clearItem);
        dataMenu.add(searchItem);
        dataMenu.add(sortItem);

        menuBar.add(dataMenu);

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
        searchItem.addActionListener(this);    }

    public Gender toGender() {
        if (maleButton.isSelected()) {
            return Gender.MALE;
        } else {
            return Gender.FEMALE;
        }
    }

    // public boolean checkAdd(AthleteV2 athlete) {
    //     return checkAddBl;
    //}
    public void addAthlete() {
        double weightDouble = Double.parseDouble(weightField.getText());
        double heightDouble = Double.parseDouble(heightField.getText());
        AthleteV2 alt = new AthleteV2(nameField.getText(), weightDouble, heightDouble, toGender(), nationComboBox.getSelectedItem().toString(), dateField.getText());
        //checkAdd(alt);
        /**AthleteV2 p = new AthleteV2("potae", 17, 891, Gender.FEMALE, "gghh", "12/02/1200");
        AthleteV2 p1 = new AthleteV2("pota", 19, 367, Gender.FEMALE, "gghh", "12/04/2028");
        AthleteV2 p2 = new AthleteV2("pot", 137, 57, Gender.FEMALE, "gghh", "12/03/2018");
        AthleteV2 p3 = new AthleteV2("po", 155, 88, Gender.FEMALE, "gghh", "12/01/2013");
        AthleteV2 p4 = new AthleteV2("p", 138, 7740, Gender.FEMALE, "gghh", "12/10/2000");

        altArrList.add(p);
        altArrList.add(p1);
        altArrList.add(p2);
        altArrList.add(p3);
        altArrList.add(p4);*/
        // if (checkAddBl = true) {
        //     altArrList.add(alt);
        //     JOptionPane.showMessageDialog(null,  alt);            
        // } else {
            
        // }
        // System.out.println(checkAddBl);
        altArrList.add(alt);
        JOptionPane.showMessageDialog(null,  alt);

    }

    public void displayAthlete() {
        dataAtl = "";
        int countalt = 0;

        for (Athlete alt : altArrList) {
            countalt++;
            dataAtl += countalt + ". "  + alt + "\n";
        }

        if (altArrList.size() == 0) {
            JOptionPane.showMessageDialog(null,"There is no athlete in the list.");
        } else {
            JOptionPane.showMessageDialog(null,"There are " + altArrList.size() + " as follows :" + "\n" + dataAtl);
        }
    }
    public void clearAthlete() {
        altArrList.clear();
    }

    public void searchAthlete() {
        String searchAlt = JOptionPane.showInputDialog("Please enter athlete name :");
        if (altArrList.size() == 0) {
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

        //JOptionPane.showInputDialog("dfdd",altArrList); 
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
