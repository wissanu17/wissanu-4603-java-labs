package rayayoi.wissanu.lab9;
 /**
 * This program call AhleteFormV9 that extends from AthleteFormV8
 * 1. When the user changes text in any text field and then press “Enter” key, 
 * the program will show the  JOptionPane message dialog that shows the change 
 * in the format “<text field name> is changed to <the new text value>”.
 * 
 * 2. When the user changes the nationality combo box value, the program displays 
 * JOptionPane message dialog with the text in the format 
 * “Nationality is changed to <the most recently selected value>.
 * 
 * 3. When the user selects one of the radio buttons, 
 * the program displays the message “<radio button name> is selected”
 * 
 * 4. When the user selects any hobby checkbox, the program displays 
 * the message “<hobby name> is also your hobby”
 * 5. Short cut key
 * 5.1) When the user chooses a menu item {New, Open, Save} the 
 * program shows the message dialog “You choose menu <menu name>”.
 * 
 * 5.2) When the user chooses the menu Exit, the program exits.
 * 
 * 6. The accelerator key for menu {New, Open, Save, Exit} by typing 
 * {CTRL-N (Command-N for Mac), CTRL-O  (Command-N for Mac), 
 * CTRL-S (Command-S for Mac), and CTRL-Q (Command-Q for Mac)} 
 * 
 * 7. When the user sees the menu File, the user can also choose menu item 
 * {New, Open, Save, Exit} by typing {N or n, O or o, S or s, X or x}

 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 10, 2023
 * 
 */
import javax.swing.*;
import java.awt.event.*;

public class AthleteFormV9 extends AthleteFormV8 {

    protected String nationNewValue;
    protected JCheckBox[] hobbyCheckbox;
    protected JMenuItem[] menuItemList;

    public AthleteFormV9(String Window) {
        super(Window);
    }
    
    @Override
    public void addListeners() {
        super.addListeners();
        nationComboBox.addActionListener(this);
        maleButton.addActionListener(this);
        femaleButton.addActionListener(this);
        //Loop for meassage dialog when key press ENTER on textfield
        for (JTextField tf : textFieldsArrayList) {
            tf.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent event) {
                    if (event.getKeyCode() == KeyEvent.VK_ENTER) {
                        String newText = tf.getText();
                        if (tf == nameField) {
                            JOptionPane.showMessageDialog(null, "Name is changed to " + newText);
                        } else if (tf == weightField) {
                            JOptionPane.showMessageDialog(null, "Weight is changed to " + newText);
                        } else if (tf == heightField) {
                            JOptionPane.showMessageDialog(null, "Height is changed to " + newText);
                        } else if (tf == dateField) {
                            JOptionPane.showMessageDialog(null, "Date of birth is changed to " + newText);
                        }
                    }
                }
            });
        }
        //Add listener to hobby check box
        for (int i = 0; i < hobbyCheckbox.length; i++) {
            hobbyCheckbox[i].addActionListener(this);
        }
        //Add listener to menu item
        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        
        Object actionObject = event.getSource();
        //Action to nationality combo box
        if (actionObject == nationComboBox) {
            nationNewValue = nationComboBox.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, 
                "Nationality is changed to " + nationNewValue);
        } 
        //Action to Gender radio button
        else if (actionObject == maleButton) {
            JOptionPane.showMessageDialog(null, 
                maleButton.getText() + " is selected");
        } else if (actionObject == femaleButton) {
            JOptionPane.showMessageDialog(null, 
                femaleButton.getText() + " is selected");
        } 
        //action to hobby check box
        else if (actionObject == watchingMovieBox) {
            JCheckBox selectedCheckbox = (JCheckBox) event.getSource();
            String hobbyName = selectedCheckbox.getText();
            if (selectedCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, hobbyName + " is also your hobby");
            } else {
                JOptionPane.showMessageDialog(null, hobbyName + " is no longer your hobby");
            }
        } else if (actionObject == readingBox) {
            JCheckBox selectedCheckbox = (JCheckBox) event.getSource();
            String hobbyName = selectedCheckbox.getText();
            if (selectedCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, hobbyName + " is also your hobby");
            } else {
                JOptionPane.showMessageDialog(null, hobbyName + " is no longer your hobby");
            }
        } else if (actionObject == gardeningBox) {
            JCheckBox selectedCheckbox = (JCheckBox) event.getSource();
            String hobbyName = selectedCheckbox.getText();
            if (selectedCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, hobbyName + " is also your hobby");
            } else {
                JOptionPane.showMessageDialog(null, hobbyName + " is no longer your hobby");
            }
        } else if (actionObject == ShoppingBox) {
            JCheckBox selectedCheckbox = (JCheckBox) event.getSource();
            String hobbyName = selectedCheckbox.getText();
            if (selectedCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, hobbyName + " is also your hobby");
            } else {
                JOptionPane.showMessageDialog(null, hobbyName + " is no longer your hobby");
            }
        } else if (actionObject == othersBox) {
            JCheckBox selectedCheckbox = (JCheckBox) event.getSource();
            String hobbyName = selectedCheckbox.getText();
            if (selectedCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(null, hobbyName + " is also your hobby");
            } else {
                JOptionPane.showMessageDialog(null, hobbyName + " is no longer your hobby");
            }
        } 
        //Action to menu item
        else if (actionObject == newMenuItem) {
            JMenuItem selectedMenuItem = (JMenuItem) event.getSource();
            String menuName = selectedMenuItem.getText();
            JOptionPane.showMessageDialog(null, "You click menu " + menuName);
        }
        else if (actionObject == openMenuItem) {
            JMenuItem selectedMenuItem = (JMenuItem) event.getSource();
            String menuName = selectedMenuItem.getText();
            JOptionPane.showMessageDialog(null, "You click menu " + menuName);
        }
        else if (actionObject == saveMenuItem) {
            JMenuItem selectedMenuItem = (JMenuItem) event.getSource();
            String menuName = selectedMenuItem.getText();
            JOptionPane.showMessageDialog(null, "You click menu " + menuName);
        }
        else if (actionObject == exitMenuItem) {
            System.exit(0);
        }
    }

    @Override
    protected void addComponents() {
        super.addComponents();
        //Add all hobbby to hobbyCheckbox
        hobbyCheckbox = new JCheckBox[5];
        hobbyCheckbox[0] = readingBox;
        hobbyCheckbox[1] = gardeningBox;
        hobbyCheckbox[2] = watchingMovieBox;
        hobbyCheckbox[3] = ShoppingBox;
        hobbyCheckbox[4] = othersBox;
    }

    @Override
    public void addMenu() {
        super.addMenu();
        //Add Shortcut key to menu item
        newMenuItem.setAccelerator(KeyStroke.getKeyStroke('N', KeyEvent.CTRL_DOWN_MASK));
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke('O', KeyEvent.CTRL_DOWN_MASK));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke('S', KeyEvent.CTRL_DOWN_MASK));
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke('Q', KeyEvent.CTRL_DOWN_MASK));
        //Add shortcut key when user see menu item
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        exitMenuItem.setMnemonic(KeyEvent.VK_X);
    }

    public static void createAndShowGUI() {
        AthleteFormV9 msw = new AthleteFormV9("Athlete Form V9");
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
