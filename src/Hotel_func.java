/**
* MIT License
        *
        * Copyright (c) 2024 Sutar
        *
        * Permission is hereby granted, free of charge, to any person obtaining a copy
        * of this software and associated documentation files (the "Software"), to deal
        * in the Software without restriction, including without limitation the rights
        * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
        * copies of the Software, and to permit persons to whom the Software is
        * furnished to do so, subject to the following conditions:
        *
        * The above copyright notice and this permission notice shall be included in all
        * copies or substantial portions of the Software.
        *
        * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
        * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
        * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
        * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
        * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
        * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
        * SOFTWARE.
        */



import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;

public class Hotel_func extends JFrame {
    static JPanel contentPanel;
    static JTextField checkin, checkout;
    static JButton back, done;
    static JButton[] buttons;
    static JFrame rtnhotels;
    static String strday, endday;

    public static void func_hotel(String Background_image ,String[] urls,String title)
    {
        rtnhotels = new JFrame();
        rtnhotels.setTitle(title);
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
                validateAndDisplayDates(checkin,checkout);
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

        ActionListener buttonClickListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String buttonText = source.getText();
                openButtonLink(buttonText,urls);
            }
        };

// First loop
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xFirstRow, yCoordinates[i], buttonWidth, buttonHeight);
            buttons[i].addActionListener(buttonClickListener);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }
        for (int i = 10; i < buttons.length; i++) {
            buttons[i] = new JButton("Button " + (i + 1), icon);
            buttons[i].setBounds(xSecondRow, yCoordinates[i - 10], buttonWidth, buttonHeight);
            buttons[i].addActionListener(buttonClickListener);
            buttons[i].setBorder(BorderFactory.createEmptyBorder());
            buttons[i].setBackground(new Color(0xF9F8FC));
            contentPanel.add(buttons[i]);
        }

        ImageIcon imageIcon = new ImageIcon(Background_image);
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
    public static void openButtonLink(String buttonText, String[] links) {
        switch (buttonText) {
            case "Button 1":
                openURIInBrowser(links[0]);
                break;
            case "Button 2":
                openURIInBrowser(links[1]);
                break;
            case "Button 3":
                openURIInBrowser(links[2]);
                break;
            case "Button 4":
                openURIInBrowser(links[3]);
                break;
            case "Button 5":
                openURIInBrowser(links[4]);
                break;
            case "Button 6":
                openURIInBrowser(links[5]);
                break;
            case "Button 7":
                openURIInBrowser(links[6]);
                break;
            case "Button 8":
                openURIInBrowser(links[7]);
                break;
            case "Button 9":
                openURIInBrowser(links[8]);
                break;
            case "Button 10":
                openURIInBrowser(links[9]);
                break;
            case "Button 11":
                openURIInBrowser(links[10]);
                break;
            case "Button 12":
                openURIInBrowser(links[11]);
                break;
            case "Button 13":
                openURIInBrowser(links[12]);
                break;
            case "Button 14":
                openURIInBrowser(links[13]);
                break;
            case "Button 15":
                openURIInBrowser(links[14]);
                break;
            case "Button 16":
                openURIInBrowser(links[15]);
                break;
            case "Button 17":
                openURIInBrowser(links[16]);
                break;
            case "Button 18":
                openURIInBrowser(links[17]);
                break;
            case "Button 19":
                openURIInBrowser(links[18]);
                break;
            case "Button 20":
                openURIInBrowser(links[19]);
                break;
            default:
                // Handle default case or throw an exception if needed
                throw new IllegalArgumentException("Invalid button text: " + buttonText);
        }
    }

    public static void validateAndDisplayDates(JTextField checkin, JTextField checkout)
    {
        LocalDate currentDate = LocalDate.now();
        int day1 = currentDate.getDayOfMonth();
        int month1 = currentDate.getMonthValue();
        int year1 = currentDate.getYear();

        String strCheckin = checkin.getText();
        String[] arr_in = strCheckin.split("-");
        int d_in = Integer.parseInt(arr_in[0]);
        int m_in = Integer.parseInt(arr_in[1]);
        int y_in = Integer.parseInt(arr_in[2]);

        String strCheckout = checkout.getText();
        String[] arr_out = strCheckout.split("-");
        int d_out = Integer.parseInt(arr_out[0]);
        int m_out = Integer.parseInt(arr_out[1]);
        int y_out = Integer.parseInt(arr_out[2]);

        if ((isValidDate(d_in, m_in, y_in) && isValidDate(d_out, m_out, y_out))
                && ((y_in > year1) || (y_in == year1 && m_in > month1) || (y_in == year1 && m_in == month1 && d_in >= day1))
                && ((y_out > year1) || (y_out == year1 && m_out > month1) || (y_out == year1 && m_out == month1 && d_out >= day1)))
        {
            JOptionPane.showMessageDialog(null, "Dates are valid  \uD83D\uDCC5");
            strday = checkin.getText();
            endday = checkout.getText();
        } else
        {
            JOptionPane.showInternalMessageDialog(null, "Dates are Invalid  \uD83D\uDCC5", "Error", JOptionPane.ERROR_MESSAGE);
            checkin.setText("");
            checkout.setText("");
        }
    }
    public static boolean isValidDate(int day, int month, int year)
    {
        // Check if the month is valid (between 1 and 12)
        if (month < 1 || month > 12) {
            return false;
        }
        return true;
    }



}
