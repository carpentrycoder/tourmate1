/*
 * Copyright (c) 2024. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Hotel_func extends JFrame {
    static JPanel contentPanel;
    static JTextField checkin, checkout;
    static JButton back, done;
    static JButton[] buttons;
    static JFrame rtnhotels;
    static String strday, endday;
    static int i,buttonNumber;

    Hotel_func(){
        func_hotel();
    };

    public static ActionListener func_hotel(){
        rtnhotels = new JFrame();
        rtnhotels.setTitle("ratagirihotels");
        rtnhotels.setExtendedState(MAXIMIZED_BOTH);
        rtnhotels.setSize(1366, 766);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rtnhotels.add(scrollPane);
        rtnhotels.setBackground(new Color(0x92A7BA));

        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 2790));
        contentPanel.setBackground(new Color(146, 167, 186, 255));
        scrollPane.setViewportView(contentPanel);

        checkin = new JTextField();
        checkin.setBounds(220, 310, 390, 80);
        checkin.setBorder(BorderFactory.createLineBorder(new Color(0xF1EBD0)));
        checkin.setForeground(Color.BLACK);
        checkin.setFont(new Font("Helvetica", Font.BOLD, 31));
        checkin.setBackground(new Color(0xF1EBD0));
        checkin.setHorizontalAlignment(JTextField.CENTER);
        strday = checkin.getText();
        contentPanel.add(checkin);

        checkout = new JTextField();
        checkout.setBounds(350 + 400, 310, 390, 80); // Adjusted x-coordinate
        checkout.setBorder(BorderFactory.createLineBorder(new Color(0xF1EBD0)));
        checkout.setForeground(Color.BLACK);
        checkout.setFont(new Font("Helvetica", Font.BOLD, 31));
        checkout.setBackground(new Color(0xF1EBD0));
        checkout.setHorizontalAlignment(JTextField.CENTER);
        endday = checkout.getText();
        contentPanel.add(checkout);

        ImageIcon ok = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\done_80.png");
        done = new JButton(ok);
        done.setLayout(null);
        done.setBorder(BorderFactory.createEmptyBorder());
        done.setBounds(640, 400, 80, 80);
        done.setBackground(new Color(0x3000000, true));
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Done button clicked");
            }
        });
        contentPanel.add(done);

        int buttonWidth = 166;
        int buttonHeight = 40;
        int verticalSpacing = 170;
        // Declare an array to store the buttons
        buttons = new JButton[20];
        // Calculate Y-coordinates based on the provided reference
        int startY = 630; // Adjusted starting Y-coordinate
        int[] yCoordinates = new int[10];
        String imagePath = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\deal_button.png";
        ImageIcon icon = new ImageIcon(imagePath);

        for (int i = 0; i < yCoordinates.length; i++) {
            yCoordinates[i] = startY + i * (buttonHeight + verticalSpacing);
        }
        // Calculate X-coordinates for the first row
        int xFirstRow = 490;
// Calculate X-coordinates for the second row
        int xSecondRow = xFirstRow + buttonWidth + 480; // Adjust this spacing as needed

// First loop
        // First loop
        ActionListener[] buttonListeners = new ActionListener[21];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xFirstRow, yCoordinates[i], buttonWidth, buttonHeight);
            // Add ActionListener to the button
            buttons[i].addActionListener(buttonListeners[i]);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }

// Second loop
        for (int i = 10; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xSecondRow, yCoordinates[i - 10], buttonWidth, buttonHeight);
            // Add ActionListener to the button
            buttons[i].addActionListener(buttonListeners[i]);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\rtnhotels.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 3000, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setSize(1366, 3000);
        contentPanel.add(label);

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xC8C8C8);
                this.trackColor = new Color(0xFFFFFF);
            }
        });

        ImageIcon backb = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backb); // back
        back.setBackground(new Color(0xC8C8C8));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1240, 2630, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your action code here for back button
                System.out.println("Back button clicked");
                rtnhotels.setVisible(false);
                System.exit(0);
            }
        });
        label.add(back);

        rtnhotels.setUndecorated(true);
        rtnhotels.setLocationRelativeTo(null);
        rtnhotels.setLayout(null);
        rtnhotels.setVisible(true);
    }

    public static void openURIInBrowser(String uriString) {
        try {
            URI uri = new URI(uriString);
            Desktop.getDesktop().browse(uri);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Hotel_func();
    }
}
