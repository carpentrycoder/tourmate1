import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFontExample extends JFrame {

    public CustomFontExample() {
        setTitle("Custom Font Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 200));

        try {
            // Load the font file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("C:\\Users\\Admin\\IdeaProjects\\practice program\\src\\img\\Poppins-Light.ttf"));

            // Derive desired font size and style
            Font customFontBold = customFont.deriveFont(Font.BOLD, 20f);

            // Create a JLabel
            JLabel label = new JLabel("Hello, World!");
            label.setFont(customFontBold); // Set the custom font to the JLabel

            // Add the JLabel to the frame
            getContentPane().add(label, BorderLayout.CENTER);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CustomFontExample().setVisible(true);
        });
    }
}