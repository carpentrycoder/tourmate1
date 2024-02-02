import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JLabel imageLabel; // Declare a class-level JLabel to hold the image

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create JFrame
            JFrame frame = new JFrame("Full Screen JFrame");
            frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            frame.getContentPane().setBackground(new Color(0xDB9205));

            JPanel panel = new JPanel();
            panel.setBounds(0, 0, 400, 800);
            panel.setBackground(new Color(65, 220, 255)); // Light blue color
            panel.setLayout(new GridLayout(2, 2, 10, 10)); // 2x2 grid layout with gaps

            // Create and add buttons
            for (int i = 1; i <= 4; i++) {
                JButton button = new JButton("Button " + i);
                button.addActionListener(new ButtonActionListener(i, frame)); // Pass frame instance
                panel.add(button);
            }

            // Initialize the imageLabel with the default image
            addImage(frame, "img/7.png", 150, 110);

            frame.add(panel);
            frame.setLayout(null);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static void addImage(JFrame frame, String imagePath, int width, int height) {
        if (imageLabel != null) {
            frame.remove(imageLabel); // Remove the existing imageLabel if it exists
        }
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource(imagePath));
        Image scaledImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
        imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(400, 40, width, height); // Adjust position if needed
        frame.add(imageLabel);
        frame.revalidate(); // Revalidate the frame to reflect the changes
        frame.repaint(); // Repaint the frame to update its appearance
    }

    // Custom ActionListener class for buttons
    static class ButtonActionListener implements ActionListener {
        private final int buttonNumber;
        private final JFrame frame;

        public ButtonActionListener(int buttonNumber, JFrame frame) {
            this.buttonNumber = buttonNumber;
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Action to perform when the button is clicked
            System.out.println("Button " + buttonNumber + " clicked!");
            // Change the image path based on the button clicked
            String imagePath = "img/" + buttonNumber + ".png";
            addImage(frame, imagePath, 150, 110);
        }
    }
}