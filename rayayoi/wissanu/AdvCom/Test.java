package rayayoi.wissanu.AdvCom;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Test extends JFrame {
    private JSlider slider;
    private int selectedValue = -1;

    public Test() {
        super("Slider Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        slider = new JSlider(JSlider.HORIZONTAL, 0, 20, 7);
        slider.setMajorTickSpacing(5);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        JPanel sliderPanel = new JPanel(new BorderLayout());
        sliderPanel.add(slider, BorderLayout.CENTER);
        getContentPane().add(sliderPanel, BorderLayout.CENTER);
        slider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int value = slider.getValue();
                selectedValue = value;
                JOptionPane.showMessageDialog(Test.this,
                        "Selected value is " + selectedValue,
                        "Slider Example",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}


