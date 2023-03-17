package rayayoi.wissanu.AdvCom;

import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class SimpleFormV6 extends SimpleFormV5 {

    protected JFileChooser fileChoose;

    public SimpleFormV6(String title) {
        super(title);
    }
    @Override
    public void addMenus() {
        super.addMenus();
        fileChoose = new JFileChooser();
        openMI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                int result = fileChoose.showOpenDialog(null);
                
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChoose.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Opening " + file.getName());
                } else {
                    JOptionPane.showMessageDialog(null, "Open file cancelled by the user");
                }
            }
        });
    }

    public static void createAndShowGUI() {
        SimpleFormV6 window = new SimpleFormV6("SimpleFormV6");
        window.addComponents();
        window.addMenus();
        window.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
