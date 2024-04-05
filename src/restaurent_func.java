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

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class restaurent_func extends JFrame {
    public static JFrame frame;
    public static JFXPanel jfxPanel;
    public static JButton view_map,swiggy,Zomato,Uber_eats,Food_Panda,Dunzo;

    public static JScrollPane scrollPane;


    public static void restaurenttemplate(String city ,String gmapurl,String[] restaurents_link,String[] Budget_friendly_bites, String[] Cheap_eats,String[] Dinner,String[] Delivery_Available)
    {
        frame = new JFrame();
        frame.setExtendedState(MAXIMIZED_BOTH);
        scrollPane = new JScrollPane(); // Initialize scrollPane
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scrollPane);
        // Use getContentPane() to get the contentPane of the frame
        Container contentPane = frame.getContentPane();
        contentPane.setBackground(new Color(0x592A7BA, true));
        setupScrollBar();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 2000));
        contentPanel.setBackground(new Color(219, 146, 5, 255));
        scrollPane.setViewportView(contentPanel);

        jfxPanel = new JFXPanel();

        ImageIcon imageIcon = new ImageIcon("src/icons/ratangiri_places-restaurents.png");
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

        ImageIcon backIcon = new ImageIcon("src/Dash_Icons/view_on_map.png");
        view_map = new JButton(backIcon);
        view_map.setBackground(new Color(0xDB9205));
        view_map.setBounds(20, 250, 353, 223);
        view_map.setBorder(BorderFactory.createEmptyBorder());

// Adding an internal ActionListener
        view_map.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your action to perform when the button is clicked
                Delivery_web(gmapurl);
            }
        });
        contentPanel.add(view_map);

        JLabel label_a = restaurents_rtn.createImageLabel("src/Dash_Icons/browse_restro.png", 845, 81, 250, 250);
        contentPanel.add(label_a);
        places_ratnagiri.loadAndSetCustomFont(label_a, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Browse " +city+ " by Food", Font.BOLD, 33, new Color(0xFFFFFF), 280, 13, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Budget-friendly bites", Font.BOLD, 38, new Color(0x0B1E33), 450,740, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Cheap eats", Font.BOLD, 38, new Color(0x0B1E33), 450,740+170+90, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Dinner", Font.BOLD, 38, new Color(0x0B1E33), 450,740+370+90+60, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Delivery Available", Font.BOLD, 38, new Color(0x0B1E33), 450,740+670+80+30, 531,50);

        JLabel label_b = restaurents_rtn.createImageLabel("src/Dash_Icons/cuisines.png",386,499,12,490);
        contentPanel.add(label_b);

        JLabel label_c = restaurents_rtn.createImageLabel("src/DButns/Delivery.png",418,91,0,490+20+399+100);
        contentPanel.add(label_c);

        JLabel label_d = restaurents_rtn.createImageLabel("src/DButns/Delivery_box.png",394,636,0,490+20+399+100+91+20);
        contentPanel.add(label_d);

        JLabel cuisene_1 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\indian.png",290,174,400+10,340+10);
        contentPanel.add(cuisene_1);

        // Create cuisene_2
        JLabel cuisene_2 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Sean-food.png", 290, 174, 400+290 + 17+10, 340+10);
        contentPanel.add(cuisene_2);

        // Create cuisene_3
        JLabel cuisene_3 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Asian.png", 290, 174, 400 +(290+290)+ 2 * 17+10, 340+10);
        contentPanel.add(cuisene_3);

        JLabel cuisene_4 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Chinese.png", 290, 174, 400+290 + 17+10, 340+174+13+10);
        contentPanel.add(cuisene_4);

        JLabel cuisene_5 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Cafe.png", 290, 174, 400+10, 340+174 + 13+10);
        contentPanel.add(cuisene_5);

        JLabel cuisene_6 = restaurents_rtn.createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Pub.png", 290, 174, 400 +(290+290)+ 2 * 17+10, 335+174+ 17+10);
        contentPanel.add(cuisene_6);

        int initialX = 450;
        int initialY = 110 + (174 * 4);
        int buttonWidth = 198;
        int buttonHeight = 172;
        int horizontalSpacing = 20;

        // Loop through the hotel image paths array and create buttons
        for (int i = 0; i < Budget_friendly_bites.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(Budget_friendly_bites[i], initialX + (buttonWidth + horizontalSpacing) * i, initialY, buttonWidth, buttonHeight);
            contentPanel.add(hotelButton);

            // Create a final variable to capture the current value of i
            final int buttonIndex = i;

            // Add ActionListener to the button
            hotelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Action to perform when this specific button is clicked
                    // You can write your code here for each button's action
                    if (buttonIndex == 0) {
                        Delivery_web(restaurents_link[0]);
                    } else if (buttonIndex == 1) {
                        Delivery_web(restaurents_link[1]);
                    } else if (buttonIndex == 2) {
                        Delivery_web(restaurents_link[2]);
                    } else if (buttonIndex == 3) {
                        Delivery_web(restaurents_link[3]);
                    }
                }
            });
        }

        int initialX1 = 450;
        int initialY1 = 90+172+110 + (174 * 4);
        int buttonWidth1 = 198;
        int buttonHeight1 = 172;
        int horizontalSpacing1 = 20;

        // Loop through the hotel image paths array and create buttons
        for (int i = 0; i < Cheap_eats.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(Cheap_eats[i], initialX1 + (buttonWidth1 + horizontalSpacing1) * i, initialY1, buttonWidth1, buttonHeight1);
            contentPanel.add(hotelButton);

            // Create a final variable to capture the current value of i
            final int buttonIndex = i;

            // Add ActionListener to the button
            hotelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Action to perform when this specific button is clicked
                    // You can write your code here for each button's action
                    if (buttonIndex == 0) {
                        Delivery_web(restaurents_link[5]);
                    } else if (buttonIndex == 1) {
                        Delivery_web(restaurents_link[6]);
                    } else if (buttonIndex == 2) {
                        Delivery_web(restaurents_link[7]);
                    } else if (buttonIndex == 3) {
                        Delivery_web(restaurents_link[8]);
                    }
                }
            });
        }


        int initialX2 = 450;
        int initialY2 = 150+172+310 + (174 * 4);
        int buttonWidth2 = 198;
        int buttonHeight2 = 172;
        int horizontalSpacing2 = 20;

        // Loop through the hotel image paths array and create buttons
        for (int i = 0; i < Dinner.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(Dinner[i], initialX2 + (buttonWidth2 + horizontalSpacing2) * i, initialY2, buttonWidth2, buttonHeight2);
            contentPanel.add(hotelButton);

            // Create a final variable to capture the current value of i
            final int buttonIndex = i;

            // Add ActionListener to the button
            hotelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Action to perform when this specific button is clicked
                    // You can write your code here for each button's action
                    if (buttonIndex == 0) {
                        System.out.println("sutar9");
                        Delivery_web(restaurents_link[9]);
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar10");
                        Delivery_web(restaurents_link[10]);
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar11");
                        Delivery_web(restaurents_link[11]);
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar12");
                        Delivery_web(restaurents_link[12]);
                    }
                }
            });
        }

        int initialX3 = 450;
        int initialY3 = 105+172+610 + (174 * 4);
        int buttonWidth3 = 198;
        int buttonHeight3 = 172;
        int horizontalSpacing3 = 20;

        // Loop through the hotel image paths array and create buttons
        for (int i = 0; i < Delivery_Available.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(Delivery_Available[i], initialX3 + (buttonWidth3 + horizontalSpacing3) * i, initialY3, buttonWidth3, buttonHeight3);
            contentPanel.add(hotelButton);

            // Create a final variable to capture the current value of i
            final int buttonIndex = i;

            // Add ActionListener to the button
            hotelButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Action to perform when this specific button is clicked
                    // You can write your code here for each button's action
                    if (buttonIndex == 0) {
                        System.out.println("sutar13");
                        Delivery_web(restaurents_link[13]);
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar14");
                        Delivery_web(restaurents_link[14]);
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar15");
                        Delivery_web(restaurents_link[15]);
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar16");
                        Delivery_web(restaurents_link[16]);
                    }
                }
            });
        }

        Zomato = restaurents_rtn.createImageButton("src/Dash_Icons/Zomato.png",-40,30,431,86);
        Zomato.setBackground(new Color(0x21A9FF));
        label_d.add(Zomato);
        Zomato.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your code for Zomato button action here
                // For example, opening a web link
                Delivery_web("https://www.zomato.com/india");
            }
        });

        swiggy = restaurents_rtn.createImageButton("src/Dash_Icons/Swiggy.png",-40,130,431,86);
        swiggy.setBackground(new Color(0x21A9FF));
        label_d.add(swiggy);

        Uber_eats = restaurents_rtn.createImageButton("src/Dash_Icons/Uber_Eats.png",-40,58+(86*2),431,86);
        Uber_eats.setBackground(new Color(0x21A9FF));
        label_d.add(Uber_eats);

        Food_Panda = restaurents_rtn.createImageButton("src/Dash_Icons/Food_Panda.png",-40,74+(86*3),431,86);
        Food_Panda.setBackground(new Color(0x21A9FF));
        label_d.add(Food_Panda);

        Dunzo = restaurents_rtn.createImageButton("src/Dash_Icons/Dunzo.png",-40,89+(86*4),431,86);
        Dunzo.setBackground(new Color(0x21A9FF));
        label_d.add(Dunzo);

        swiggy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Your code for Zomato button action here
                // For example, opening a web link
                Delivery_web("https://www.swiggy.com/");
            }
        });

        Uber_eats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delivery_web("https://www.ubereats.com/");
            }
        });
        Food_Panda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delivery_web("https://www.foodpanda.com/");
            }
        });
        Dunzo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delivery_web("https://www.dunzo.com/bangalore");
            }
        });

        ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        JButton back = new JButton(backIcon1); // back
        back.setBackground(new Color(0xDB9205));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1260, 1900, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the JFrame to invisible when back button is clicked
                String userInput = JOptionPane.showInputDialog(frame, "Enter Where are your Decided to Go :");
                frame.setVisible(false);
            }
        });
        contentPanel.add(back);
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public static void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xFFD302);
                this.trackColor = new Color(0xFFDB9205, true);
            }
        });
    }
    public static void Delivery_web(String url) {
        
        JFrame frame = new JFrame("Food-Delivery-Services");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 768);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);

        // Embed JavaFX WebView into Swing
        JFXPanel jfxPanel = new JFXPanel();
        frame.add(jfxPanel, BorderLayout.CENTER);

        JButton hideButton = new JButton("Back");
        hideButton.setPreferredSize(new Dimension(100, 20));
        hideButton.setBackground(new Color(0x0D8AF1));
        hideButton.setForeground(Color.white);
        hideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                frame.dispose(); // Dispose the frame to stop running the code
            }
        });
        frame.add(hideButton, BorderLayout.SOUTH);

        // Initialize JavaFX
        Platform.runLater(() -> {
            WebView webView = new WebView();
            WebEngine webEngine = webView.getEngine();

            // Load the specified website URL
            webEngine.load(url);

            // Add WebView to JFXPanel
            jfxPanel.setScene(new Scene(webView));
        });

        // Display the JFrame
        frame.setUndecorated(true);
        frame.setVisible(true);
    }

    public static void web_opener(String embedUrl) {
        JFrame frame1 = new JFrame();
        frame1.setSize(1366, 771);
        frame1.setExtendedState(Frame.MAXIMIZED_BOTH);

        WebView webView = new WebView();

        // Generate HTML content based on the embedUrl provided
        String htmlContent = generateHTMLContent(embedUrl);

        // Load HTML content into the WebView
        webView.getEngine().loadContent(htmlContent);

        // Create a JFXPanel
        JFXPanel jfxPanel = new JFXPanel();
        jfxPanel.setSize(1366, 771);

        // Set up the JFXPanel with the WebView
        jfxPanel.setScene(new Scene(webView));

        // Add the JFXPanel to the JFrame
        frame1.add(jfxPanel);
        frame1.setVisible(true);
        frame1.setLocationRelativeTo(null);
    }



    private static String generateHTMLContent(String embedUrl) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Embedded Google Map</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <iframe\n" +
                "        src=\"" + embedUrl + "\" width=\"1366\" height=\"820\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\">\n" +
                "    </iframe>\n" +
                "</body>\n" +
                "</html>";
    }


}

