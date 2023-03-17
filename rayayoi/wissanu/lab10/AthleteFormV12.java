package rayayoi.wissanu.lab10;

import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;

import rayayoi.wissanu.lab6.AthleteV2;
import java.util.Comparator;

public class AthleteFormV12 extends AthleteFormV11 {

    public AthleteFormV12(String Window) {
        super(Window);
    }

    class NameComparator implements Comparator<AthleteV2> {
    
        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            int length1 = athlete1.getName().length();
            int length2 = athlete2.getName().length();
            return length1 < length2 ? -1 : length1 == length2 ? 0 : 1;
        }
    }

    class HeightComparator implements Comparator<AthleteV2> {

        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            double length1 = athlete1.getHeight();
            double length2 = athlete2.getHeight();
            return length1 < length2 ? -1 : length1 == length2 ? 0 : 1;
        } 
    }

    class HeightWeightComparator implements Comparator<AthleteV2> {

        @Override
        public int compare(AthleteV2 athlete1, AthleteV2 athlete2) {
            double height1 = athlete1.getHeight();
            double height2 = athlete2.getHeight();
            double weight1 = athlete1.getWeight();
            double weight2 = athlete2.getWeight();
            //return height1 < height2 ? -1 : height1 == height2 ? 0 : 1;
            if (height1 < height2) { 
                return -1;
            } else if (height1 == height2) {
                if (weight1 < weight2) {
                    return -1;
                } else if (weight1 == weight2) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        } 
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);
        Object src = event.getSource();
        if (src == byNameItem) {
            Collections.sort(altArrList, new NameComparator());
            displayAthlete();
        } else if (src == byHeightItem) {
            Collections.sort(altArrList, new HeightComparator());
            displayAthlete();
        } else if (src == byHeightWeightItem) {
            Collections.sort(altArrList, new HeightWeightComparator());
            displayAthlete();
        }
    }

    @Override
    public void addListeners() {
        super.addListeners();
        byNameItem.addActionListener(this);
        byHeightItem.addActionListener(this);
        byHeightWeightItem.addActionListener(this);
    }

    public static void createAndShowGUI() {
        AthleteFormV12 msw = new AthleteFormV12("Athlete Form V12");
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
