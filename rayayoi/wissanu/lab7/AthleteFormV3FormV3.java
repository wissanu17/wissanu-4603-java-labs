 /**
 * This program call AhleteFormV3V3 that extends from AthleteFormV2
 * The output will show window that have the title of the program is "Athlete Form V3" and have all funtion as same as AthleteFormV2
 * but there are add JMenuBar call menuBar to window
 * The menuBar that have fileMenu(in the fileMenu have newMenuItem, openMenuItem, saveMenuItem) and configMenu(in the configMenu have colourMenu, sizeMenu)
 * The colourMenu that have redMenuItem, greenMenuItem, blueMenuItem
 * The sizeMenu that have smallMenuItem, mediumMenuItem, largeMenuItem
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab7;

import javax.swing.*;

public class AthleteFormV3FormV3 extends AthleteFormV2{
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu, colourMenu, sizeMenu;
    protected JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem, redMenuItem, greenMenuItem, blueMenuItem, smallMenuItem, mediumMenuItem, largeMenuItem;
    
    public AthleteFormV3FormV3(String Window) {
        super(Window);
    }

    public static void createAndShowGUI() {
        AthleteFormV3FormV3 msw = new AthleteFormV3FormV3("Athlete Form V3");
        msw.addComponents();
        msw.addMenu();
        msw.setFrameFeatures();
    }

    public void addMenu() {
        this.add(mainPanel); 
        //Create JMenuBar as name menuBar
        menuBar = new JMenuBar();
        //Create JMenu : fileMenu, configMenu, colourMenu, sizeMenu
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        colourMenu = new JMenu("colour");
        sizeMenu = new JMenu("Size");
        //Add fileMenu, configMenu to menuBar
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        //Add colourMenu, sizeMenu to configMenu
        configMenu.add(colourMenu);
        configMenu.add(sizeMenu);
        //Create ImageIcon : newIcon, openIcon, saveIcon
        ImageIcon newIcon = new ImageIcon("C:/Users/Asus/Desktop/81301/wissanu-4603-java-labs/rayayoi/wissanu/lab7/icon-lab7/new-icon.png");
        ImageIcon openIcon = new ImageIcon("C:/Users/Asus/Desktop/81301/wissanu-4603-java-labs/rayayoi/wissanu/lab7/icon-lab7/open-icon.png");
        ImageIcon saveIcon = new ImageIcon("C:/Users/Asus/Desktop/81301/wissanu-4603-java-labs/rayayoi/wissanu/lab7/icon-lab7/save-icon.png");
        //Create JMenuItem : newMenuItem, openMenuItem, saveMenuItem, exitMenuItem and add the icon
        newMenuItem = new JMenuItem("New", newIcon);
        openMenuItem = new JMenuItem("Open", openIcon);
        saveMenuItem = new JMenuItem("Save", saveIcon);
        exitMenuItem = new JMenuItem("Exit");
        //Add JMenuItem : newMenuItem, openMenuItem, saveMenuItem, exitMenuItem to fileMenu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        // Create JMenuItem : redMenuItem, greenMenuItem, blueMenuItem, smallMenuItem, mediumMenuItem, largeMenuItem
        redMenuItem = new JMenuItem("Red");
        greenMenuItem = new JMenuItem("Green");
        blueMenuItem = new JMenuItem("Blue");
        smallMenuItem = new JMenuItem("16");
        mediumMenuItem = new JMenuItem("20");
        largeMenuItem = new JMenuItem("24");
        //Add JMenuItem : redMenuItem, greenMenuItem, blueMenuItem to colourMenu
        colourMenu.add(redMenuItem);
        colourMenu.add(greenMenuItem);
        colourMenu.add(blueMenuItem);
        //Add JMenuItem : smallMenuItem, mediumMenuItem, largeMenuItem to sizeMenu
        sizeMenu.add(smallMenuItem);
        sizeMenu.add(mediumMenuItem);
        sizeMenu.add(largeMenuItem);
        //Use setJMenuBar to set menu bar
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
