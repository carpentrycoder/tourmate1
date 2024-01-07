import javax.swing.*;
import java.awt.*;

public class rtnHOTELS extends JFrame {
    JPanel contentPanel;
    JFrame f;
    rtnHOTELS()
    {
        f = new JFrame("Hotels in Ratnagiri");
        f.setSize(1000,600);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1000,500); // Set the bounds to cover the whole frame
        f.add(scrollPane); // Add the scroll pane to the frame

        // Create a JPanel to hold your components
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1000,2000)); // Set the preferred size to enable scrollingcontentPanel.setBackground(new Color(229, 229, 234, 255));
        contentPanel.setBackground(new Color(0x1462CB));
        f.setBackground(new Color(0x1462CB));
        scrollPane.setViewportView(contentPanel);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel_frame.png"));
        Image a2 = a1.getImage().getScaledInstance(1000, 2000, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(0, 0, 1000, 2000);
        contentPanel.add(a4);



        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new rtnHOTELS();
    }
}
