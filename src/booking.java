import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class booking extends JFrame implements ActionListener {
    JButton j1, j2, j3, j4, j5, j6, j7, j8, S, back;

    booking() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        getContentPane().setBackground(new Color(146, 167, 186, 255));

        JPanel k1 = new JPanel();
        k1.setLayout(null);
        k1.setBackground(new Color(0x6B7A99));
        k1.setBounds(0, 0, 1600, 57);
        add(k1);

        JPanel j = new JPanel();
        j.setLayout(null);
        j.setBackground(new Color(0xFFB7D1E2, true));
        j.setBounds(0, 0, 60, 1000);
        add(j);

        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("DButns/booking.png"));
        Image a2 = a1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(5, 2, 50, 50);
        k1.add(a4);

        JLabel h = new JLabel(" Bookings");
        h.setBounds(58, 5, 200, 40);
        h.setFont(new Font("Atkinson Hyperlegible", Font.BOLD, 27));
        h.setForeground(new Color(0xF9F8FC));
        k1.add(h);

        ImageIcon s1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\profile1.png");

        S = new JButton(s1);
        S.setLayout(null);
        S.setBounds(1300, 2, 50, 50);
        S.setBackground(new Color(107, 122, 153, 255));
        S.setBorder(BorderFactory.createLineBorder(new Color(0x6B7A99)));
        S.addActionListener(this);
        k1.add(S);

        ImageIcon p1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\place.png");
        j1 = new JButton(p1); //places
        j1.setBackground(new Color(0xF9F8FC));
        j1.setLayout(null);
        j1.setBorder(BorderFactory.createEmptyBorder());
        j1.setBounds(5, 128, 49, 49);
        j1.addActionListener(this);
        j.add(j1);

        ImageIcon p2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\booking.png");
        j2 = new JButton(p2); //bookings
        j2.setBackground(new Color(0xF9F8FC));
        j2.setLayout(null);
        j2.setBorder(BorderFactory.createEmptyBorder());
        j2.setBounds(5, 201, 49, 49);
        j2.setFont(new Font("open sauce", Font.BOLD, 20));
        j2.setForeground(Color.BLACK);
        j2.addActionListener(this);
        j.add(j2);

        ImageIcon p3 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\internities.png");
        j3 = new JButton(p3); //iterneries
        j3.setBackground(new Color(0xF9F8FC));
        j3.setLayout(null);
        j3.setBorder(BorderFactory.createEmptyBorder());
        j3.setBounds(5, 274, 49, 49);
        j3.setFont(new Font("open sauce", Font.BOLD, 20));
        j3.setForeground(Color.BLACK);
        j3.addActionListener(this);
        j.add(j3);

        ImageIcon p4 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\maps.png");
        j4 = new JButton(p4); //maps
        j4.setBackground(new Color(0xF9F8FC));
        j4.setLayout(null);
        j4.setBorder(BorderFactory.createEmptyBorder());
        j4.setBounds(5, 347, 49, 49);
        j4.setFont(new Font("open sauce", Font.BOLD, 20));
        j4.setForeground(Color.BLACK);
        j4.addActionListener(this);
        j.add(j4);

        ImageIcon p5 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\restaurant.png");
        j5 = new JButton(p5); //maps
        j5.setBackground(new Color(0xF9F8FC));
        j5.setLayout(null);
        j5.setBorder(BorderFactory.createEmptyBorder());
        j5.setBounds(5, 420, 49, 49);
        j5.setFont(new Font("open sauce", Font.BOLD, 20));
        j5.setForeground(Color.BLACK);
        j5.addActionListener(this);
        j.add(j5);

        ImageIcon p6 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\place.png");
        j6 = new JButton(p6); //restaurents
        j6.setBackground(new Color(0xF9F8FC));
        j6.setLayout(null);
        j6.setBorder(BorderFactory.createEmptyBorder());
        j6.setBounds(5, 493, 49, 49);
        j6.setFont(new Font("open sauce", Font.BOLD, 20));
        j6.setForeground(Color.BLACK);
        j6.addActionListener(this);
        j.add(j6);

        ImageIcon p7 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\card.png");
        j7 = new JButton(p7); //memeberships
        j7.setBackground(new Color(0xF9F8FC));
        j7.setLayout(null);
        j7.setBorder(BorderFactory.createEmptyBorder());
        j7.setBounds(5, 566, 49, 49);
        j7.setFont(new Font("open sauce", Font.BOLD, 20));
        j7.setForeground(Color.BLACK);
        j7.addActionListener(this);
        j.add(j7);

        ImageIcon p8 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\support.png");
        j8 = new JButton(p8); // support
        j8.setBackground(new Color(0xF9F8FC));
        j8.setLayout(null);
        j8.setBorder(BorderFactory.createEmptyBorder());
        j8.setBounds(5, 639, 49, 49);
        j8.setFont(new Font("open sauce", Font.BOLD, 20));
        j8.setForeground(Color.BLACK);
        j8.addActionListener(this);
        j.add(j8);

        ImageIcon backb = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png");
        back = new JButton(backb); // back
        back.setBackground(new Color(0x92A7BA));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1280, 630, 60, 60);
        back.setFont(new Font("open sauce", Font.BOLD, 20));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == S) {
            new profile();
        } else if (e.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new booking();
    }
}

