import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class places_ratnagiri extends JFrame implements ActionListener {
    JScrollPane scrollPane;
    JButton ganpatipule_temple, beach_ganptipule;

    JFrame rtn;

    public static void main(String[] args) {
        places_ratnagiri ratnagiri = new places_ratnagiri();
        ratnagiri.initializeFrame();
    }

    public void initializeFrame() {
        rtn = new JFrame();
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
        Image image = imageIcon.getImage().getScaledInstance(1366, 231, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0, 0, 1366, 231);
        contentPanel.add(label);

//        ImageIcon ganpatipule_temple_txt =  new ImageIcon("src/Dash_Icons/Ganpatipule_Temple.png");
        ganpatipule_temple = createButton("src/Dash_Icons/Ganpatipule_Temple.png",this);
        ganpatipule_temple.setBounds(50,250, 400, 300);
        contentPanel.add(ganpatipule_temple);
        loadAndSetCustomFont(contentPanel, "E:\\tourmate1\\src\\icons\\Poppins-Light.ttf", "Ganpatipule Temple", Font.BOLD, 30, new Color(69, 37, 52), 100, 560, 378,44);



        rtn.setUndecorated(true);
        rtn.setVisible(true);
    }

    public static JButton createButton(String imagePath, ActionListener actionListener) {
        ImageIcon icon = new ImageIcon(imagePath);
        JButton button = new JButton(icon);
        button.setBackground(new Color(0xFB9B70));
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(actionListener);
        return button;
    }

    public void setupScrollBar() {
        JScrollBar verticalScrollBar1 = scrollPane.getVerticalScrollBar();
        verticalScrollBar1.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0xC4671C);
                this.trackColor = new Color(0xFB9B70);
            }
        });
    }

    public void loadAndSetCustomFont(Container container, String fontFilePath, String labelText, int fontStyle, float fontSize, Color foregroundColor, int x, int y, int width, int height) {
        try {
            // Load the font file
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontFilePath));
            Font customFontBold = customFont.deriveFont(fontStyle, fontSize);
            JLabel label = new JLabel(labelText);
            label.setForeground(foregroundColor);
            label.setFont(customFontBold); // Set the custom font to the JLabel
            label.setBounds(x, y, width, height); // Set bounds of the JLabel
            container.add(label);
        } catch (IOException | FontFormatException e) {
            System.out.println(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ganpatipule_temple) {
            rtn.setVisible(false);
        }
    }
}