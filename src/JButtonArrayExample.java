import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonArrayExample extends JFrame implements ActionListener {
    private JButton[] buttons;

    public JButtonArrayExample() {
        buttons = new JButton[11];

        for (int i = 0; i < buttons.length; i++) {
            // Your existing ImageIcon code
            String buttonImagePath = "\\tourmate1\\src\\DButns\\plus-32_add.png";
            ImageIcon buttonIcon = new ImageIcon(buttonImagePath);
            Image buttonImage = buttonIcon.getImage().getScaledInstance(34, 34, Image.SCALE_SMOOTH);
            buttonIcon = new ImageIcon(buttonImage);

            buttons[i] = new JButton(buttonIcon); // Create JButton with ImageIcon
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                System.out.println("Button " + (i + 1) + " clicked!");
                // Add your custom logic here
                break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JButtonArrayExample::new);
    }
}

