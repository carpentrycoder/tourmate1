import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyGUI extends JFrame {
    private JButton button1;
    private JButton button2;

    public MyGUI() {
        setTitle("Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");

        // Add ActionListeners to buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new places_ratnagiri();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                restaurents_rtn restro2 = new restaurents_rtn();
                restro2.initializeFrame();
            }
        });

        // Set layout
        setLayout(new FlowLayout());

        // Add buttons to the frame
        add(button1);
        add(button2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyGUI gui = new MyGUI();
                gui.setVisible(true);
            }
        });
    }
}
