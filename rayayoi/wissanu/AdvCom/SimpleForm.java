package rayayoi.wissanu.AdvCom;
import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    protected JPanel buttonsPanel, namePanel, addrPanel, mainPanel;
    protected JLabel nameLabel, addrLabel;
    protected JTextField nameTxt;
    protected JButton okButton, cancelButton;
    protected JTextArea addrTxtArea;
    protected JScrollPane addrScrollPane;
    public SimpleForm(String title) {
        super(title);
    }

    public void addComponents() {
        nameLabel = new JLabel("Name:");
        nameTxt = new JTextField("Manee", 20);
        mainPanel = (JPanel) this.getContentPane();
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");
        addrLabel = new JLabel("Address:");
        addrTxtArea = new JTextArea(4, 20);
        addrScrollPane = new JScrollPane(addrTxtArea);

        mainPanel.setLayout(new BorderLayout());

        namePanel = new JPanel();
        namePanel.add(nameLabel);
        namePanel.add(nameTxt);

        addrPanel = new JPanel();
        addrTxtArea.setLineWrap(true);
        addrTxtArea.setWrapStyleWord(true);
        addrTxtArea.setText("Khon Kaen University");
        addrTxtArea.append("Khon Kaen, Thailand");
        addrPanel.add(addrLabel);
        addrPanel.add(addrScrollPane);

        buttonsPanel = new JPanel();
        buttonsPanel.add(okButton);
        buttonsPanel.add(cancelButton);


        mainPanel.add(namePanel, BorderLayout.NORTH);
        mainPanel.add(addrPanel, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);
    }

    public void setFrameFeatures() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleForm window = new SimpleForm("642-28-5829");
        window.addComponents();
        window.setFrameFeatures();
    }
}
