 /**
 * This program call MySimpleWindow that extends from JFrame
 * The output will show window that have the title of the program is "My simple window"
 * There are three buttons whose names are "Cancel", "Reset" and "Submit".
 * There are two panels, the main panel and the panel for the button.
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : Febuary 3, 2022
 * 
 */
package rayayoi.wissanu.lab7;

import javax.swing.*;

class MySimpleWindow extends JFrame {
    protected JButton cancelButton, resetButton, submitButton;
    protected JPanel mainPanel, buttonPanel;

    public MySimpleWindow(String Window) {
        super(Window);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    protected void setFrameFeatures() {
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    protected void addComponents() {
        //Create button "Cancle", "Reset" and "Submit"
        cancelButton = new JButton("Cancel");
        resetButton = new JButton("Reset");
        submitButton = new JButton("Submit");
        //Create button panel
        buttonPanel = new JPanel();
        //Add "Cancle", "Reset" and "Submit" button to button panel
        buttonPanel.add(cancelButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(submitButton);
        //Create main panel
        mainPanel = new JPanel();
        //Add button panel to main panel
        mainPanel.add(buttonPanel);
        add(mainPanel);
    }

    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }
}

