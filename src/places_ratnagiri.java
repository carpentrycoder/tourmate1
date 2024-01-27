import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

public class places_ratnagiri extends JFrame {
    static JScrollPane scrollPane;

    public static void main(String[] args) {
        JFrame rtn = new JFrame();
        rtn.setExtendedState(MAXIMIZED_BOTH);
        scrollPane = new JScrollPane(); // Initialize scrollPane
        scrollPane.setBounds(0, 0, 1366, 766);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rtn.add(scrollPane);
        // Use getContentPane() to get the contentPane of the frame
        Container contentPane = rtn.getContentPane();
        contentPane.setBackground(new Color(0x592A7BA, true));
        setupScrollBar();
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 3200));
        contentPanel.setBackground(new Color(251, 155, 112, 255));
        scrollPane.setViewportView(contentPanel);

        ImageIcon imageIcon = new ImageIcon("src/icons/ratangiri_places-part.png");
        Image image = imageIcon.getImage().getScaledInstance(1366,231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,1366,231);
        contentPanel.add(label);

        rtn.setVisible(true);
    }
    public static void setupScrollBar() {

        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xC4671C);
                this.trackColor = new Color(0xFB9B70);
            }
        });
    }
}
