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
import javafx.scene.web.WebView;

import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class restaurents_rtn extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    JButton view_map,swiggy,Zomato,Uber_eats,Food_Panda,Dunzo,back,hotelButton;
    JFXPanel jfxPanel;
    int i;

    JFrame rtn;

    String[] hotelImagePaths = {
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Mithila Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Masala Kitchen.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Kokani Angan.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Amantran.png"
    };

    String[] HotelImagePaths_part1 = {
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Sagoti Sea food Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Sai Malhar Bhojanalay.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Daawat Restautrant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Hotel Datta Cafe.png",
    };

    String[] Hotelpaths_part2 = {
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Darbar Family Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Mahalaxmi Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Soul Curry Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Kokani Tadka.png",
    };

    String[] Delivery_Available = {
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Darbar Family Restaurant.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Masala Kitchen.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Kokani Angan.png",
            "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\hotels\\Drive  Inn Carnival.png",
    };
    public static void main(String[] args) {
        restaurents_rtn restro1 = new restaurents_rtn();
        restro1.initializeFrame();

    }
    public void initializeFrame()
    {
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
        view_map.setBounds(20,250, 353,223);
        view_map.setBorder(BorderFactory.createEmptyBorder());
        view_map.addActionListener(this);
        contentPanel.add(view_map);

        JLabel label_a = createImageLabel("src/Dash_Icons/browse_restro.png", 845, 81, 250, 250);
        contentPanel.add(label_a);
        places_ratnagiri.loadAndSetCustomFont(label_a, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Browse Ratnagiri by Food", Font.BOLD, 38, new Color(0xF9F8FC), 280, 15, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Budget-friendly bites", Font.BOLD, 38, new Color(0x0B1E33), 450,740, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Cheap eats", Font.BOLD, 38, new Color(0x0B1E33), 450,740+170+90, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Dinner", Font.BOLD, 38, new Color(0x0B1E33), 450,740+370+90+60, 531,50);

        places_ratnagiri.loadAndSetCustomFont(contentPanel, "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Delivery Available", Font.BOLD, 38, new Color(0x0B1E33), 450,740+670+80+30, 531,50);

        JLabel label_b = createImageLabel("src/Dash_Icons/cuisines.png",386,499,12,490);
        contentPanel.add(label_b);

        JLabel label_c = createImageLabel("src/DButns/Delivery.png",418,91,0,490+20+399+100);
        contentPanel.add(label_c);

        JLabel label_d = createImageLabel("src/DButns/Delivery_box.png",394,636,0,490+20+399+100+91+20);
        contentPanel.add(label_d);

        JLabel cuisene_1 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\indian.png",290,174,400+10,340+10);
        contentPanel.add(cuisene_1);

        // Create cuisene_2
        JLabel cuisene_2 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Sean-food.png", 290, 174, 400+290 + 17+10, 340+10);
        contentPanel.add(cuisene_2);

       // Create cuisene_3
        JLabel cuisene_3 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Asian.png", 290, 174, 400 +(290+290)+ 2 * 17+10, 340+10);
        contentPanel.add(cuisene_3);

        JLabel cuisene_4 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Chinese.png", 290, 174, 400+290 + 17+10, 340+174+13+10);
        contentPanel.add(cuisene_4);

        JLabel cuisene_5 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Cafe.png", 290, 174, 400+10, 340+174 + 13+10);
        contentPanel.add(cuisene_5);

        JLabel cuisene_6 = createImageLabel("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\cuisens\\Pub.png", 290, 174, 400 +(290+290)+ 2 * 17+10, 335+174+ 17+10);
        contentPanel.add(cuisene_6);

        int initialX = 450;
        int initialY = 110 + (174 * 4);
        int buttonWidth = 198;
        int buttonHeight = 172;
        int horizontalSpacing = 20;

        // Loop through the hotel image paths array and create buttons
        for (int i = 0; i < hotelImagePaths.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(hotelImagePaths[i], initialX + (buttonWidth + horizontalSpacing) * i, initialY, buttonWidth, buttonHeight);
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
                        System.out.println("sutar1");
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar2");
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar3");
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar4");
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
        for (int i = 0; i < HotelImagePaths_part1.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(HotelImagePaths_part1[i], initialX1 + (buttonWidth1 + horizontalSpacing1) * i, initialY1, buttonWidth1, buttonHeight1);
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
                        System.out.println("sutar5");
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar6");
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar7");
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar8");
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
        for (int i = 0; i < Hotelpaths_part2.length; i++) {
            JButton hotelButton = restaurents_rtn.createImageButton(Hotelpaths_part2[i], initialX2 + (buttonWidth2 + horizontalSpacing2) * i, initialY2, buttonWidth2, buttonHeight2);
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
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar10");
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar11");
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar12");
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
                    } else if (buttonIndex == 1) {
                        System.out.println("sutar14");
                    } else if (buttonIndex == 2) {
                        System.out.println("sutar15");
                    } else if (buttonIndex == 3) {
                        System.out.println("sutar16");
                    }
                }
            });
        }

        JButton viewMapButton = createImageButton("src/Dash_Icons/view_on_map.png", 20, 250, 353, 223);
        viewMapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when the button is clicke
                System.out.println("View Map button clicked!");
            }
        });
        contentPanel.add(viewMapButton);

        Zomato = createImageButton("src/Dash_Icons/Zomato.png", -40, 30, 431, 86);
        Zomato.setBackground(new Color(0x21A9FF));
        Zomato.addActionListener(this);
        label_d.add(Zomato);

        swiggy = createImageButton("src/Dash_Icons/Swiggy.png",-40,130,431,86);
        swiggy.setBackground(new Color(0x21A9FF));
        swiggy.addActionListener(this);
        label_d.add(swiggy);

        Uber_eats = createImageButton("src/Dash_Icons/Uber_Eats.png",-40,58+(86*2),431,86);
        Uber_eats.setBackground(new Color(0x21A9FF));
        Uber_eats.addActionListener(this);
        label_d.add(Uber_eats);

        Food_Panda = createImageButton("src/Dash_Icons/Food_Panda.png",-40,74+(86*3),431,86);
        Food_Panda.setBackground(new Color(0x21A9FF));
        Food_Panda.addActionListener(this);
        label_d.add(Food_Panda);

        Dunzo = createImageButton("src/Dash_Icons/Dunzo.png",-40,89+(86*4),431,86);
        Dunzo.setBackground(new Color(0x21A9FF));
        Dunzo.addActionListener(this);
        label_d.add(Dunzo);

        ImageIcon backIcon1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backIcon1); // back
        back.setBackground(new Color(0xDB9205));
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1260, 1900, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Set the JFrame to invisible when back button is clicked
                rtn.setVisible(false);
            }
        });
        contentPanel.add(back);

        rtn.setUndecorated(true);
        rtn.setVisible(true);
    }
    public void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xFFD302);
                this.trackColor = new Color(0xFFDB9205, true);
            }
        });
    }

    public static JLabel createImageLabel(String imagePath, int width, int height, int x, int y) {
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(x, y, width, height);
        return label;
    }

    public static JButton createImageButton(String imagePath, int x, int y, int width, int height) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(0xDB9205));
        button.setBounds(x, y, width, height);
        button.setBorder(BorderFactory.createEmptyBorder());
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view_map) {
            Platform.runLater(() -> {
                JFrame frame1 = new JFrame();
                frame1.setSize(1366,771);
                frame1.setExtendedState(MAXIMIZED_BOTH);
                WebView webView = new WebView();

                // HTML content to be displayed
                String htmlContent = """
                        <!DOCTYPE html>
                        <html lang="en">
                        <head>
                            <meta charset="UTF-8">
                            <meta name="viewport" content="width=device-width, initial-scale=1.0">
                            <title>Embedded Google Map</title>
                        </head>
                        <body>
                            <iframe
                                src="https://www.google.com/maps/embed?pb=!1m12!1m8!1m3!1d61050.185489388576!2d73.26917424414033!3d16.992416720036204!3m2!1i1024!2i768!4f13.1!2m1!1srestaurants%20in%20ratnagiri%20embed%20on%20map!5e0!3m2!1sen!2sin!4v1707014888645!5m2!1sen!2sin" width="1366" height="820" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade">
                            </iframe>
                        </body>
                        </html>""";

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
            });

        } else if (e.getSource()==Zomato) {
            restaurent_func.Delivery_web("https://www.zomato.com/ratnagiri");
        } else if (e.getSource()==swiggy) {
            restaurent_func.Delivery_web("https://www.swiggy.com/city/ratnagiri");
        } else if (e.getSource()==Uber_eats){
            restaurent_func.Delivery_web("https://www.ubereats.com/");
        } else if (e.getSource()==Dunzo){
            restaurent_func.Delivery_web("https://www.dunzo.com/search");
        } else if (e.getSource()==Food_Panda) {
            restaurent_func.Delivery_web("https://www.eatsure.com/");
        }

    }
}

