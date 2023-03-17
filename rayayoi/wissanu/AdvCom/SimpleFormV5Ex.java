package rayayoi.wissanu.AdvCom;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SimpleFormV5Ex extends SimpleFormV4 {
    protected JSlider slider;
    protected JPanel sliderPanel;
    protected int selectedValue = -1;

    public SimpleFormV5Ex(String title) {
        super(title);
    }

    @Override
    public void addComponents() {
        super.addComponents();
        slider = new JSlider(0,10,5);
        slider.setMajorTickSpacing(2);
        slider.setMinorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setPaintLabels(true);

        sliderPanel = new JPanel();
        sliderPanel.add(slider);

        contentBottomPanel.add(sliderPanel, BorderLayout.CENTER);
    }
    
    public void addListener() {
        slider.addMouseListener(new SliderMouseListener());
    }

    protected class SliderMouseListener extends MouseAdapter {
        @Override
        public void mouseReleased(MouseEvent e) {
            int value = slider.getValue();
            selectedValue = value;
            JOptionPane.showMessageDialog(SimpleFormV5Ex.this, selectedValue, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void createAndShowGUI() {
        SimpleFormV5Ex window = new SimpleFormV5Ex("SimpleFormV5Ex");
        window.addComponents();
        window.addMenus();
        window.addListener();
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
