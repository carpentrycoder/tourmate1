import javax.swing.*;
import java.awt.*;

public class rentalcar extends JFrame {
    private static JFrame frame;
    private static JLabel imageLabel;

    public static void rentalrtn(String image_path) {
        frame = new JFrame();
        frame.setSize(900, 450);
        frame.getContentPane().setBackground(new Color(0x17879B));
        ImageIcon Q1 = new ImageIcon(ClassLoader.getSystemResource(image_path));
        Image Q2 = Q1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon Q3 = new ImageIcon(Q2);
        imageLabel = new JLabel(Q3);
        imageLabel.setBounds(0, 0, 900, 400);
        frame.add(imageLabel);

        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        rentalcar.rentalrtn("icons/vehicle_contact.png");
    }
}
