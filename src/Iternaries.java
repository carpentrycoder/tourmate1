import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Iternaries extends JFrame implements ActionListener,KeyListener{
    JButton j1, j2, j3, j4, j5, j6, j7,j8,S,back,close,open,showItineraryButton;
    JPanel j, itineraryPanel;
    JTextField fromTextField, toTextField;
    Iternaries()

    {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        getContentPane().setBackground(new Color(146, 167, 186, 255));

        JPanel k1 = new JPanel();
        k1.setLayout(null);
        k1.setBackground(new Color(0x6B7A99));
        k1.setBounds(0, 0, 1600, 57);
        add(k1);

        j = new JPanel();
        j.setLayout(null);
        j.setBackground(new Color(0xFFB7D1E2, true));
        j.setBounds(0, 0, 203, 1000);
        j.setVisible(false);
        add(j);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/internities.png"));
        Image a2 = a1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5,2, 50, 50);
        k1.add(a4);

        JLabel h = new JLabel(" Iternaries");
        h.setBounds(58,5, 200, 40);
        h.setFont(new Font("Atkinson Hyperlegible", Font.BOLD, 27));
        h.setForeground(new Color(0xF9F8FC));
        k1.add(h);

        ImageIcon c1 = new ImageIcon("\\tourmate1\\src\\DButns\\open-pane.png");
        close = new JButton(c1);
        close.setBounds(1300, 3,50,50);
        close.addActionListener(this);
        close.addKeyListener(this);
        k1.add(close);

        ImageIcon c2 = new ImageIcon("\\tourmate1\\src\\DButns\\close-pane.png");
        open = new JButton(c2);
        open.setBounds(1240, 3,50,50);
        open.addActionListener(this);
        open.addKeyListener(this);
        k1.add(open);

        //buttons from here
        ImageIcon p1 = new ImageIcon("\\tourmate1\\src\\DButns\\1.png");
        j1 = new JButton(p1); //places
        j1.setBackground(new Color(0xB7D1E2));
        j1.setLayout(null);
        j1.setBorder(BorderFactory.createEmptyBorder());
        j1.setBounds(18, 128, 167, 50);
        j1.addActionListener(this);
        j.add(j1);

        ImageIcon p2 = new ImageIcon("\\tourmate1\\src\\DButns\\2.png");
        j2 = new JButton(p2); //bookings
        j2.setBackground(new Color(0xB7D1E2));
        j2.setLayout(null);
        j2.setBorder(BorderFactory.createEmptyBorder());
        j2.setBounds(18, 201, 168, 50);
        j2.setFont(new Font("open sauce", Font.BOLD, 20));
        j2.setForeground(Color.BLACK);
        j2.addActionListener(this);
        j.add(j2);

        ImageIcon p3 = new ImageIcon("\\tourmate1\\src\\DButns\\3.png");
        j3 = new JButton(p3); //iterneries
        j3.setBackground(new Color(0xB7D1E2));
        j3.setLayout(null);
        j3.setBorder(BorderFactory.createEmptyBorder());
        j3.setBounds(18, 274, 168, 50);
        j3.setFont(new Font("open sauce", Font.BOLD, 20));
        j3.setForeground(Color.BLACK);
        j3.addActionListener(this);
        j.add(j3);

        ImageIcon p4 = new ImageIcon("\\tourmate1\\src\\DButns\\4.png");
        j4 = new JButton(p4); //maps
        j4.setBackground(new Color(0xB7D1E2));
        j4.setLayout(null);
        j4.setBorder(BorderFactory.createEmptyBorder());
        j4.setBounds(18, 347, 168, 45);
        j4.setFont(new Font("open sauce", Font.BOLD, 20));
        j4.setForeground(Color.BLACK);
        j4.addActionListener(this);
        j.add(j4);

        ImageIcon p5 = new ImageIcon("\\tourmate1\\src\\DButns\\5.png");
        j5 = new JButton(p5); //restaurents
        j5.setBackground(new Color(0xB7D1E2));
        j5.setLayout(null);
        j5.setBorder(BorderFactory.createEmptyBorder());
        j5.setBounds(18, 420, 168, 45);
        j5.setFont(new Font("open sauce", Font.BOLD, 20));
        j5.setForeground(Color.BLACK);
        j5.addActionListener(this);
        j.add(j5);

        ImageIcon p6 = new ImageIcon("\\tourmate1\\src\\DButns\\6.png");
        j6 = new JButton(p6); //hotels
        j6.setBackground(new Color(0xB7D1E2));
        j6.setLayout(null);
        j6.setBorder(BorderFactory.createEmptyBorder());
        j6.setBounds(18, 493, 168, 45);
        j6.setFont(new Font("open sauce", Font.BOLD, 20));
        j6.setForeground(Color.BLACK);
        j6.addActionListener(this);
        j.add(j6);

        ImageIcon p7 = new ImageIcon("\\tourmate1\\src\\DButns\\7.png");
        j7 = new JButton(p7); //memeberships
        j7.setBackground(new Color(0xB7D1E2));
        j7.setLayout(null);
        j7.setBorder(BorderFactory.createEmptyBorder());
        j7.setBounds(18, 566, 168, 45);
        j7.setFont(new Font("open sauce", Font.BOLD, 20));
        j7.setForeground(Color.BLACK);
        j7.addActionListener(this);
        j.add(j7);

        ImageIcon p8 = new ImageIcon("\\tourmate1\\src\\DButns\\8.png");
        j8 = new JButton(p8); // support
        j8.setBackground(new Color(0xB7D1E2));
        j8.setLayout(null);
        j8.setBorder(BorderFactory.createEmptyBorder());
        j8.setBounds(18, 639, 168, 45);
        j8.setFont(new Font("open sauce", Font.BOLD, 20));
        j8.setForeground(Color.BLACK);
        j8.addActionListener(this);
        j.add(j8);

        ImageIcon backb = new ImageIcon("\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backb); // back
        back.setBackground(new Color(0x92A7BA));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1280, 630, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        // Additional code for the itinerary panel
        itineraryPanel = new JPanel();
        itineraryPanel.setLayout(null);
        itineraryPanel.setBackground(new Color(50, 76, 103,255));
        itineraryPanel.setBounds(0, 40, 500, 300);

        // Adding JTextFields for 'From' and 'To' locations
        fromTextField = new JTextField();
        fromTextField.setBounds(50, 50, 200, 30);
        itineraryPanel.add(fromTextField);

        toTextField = new JTextField();
        toTextField.setBounds(300, 50, 200, 30);
        itineraryPanel.add(toTextField);

        // Adding a JButton to trigger itinerary functionality
        showItineraryButton = new JButton("Show Itinerary");
        showItineraryButton.setBounds(100, 100, 150, 30);
        showItineraryButton.addActionListener(this);
        itineraryPanel.add(showItineraryButton);
        add(itineraryPanel);


        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==S)
        {
            new profile();
        }
        else if (e.getSource()==back) {
            setVisible(false);

        }
        else if (e.getSource()==close){
            j.setVisible(false);

        } else if (e.getSource()==open) {
            j.setVisible(true);
        }  else if (e.getSource()==showItineraryButton) {
            // Retrieve values from JTextFields and perform the desired functionality
            String from = fromTextField.getText();
            String to = toTextField.getText();

            // You can implement the logic for displaying the itinerary based on 'from' and 'to' locations here
            JOptionPane.showMessageDialog(this, "Itinerary: From " + from + " to " + to);
        }
    }

    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }


    public void keyPressed(KeyEvent e) {
        // Handle left and right key events
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            j.setVisible(false);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            j.setVisible(true);
        }
    }


    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }

    public static void main(String[] args) {
        new Iternaries();
    }
}

