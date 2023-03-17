package rayayoi.wissanu.lab9;
 /**
 * This program call AhleteFormV10 that extends from AthleteFormV9
 * 1. When the user selects sports that are not contiguous in the list 
 * program displays these sport selections in the JOptionPane message dialog.
 *  
 * 2. When the user moves the slider knob and stop the moving at some integer, 
 * then the program displays the message dialog with the message 
 * “# of experience years is <the slider value>”
 * 
 * Authur: Wissanu Rayayoi
 * ID : 653040460-3
 * Sec.1
 * Date : March 10, 2023
 * 
 */
import javax.swing.*;
import javax.swing.event.*;

public class AthleteFormV10 extends AthleteFormV9 implements ListSelectionListener,ChangeListener {

    ListModel<String> sportModel;

    String allSportTxt;
    public AthleteFormV10(String Window) {
        super(Window);
    }
    
    @Override
    public void addListeners() {
        super.addListeners();
        //Add list selesction listener to sport list
        sportList.addListSelectionListener(this);
        //Add change listener to experience slider
        experienceSlider.addChangeListener(this);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
            //Create list for accept string from getSource()
            JList<String> list = (JList<String>) event.getSource();
            //Count the list of user selected
            int[] selectedSport = list.getSelectedIndices();
            int countValue = selectedSport.length;
            //When count value equal 1 or not
            if (countValue == 1) {
                JOptionPane.showMessageDialog(null, "Selected sport are " + list.getSelectedValue());
            } else if (countValue > 1 ) {
                String[] selectedSports = list.getSelectedValuesList().toArray(new String[0]);
                String message = String.join(" ", selectedSports);
                JOptionPane.showMessageDialog(null, "Selected sport are " + message);  
            }
        }
       
    }
    @Override
    public void stateChanged(ChangeEvent event) {
        //Meassage dialog when move slider 
        JSlider slider = (JSlider) event.getSource();
        if (!slider.getValueIsAdjusting()) {
            int value = slider.getValue();
            JOptionPane.showMessageDialog(null, "# of experience years is " + value);
        }
    }
    @Override
    protected void addComponents() {
        super.addComponents();
        //Set selected mode to multiple
        sportList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }
    public static void createAndShowGUI() {
        AthleteFormV10 msw = new AthleteFormV10("Athlete Form V10");
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
