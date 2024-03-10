import javax.swing.*;
import java.awt.*;


public class rentalrtn extends JFrame {
    rentalrtn()
    {
        setSize(900,450);
        getContentPane().setBackground(new Color(0x17879B));
        ImageIcon Q1 = new ImageIcon(ClassLoader.getSystemResource("icons/vehicle_contact.png"));
        Image Q2 = Q1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon Q3 = new ImageIcon(Q2);
        JLabel Q4 = new JLabel(Q3);
        Q4.setBounds(0, 0, 900,400);
        add(Q4);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new rentalrtn();
    }
}
