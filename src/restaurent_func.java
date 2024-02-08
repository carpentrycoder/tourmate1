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
    public JFrame frame;
    JFXPanel jfxPanel;
    JButton view_map,swiggy,Zomato,Uber_eats,Food_Panda,Dunzo;

    public JScrollPane scrollPane;
    public void initializeFrame(String gmapurl)
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
                displayGoogleMap(gmapurl);
            }
        });
        contentPanel.add(view_map);

        JLabel label_a = restaurents_rtn.createImageLabel("src/Dash_Icons/browse_restro.png", 845, 81, 250, 250);
        contentPanel.add(label_a);
        places_ratnagiri.loadAndSetCustomFont(label_a, "\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Browse Ratnagiri by Food", Font.BOLD, 33, new Color(0xFFFFFF), 280, 13, 531,50);

        JLabel label_b = restaurents_rtn.createImageLabel("src/Dash_Icons/cuisines.png",386,499,12,490);
        contentPanel.add(label_b);

        JLabel label_c = restaurents_rtn.createImageLabel("src/DButns/Delivery.png",418,91,0,490+20+399+100);
        contentPanel.add(label_c);

        JLabel label_d = restaurents_rtn.createImageLabel("src/DButns/Delivery_box.png",394,636,0,490+20+399+100+91+20);
        contentPanel.add(label_d);

        JButton viewMapButton = restaurents_rtn.createImageButton("src/Dash_Icons/view_on_map.png", 20, 250, 353, 223);
        viewMapButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Action to perform when the button is clicked
                System.out.println("View Map button clicked!");
            }
        });
        contentPanel.add(viewMapButton);

        Zomato = restaurents_rtn.createImageButton("src/Dash_Icons/Zomato.png",-40,30,431,86);
        Zomato.setBackground(new Color(0x21A9FF));
        label_d.add(Zomato);

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
                frame.setVisible(false);
            }
        });
        contentPanel.add(back);

        frame.setUndecorated(true);
        frame.setVisible(true);
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

    public static void displayGoogleMap(String embedUrl) {
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

