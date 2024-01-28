/**
// Coordinates for the first button
int x1 = 50; // X coordinate for the first button
int y1 = 250; // Y coordinate for the first button

// Coordinates for the second button
int x2 = x1 + 400 + 42; // X coordinate for the second button (start from the end of the first button plus the space)
int y2 = 250; // Y coordinate for the second button (assuming it's aligned with the first button)

// Coordinates for the third button
int x3 = x2 + 400 + 42; // X coordinate for the third button (start from the end of the second button plus the space)
int y3 = 250; // Y coordinate for the third button (assuming it's aligned with the first and second button)

// Use these coordinates to set bounds for your buttons
ganpatipule_temple.setBounds(x1, y1, 400, 300);
// Set bounds for other buttons similarly

 */

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class places_ratnagiri extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    JButton ganpatipule_temple, ganpatipule_beach,Jai_Vinayak_Temple,Ratnadurg_Fort;
    JFrame rtn;

    public static void main(String[] args) {
        places_ratnagiri ratnagiri = new places_ratnagiri();
        ratnagiri.initializeFrame();
    }

    public void initializeFrame() {
        rtn = new JFrame();
        rtn.setExtendedState(MAXIMIZED_BOTH);
        scrollPane = new JScrollPane(); // Initialize scrollPane
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rtn.add(scrollPane);
        // Use getContentPane() to get the contentPane of the frame
        Container contentPane = rtn.getContentPane();
        contentPane.setBackground(new Color(0x592A7BA, true));
        setupScrollBar();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 3200));
        contentPanel.setBackground(new Color(251, 155, 112, 255));
        scrollPane.setViewportView(contentPanel);

        ImageIcon imageIcon = new ImageIcon("src/icons/ratangiri_places-part.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

        int x1 = 50;
        int y1 = 250;

        int x2 = x1 + 400 + 42;
        int y2 = 250;

//        int y2 = y1 + 300 + 73; for vertical spcaing

        ganpatipule_temple = createButton("src/Dash_Icons/Ganpatipule_Temple.png",this);
        ganpatipule_temple.setBounds(x1,y1, 400, 300);
        contentPanel.add(ganpatipule_temple);
        loadAndSetCustomFont(contentPanel, "E:\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganpatipule Temple", Font.BOLD, 30, new Color(69, 37, 52), 80, 560, 378,44);

        ganpatipule_beach = createButton("src/Dash_Icons/Ganpule_beach.png",this);
        ganpatipule_beach.setBounds(x2,y2, 400, 300);
        contentPanel.add(ganpatipule_beach);
        loadAndSetCustomFont(contentPanel, "E:\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganpatipule Beach ", Font.BOLD, 30, new Color(69, 37, 52), 120+378+44, 560, 378,44);

        Jai_Vinayak_Temple = createButton("src/Dash_Icons/Jai_Vinayak_Temple.png",this);
        Jai_Vinayak_Temple.setBounds(x2 + 400 + 42,y2, 400, 300);
        contentPanel.add(Jai_Vinayak_Temple);
        loadAndSetCustomFont(contentPanel, "E:\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Jai Vinayak Temple", Font.BOLD, 30, new Color(69, 37, 52), 260+678+44, 560, 378,44);

        Ratnadurg_Fort = createButton("src/Dash_Icons/Ratnadurg Fort.png",this);
        Ratnadurg_Fort.setBounds(x1,y1 + 300 + 73, 400, 300);
        contentPanel.add(Ratnadurg_Fort);
        loadAndSetCustomFont(contentPanel, "E:\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ratnadurg Fort", Font.BOLD, 30, new Color(69, 37, 52), 10, 90+800+44, 378,44);


        rtn.setUndecorated(true);
        rtn.setVisible(true);
    }

    public static JButton createButton(String imagePath, ActionListener actionListener) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(0xFB9B70));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(actionListener);
        return button;
    }

    public void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xFF834B);
                this.trackColor = new Color(0xFFFB9B70, true);
            }
        });
    }

    public void loadAndSetCustomFont(Container container, String fontFilePath, String labelText, int fontStyle, float fontSize, Color foregroundColor, int x, int y, int width, int height) {
        try {
            // Load the font file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontFilePath));
            Font customFontBold = customFont.deriveFont(fontStyle, fontSize);
            JLabel label = new JLabel(labelText);
            label.setForeground(foregroundColor);
            label.setFont(customFontBold); // Set the custom font to the JLabel
            label.setBounds(x, y, width, height); // Set bounds of the JLabel
            container.add(label);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ganpatipule_temple) {
            rtn.setVisible(false);
            System.exit(0);
        }
    }
}