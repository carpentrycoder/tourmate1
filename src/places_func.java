import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
public class places_func extends JFrame {
    static JScrollPane scrollPane;
    static JButton ganpatipule_temple, ganpatipule_beach,Jai_Vinayak_Temple,Ratnadurg_Fort,Jaigad_Lighthouse,Bhatye_Beach,Aare_ware_Beach,Ganesh_Ghule_Beach,Pawas,Kanakaditya_temple,thirdButton,secondButton, back;
    static JFrame rtn;

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

    public static void initializeFrame(String header, String[] place_path, String[] place_web,String[] placelbl){
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

        ImageIcon imageIcon = new ImageIcon(header);
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

        // Assuming places_ratnagiri class has a method named createButton
// If not, replace places_ratnagiri.createButton with the appropriate class and method name

        int x1 = 50;
        int y1 = 250;

        int x2 = x1 + 400 + 42;
        int y2 = 250;

        ganpatipule_temple = places_ratnagiri.createButton1(place_path[0]);
        ganpatipule_temple.setBounds(x1,y1, 400, 300);
        ganpatipule_temple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[0]);

            }
        });
        contentPanel.add(ganpatipule_temple);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[0], Font.BOLD, 30, new Color(69, 37, 52), 80, 560, 378,44);

        ganpatipule_beach = places_ratnagiri.createButton1(place_path[1]);
        ganpatipule_beach.setBounds(x2,y2, 400, 300);
        ganpatipule_beach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[2]);

            }
        });
        contentPanel.add(ganpatipule_beach);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[1], Font.BOLD, 30, new Color(69, 37, 52), 120+378+44, 560, 378,44);

        Jai_Vinayak_Temple = places_ratnagiri.createButton1(place_path[2]);
        Jai_Vinayak_Temple.setBounds(x2 + 400 + 42,y2, 400, 300);
        Jai_Vinayak_Temple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[3]);

            }
        });
        contentPanel.add(Jai_Vinayak_Temple);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[2], Font.BOLD, 30, new Color(69, 37, 52), 260+678+44, 560, 378,44);

        Ratnadurg_Fort = places_ratnagiri.createButton1(place_path[3]);
        Ratnadurg_Fort.setBounds(x1,y1 + 300 + 73, 400, 300);
        Ratnadurg_Fort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[4]);

            }
        });
        contentPanel.add(Ratnadurg_Fort);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[3], Font.BOLD, 30, new Color(69, 37, 52), 120, 90+800+44, 378,44);

        Jaigad_Lighthouse = places_ratnagiri.createButton1(place_path[4]);
        Jaigad_Lighthouse.setBounds(x1 + 400 + 42,y1 + 300 + 73, 400, 300);
        Jaigad_Lighthouse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[5]);

            }
        });
        contentPanel.add(Jaigad_Lighthouse);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[4], Font.BOLD, 30, new Color(69, 37, 52), 120+378+44, 90+800+44, 378,44);

        Bhatye_Beach = places_ratnagiri.createButton1(place_path[5]);
        Bhatye_Beach.setBounds(x2 + 400 + 42,y1 + 300 + 73, 400, 300);
        Bhatye_Beach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[6]);

            }
        });
        contentPanel.add(Bhatye_Beach);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[5], Font.BOLD, 30, new Color(69, 37, 52), 260+678+80, 90+800+44, 378,44);

        Aare_ware_Beach = places_ratnagiri.createButton1(place_path[6]);
        Aare_ware_Beach.setBounds(x1,y1 + 600 + 150, 400, 300);
        Aare_ware_Beach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[7]);

            }
        });
        contentPanel.add(Aare_ware_Beach);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[6], Font.BOLD, 30, new Color(69, 37, 52), 90, 70+1200+44, 378,44);

        Ganesh_Ghule_Beach = places_ratnagiri.createButton1(place_path[7]);
        Ganesh_Ghule_Beach.setBounds(x1 + 400 + 42,y1 + 600 + 150, 400, 300);
        Ganesh_Ghule_Beach.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[8]);

            }
        });
        contentPanel.add(Ganesh_Ghule_Beach);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[7], Font.BOLD, 30, new Color(69, 37, 52), 120+378+38, 70+1200+44, 378,44);

        Pawas = places_ratnagiri.createButton1(place_path[8]);
        Pawas.setBounds(x2 + 400 + 42,y1 + 600 + 150, 400, 300);
        Pawas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[9]);

            }
        });
        contentPanel.add(Pawas);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[8], Font.BOLD, 30, new Color(69, 37, 52), 260+678+120, 70+1200+44, 378,44);

        Kanakaditya_temple = places_ratnagiri.createButton1(place_path[9]);
        Kanakaditya_temple.setBounds(x1,y1 + 900 + 150 +73, 400, 300);
        Kanakaditya_temple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[10]);

            }
        });
        contentPanel.add(Kanakaditya_temple);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[9], Font.BOLD, 30, new Color(69, 37, 52),80, 70+1600+14, 378,44);

        secondButton = places_ratnagiri.createButton1(place_path[10]);
        secondButton.setBounds(x1 + 400 + 40, y1 + 900 + 150 + 73, 400, 300);
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[11]);

            }
        });
        contentPanel.add(secondButton);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[10], Font.BOLD, 30, new Color(69, 37, 52), 80 + 400 + 60, 70 + 1600 + 14, 378, 44);

        thirdButton = places_ratnagiri.createButton1(place_path[11]);
        thirdButton.setBounds(x1 + (400 + 40) * 2, y1 + 900 + 150 + 73, 400, 300);
        thirdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Hotel.openURIInBrowser(place_web[0]);

            }
        });
        contentPanel.add(thirdButton);
        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", placelbl[11], Font.BOLD, 30, new Color(69, 37, 52), 80 + (400 + 60) * 2, 70 + 1600 + 14, 378, 44);

        int backButtonX = thirdButton.getX() + thirdButton.getWidth() - 80 ;
        int backButtonY = thirdButton.getY() + thirdButton.getHeight() + 100; // Assuming a vertical space of 20 pixels between the buttons

        ImageIcon backIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backIcon);
        back.setBackground(new Color(0xFB9B70));
        back.setBounds(backButtonX, backButtonY, 60, 60);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rtn.setVisible(false);
            }
        });
        contentPanel.add(back);

        rtn.setUndecorated(true);
        rtn.setVisible(true);



    }

}
