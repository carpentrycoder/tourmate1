import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
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
}

