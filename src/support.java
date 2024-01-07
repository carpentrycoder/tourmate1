import javax.swing.*;
import java.awt.*;

public class support extends JFrame {
    support()
    {
        JFrame f = new JFrame("full support");
        f.setSize(800,730);
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/Support.png"));
        Image a2 = a1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(0, 0, 800, 700);
        f.add(a4);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new support();
    }
}
