import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingHTMLViewer {

    static WebView webView;
    static String htmlContent1,htmlContent2, htmlContent3 , htmlContent4,htmlContent5;


    public static void showHTMLViewer() {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing with JavaFX WebView");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JPanel as a container
            JPanel container = new JPanel();
            container.setLayout(new BorderLayout());

            // Create a JFXPanel
            JFXPanel jfxPanel = new JFXPanel();
            jfxPanel.setSize(1366, 711);
            jfxPanel.setLocation(0, 260);

            // Add the JFXPanel to the container
            container.add(jfxPanel, BorderLayout.CENTER);

            // Run JavaFX code on the JavaFX Application Thread
            Platform.runLater(() -> {
                webView = new WebView();

                // HTML content to be displayed
                String htmlContent1 = "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <title>Embedded Google Map</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <iframe\n" +
                        "        src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d61049.66451393464!2d73.28439704976543!3d16.994016645178558!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bea0d1839a6bb7f%3A0x63ab969b79bf6561!2sRatnagiri%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1706954618005!5m2!1sen!2sin\" width=\"1366\" height=\"711\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\">\n" +
                        "    </iframe>\n" +
                        "</body>\n" +
                        "</html>";

                // Load HTML content into the WebView
                webView.getEngine().loadContent(htmlContent1);
                jfxPanel.setScene(new Scene(webView));
            });

            htmlContent2 = "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Embedded Google Map</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <iframe\n" +
                    "       src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d228811.59834821537!2d72.71704620767576!3d19.083292167081087!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3be7c6306644edc1%3A0x5da4ed8f8d648c69!2sMumbai%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1706962371739!5m2!1sen!2sin\" width=\"1366\" height=\"711\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"" +
                    "    </iframe>\n" +
                    "</body>\n" +
                    "</html>";

            htmlContent3 = "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Embedded Google Map</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <iframe\n" +
                    "       src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d242117.70906702869!2d73.69815139367944!3d18.524870612673507!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bc2bf2e67461101%3A0x828d43bf9d9ee343!2sPune%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1706963193306!5m2!1sen!2sin\" width=\"1366\" height=\"711\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"" +
                    "    </iframe>\n" +
                    "</body>\n" +
                    "</html>";

            htmlContent4 = "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Embedded Google Map</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <iframe\n" +
                    "       src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7539.153338496266!2d75.57062738506603!3d19.12621865673098!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bdb2ef98ab7189d%3A0x22b2f37aefda34b!2sSambhaji%20Nagar%2C%20Maharashtra%20431143!5e0!3m2!1sen!2sin!4v1706963466861!5m2!1sen!2sin\" width=\"1366\" height=\"711\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"" +
                    "    </iframe>\n" +
                    "</body>\n" +
                    "</html>";

            htmlContent5 = "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Embedded Google Map</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <iframe\n" +
                    "       src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d119981.26817396561!2d73.72107817969032!3d19.991105340959415!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3bddd290b09914b3%3A0xcb07845d9d28215c!2sNashik%2C%20Maharashtra!5e0!3m2!1sen!2sin!4v1706963693405!5m2!1sen!2sin\" width=\"1366\" height=\"711\" style=\"border:0;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"" +
                    "    </iframe>\n" +
                    "</body>\n" +
                    "</html>";


            JPanel n = new JPanel();
            n.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0)); // Adjust the horizontal and vertical gap as needed
            n.setPreferredSize(new Dimension(1366, 60));
            n.setBackground(new Color(0x6183C0));
            n.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

            // Add the JPanel to the container
            container.add(n, BorderLayout.NORTH);

            // Create and add buttons with individual ActionListeners
            String[] buttonNames = {"Ratnagiri", "Mumbai", "Pune", "Sambhajinager", "Nashik"};

            for (int i = 0; i < buttonNames.length; i++) {
                JButton button = new JButton(buttonNames[i]);
                button.setPreferredSize(new Dimension(100, 40));
                button.setBackground(new Color(0xDCE5F5));
                button.setBorder(BorderFactory.createEmptyBorder());

                int finalI = i;
                button.addActionListener(e -> {
                    // Custom logic for each button
                    Platform.runLater(() -> {
                        switch (finalI) {
                            case 0:
                                webView.getEngine().loadContent(htmlContent1);
                                break;
                            case 1:
                                webView.getEngine().loadContent(htmlContent2);
                                break;
                            case 2:
                                webView.getEngine().loadContent(htmlContent3);
                                break;
                            case 3:
                                webView.getEngine().loadContent(htmlContent4);
                                break;
                            case 4:
                                webView.getEngine().loadContent(htmlContent5);
                                break;
                        }
                    });
                });

                n.add(button);
            }

            JButton specialButton = new JButton("back");
            specialButton.setPreferredSize(new Dimension(100, 40));
            specialButton.setBackground(new Color(0xA4090E));
            specialButton.setForeground(Color.white);
            // Add an EmptyBorder to specialButton for extra spacing
            specialButton.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 0));
            specialButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    frame.setVisible(false);

                }
            });
            n.add(specialButton);

            // Add the container to the JFrame
            frame.getContentPane().add(container);

            // Set JFrame properties
            frame.setSize(1366, 768);
            frame.setUndecorated(true);
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    public static void main(String[] args) {
        SwingHTMLViewer.showHTMLViewer();

    }
}
