/*
 * To resolve the "package javafx.application does not exist" error, you need to make sure that you have JavaFX correctly set up in your IntelliJ IDEA project. Here are the steps to configure JavaFX in IntelliJ IDEA:
 *
 * 1. Download JavaFX SDK:
 *    - Download the JavaFX SDK from the official website: [JavaFX Downloads](https://gluonhq.com/products/javafx/).
 *    - Extract the downloaded archive to a location on your computer.
 *
 * 2. Configure Project in IntelliJ IDEA:
 *    - Open IntelliJ IDEA and open your project.
 *    - Go to "File" > "Project Structure."
 *    - In the Project Structure dialog, select "Modules" on the left sidebar.
 *    - Click on your module (it should be named after your project).
 *    - Switch to the "Dependencies" tab.
 *    - Click on the "+" icon and select "JARs or directories."
 *    - Navigate to the "lib" folder inside the extracted JavaFX SDK directory and add the `javafx-sdk/lib` directory.
 *
 * 3. Configure Run Configuration:
 *    - Go to "Run" > "Edit Configurations."
 *    - Under "Main Class," specify the class that contains your `main` method (e.g., `GoogleMapExample`).
 *    - Under the "VM options" field, add the following to include the JavaFX modules:
 *      ```
 *      --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml
 *      ```
 *      Replace "/path/to/javafx-sdk" with the actual path to your JavaFX SDK.
 *
 * 4. Apply and Run:
 *    - Click "Apply" and then "OK" to close the Project Structure and Run Configuration dialogs.
 *    - Try running your application again.
 *
 * Make sure to replace "/path/to/javafx-sdk" with the actual path to the JavaFX SDK on your system.
 *
 * After these steps, IntelliJ IDEA should recognize JavaFX and resolve the "package javafx.application does not exist" error. If you encounter any issues or if you have a modular project, additional configuration might be needed.
 */

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.swing.*;
import java.awt.*;

public class GoogleMapExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Google Map Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a JFXPanel
            JFXPanel jfxPanel = new JFXPanel();

            // Add the JFXPanel to the JFrame
            frame.getContentPane().add(jfxPanel, BorderLayout.CENTER);

            // Set JFrame properties
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            // Run JavaFX code on the JavaFX Application Thread
            Platform.runLater(() -> {
                WebView webView = new WebView();
                WebEngine webEngine = webView.getEngine();

                // Load Google Maps HTML code
                String htmlContent = "<html><body><iframe width=\"100%\" height=\"100%\" frameborder=\"0\" style=\"border:0\"" +
                        " src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.6861490630227!2d-122.08560828463745!" +
                        "3d37.42247677967242!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x808580d633ba8765%3A0xb4be2d2bb07d9063!" +
                        "2sGoogleplex!5e0!3m2!1sen!2sus!4v1597261101273!5m2!1sen!2sus\"></iframe></body></html>";

                webEngine.loadContent(htmlContent);

                // Set up the JFXPanel with the WebView
                jfxPanel.setScene(new Scene(webView));
            });
        });
    }
}