/*
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
import java.io.File;
import java.io.IOException;

public class places_ratnagiri extends JFrame implements ActionListener {
    static JScrollPane scrollPane;
    JButton ganpatipule_temple, ganpatipule_beach,Jai_Vinayak_Temple,Ratnadurg_Fort,Jaigad_Lighthouse,Bhatye_Beach,Aare_ware_Beach,Ganesh_Ghule_Beach,Pawas,Kanakaditya_temple,thirdButton,secondButton, back;
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
        contentPanel.setPreferredSize(new Dimension(1366, 2000));
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
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganpatipule Temple", Font.BOLD, 30, new Color(69, 37, 52), 80, 560, 378,44);

        ganpatipule_beach = createButton("src/Dash_Icons/Ganpule_beach.png",this);
        ganpatipule_beach.setBounds(x2,y2, 400, 300);
        contentPanel.add(ganpatipule_beach);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganpatipule Beach ", Font.BOLD, 30, new Color(69, 37, 52), 120+378+44, 560, 378,44);

        Jai_Vinayak_Temple = createButton("src/Dash_Icons/Jai_Vinayak_Temple.png",this);
        Jai_Vinayak_Temple.setBounds(x2 + 400 + 42,y2, 400, 300);
        contentPanel.add(Jai_Vinayak_Temple);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Jai Vinayak Temple", Font.BOLD, 30, new Color(69, 37, 52), 260+678+44, 560, 378,44);

        Ratnadurg_Fort = createButton("src/Dash_Icons/Ratnadurg Fort.png",this);
        Ratnadurg_Fort.setBounds(x1,y1 + 300 + 73, 400, 300);
        contentPanel.add(Ratnadurg_Fort);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ratnadurg Fort", Font.BOLD, 30, new Color(69, 37, 52), 120, 90+800+44, 378,44);

        Jaigad_Lighthouse = createButton("src/Dash_Icons/Jaigad_Lighthouse.png",this);
        Jaigad_Lighthouse.setBounds(x1 + 400 + 42,y1 + 300 + 73, 400, 300);
        contentPanel.add(Jaigad_Lighthouse);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Jaigad Lighthouse", Font.BOLD, 30, new Color(69, 37, 52), 120+378+44, 90+800+44, 378,44);

        Bhatye_Beach = createButton("src/Dash_Icons/Bhatye_Beach.png",this);
        Bhatye_Beach.setBounds(x2 + 400 + 42,y1 + 300 + 73, 400, 300);
        contentPanel.add(Bhatye_Beach);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Bhatye Beach", Font.BOLD, 30, new Color(69, 37, 52), 260+678+80, 90+800+44, 378,44);

        Aare_ware_Beach = createButton("src/Dash_Icons/Aare_ware_Beach.png",this);
        Aare_ware_Beach.setBounds(x1,y1 + 600 + 150, 400, 300);
        contentPanel.add(Aare_ware_Beach);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Aare ware Beach", Font.BOLD, 30, new Color(69, 37, 52), 90, 70+1200+44, 378,44);

        Ganesh_Ghule_Beach = createButton("src/Dash_Icons/Ganesh_Ghule_Beach.png",this);
        Ganesh_Ghule_Beach.setBounds(x1 + 400 + 42,y1 + 600 + 150, 400, 300);
        contentPanel.add(Ganesh_Ghule_Beach);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganesh Ghule Beach", Font.BOLD, 30, new Color(69, 37, 52), 120+378+38, 70+1200+44, 378,44);

        Pawas = createButton("src/Dash_Icons/Ganesh_Ghule_Beach.png",this);
        Pawas.setBounds(x2 + 400 + 42,y1 + 600 + 150, 400, 300);
        contentPanel.add(Pawas);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Pawas", Font.BOLD, 30, new Color(69, 37, 52), 260+678+120, 70+1200+44, 378,44);

        Kanakaditya_temple = createButton("src/Dash_Icons/Kanakaditya_temple.png",this);
        Kanakaditya_temple.setBounds(x1,y1 + 900 + 150 +73, 400, 300);
        contentPanel.add(Kanakaditya_temple);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Kanakaditya Temple", Font.BOLD, 30, new Color(69, 37, 52),80, 70+1600+14, 378,44);

        secondButton = createButton("src/Dash_Icons/Tilak ali_Museum.png", this);
        secondButton.setBounds(x1 + 400 + 40, y1 + 900 + 150 + 73, 400, 300);
        contentPanel.add(secondButton);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Tilak Ali Museum", Font.BOLD, 30, new Color(69, 37, 52), 80 + 400 + 60, 70 + 1600 + 14, 378, 44);

        thirdButton = createButton("src/Dash_Icons/Thiba_Palace.png", this);
        thirdButton.setBounds(x1 + (400 + 40) * 2, y1 + 900 + 150 + 73, 400, 300);
        contentPanel.add(thirdButton);
        loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Thiba Palace", Font.BOLD, 30, new Color(69, 37, 52), 80 + (400 + 60) * 2, 70 + 1600 + 14, 378, 44);

        int backButtonX = thirdButton.getX() + thirdButton.getWidth() - 80 ;
        int backButtonY = thirdButton.getY() + thirdButton.getHeight() + 100; // Assuming a vertical space of 20 pixels between the buttons

        ImageIcon backIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backIcon);
        back.setBackground(new Color(0xFB9B70));
        back.setBounds(backButtonX, backButtonY, 60, 60);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(this);
        contentPanel.add(back);

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

    public static JButton createButton1(String imagePath) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(0xFB9B70));
        button.setBorder(BorderFactory.createEmptyBorder());
        return button;
    }

    public static void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xFF834B);
                this.trackColor = new Color(0xFFFB9B70, true);
            }
        });
    }

    public static void loadAndSetCustomFont(Container container, String fontFilePath, String labelText, int fontStyle, float fontSize, Color foregroundColor, int x, int y, int width, int height) {
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
            Hotel.openURIInBrowser("https://www.tripadvisor.in/Attraction_Review-g1156427-d3410764-Reviews-Ganpatipule_Temple-Ganpatipule_Ratnagiri_District_Maharashtra.html");
        } else if (e.getSource() == ganpatipule_beach) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Jai_Vinayak_Temple) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Ratnadurg_Fort) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Jaigad_Lighthouse) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Bhatye_Beach) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Aare_ware_Beach) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Ganesh_Ghule_Beach) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Pawas) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == Kanakaditya_temple) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == secondButton) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource() == thirdButton) {
            Hotel.openURIInBrowser("");
        } else if (e.getSource()==back) {
            rtn.setVisible(false);

        }
    }
}