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
    public JScrollPane scrollPane;
    public void initializeFrame(String imagePath, String labelText) {
        frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

        places_ratnagiri.loadAndSetCustomFont(label, "\\tourmate1\\src\\icons\\Poppins-Light.ttf", labelText, Font.BOLD, 33, new Color(0xFFFFFF), 280, 13, 531, 50);
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


}

