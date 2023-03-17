package rayayoi.wissanu.AdvCom;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SimpleFormV5 extends SimpleFormV4 implements ActionListener {

    public SimpleFormV5(String title) {
        super(title);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        hobbiesLst.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    String selectedItem = (String) hobbiesLst.getSelectedValue();
                    JOptionPane.showMessageDialog(null, selectedItem);
                }
            }
        });
    }
    
    public static void createAndShowGUI() {
        SimpleFormV5 window = new SimpleFormV5("SimpleFormV5");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
