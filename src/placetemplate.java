
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class placetemplate extends JFrame implements ActionListener {
    static JButton back, map, wt, itr, trip, pckgbutn, rent, hotl;
    static JPanel contentPanel;
    static JScrollPane scrollPane;

    placetemplate() {

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("Ratnagiri");
        setLayout(null);
//        getContentPane().setBackground(new Color(71, 72, 86, 255));

        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 1366, 768); // Set the bounds to cover the whole frame
        getContentPane().add(scrollPane); // Add the scroll pane to the frame

        // Create a JPanel to hold your components
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(1366, 1680)); // Set the preferred size to enable scrolling
        contentPanel.setBackground(new Color(71, 72, 86, 255));
        scrollPane.setViewportView(contentPanel); // Set the scroll pane's viewport to the content panel

        JPanel k1 = new JPanel();
        k1.setLayout(null);
        k1.setBackground(new Color(0x6B7A99));
        k1.setBounds(0, 0, 1600, 57);
        contentPanel.add(k1);

        String a = "Ratnagiri";
        JLabel h = new JLabel(a);
        h.setBounds(25, 70, 200, 45);
        h.setFont(new Font("Poppins", Font.BOLD, 40));
        h.setForeground(new Color(0xF9F8FC));
        contentPanel.add(h);

        JLabel n = new JLabel("City in Maharashtra");
        n.setBounds(28, 110, 200, 20);
        n.setFont(new Font("Poppins", Font.BOLD, 12));
        n.setForeground(new Color(0xF9F8FC));
        contentPanel.add(n);

        String backbstr = "C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\Back.png";
        ImageIcon backb = new ImageIcon(backbstr);
        back = new JButton(backb); // back
        back.setBackground(new Color(0x474856));
        back.setLayout(null);
        back.setBorder(BorderFactory.createEmptyBorder());
        back.setBounds(1270, 1470, 60, 60);
        back.addActionListener(this);
        contentPanel.add(back);

        String a1str = "Dash_Icons/rtn.png";
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource(a1str));
        Image a2 = a1.getImage().getScaledInstance(614, 355, Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel a4 = new JLabel(a3);
        a4.setBounds(28, 150, 614, 355);
        contentPanel.add(a4);

        String h1str = "icons/thiba.png";
        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource(h1str));
        Image h2 = h1.getImage().getScaledInstance(477, 318, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel h4 = new JLabel(h3);
        h4.setBounds(778, 528, 487, 318);
        contentPanel.add(h4);

        String z1str = "icons/info.png";
        ImageIcon z1 = new ImageIcon(ClassLoader.getSystemResource(z1str));
        Image z2 = z1.getImage().getScaledInstance(400, 452, Image.SCALE_DEFAULT);
        ImageIcon z3 = new ImageIcon(z2);
        JLabel z4 = new JLabel(z3);
        z4.setBounds(356, 525, 400, 452);
        contentPanel.add(z4);

        String v1str = "icons/famous.png";
        ImageIcon v1 = new ImageIcon(ClassLoader.getSystemResource(v1str));
        Image v2 = v1.getImage().getScaledInstance(326, 309, Image.SCALE_DEFAULT);
        ImageIcon v3 = new ImageIcon(v2);
        JLabel v4 = new JLabel(v3);
        v4.setBounds(18, 665, 326, 309);
        contentPanel.add(v4);

        String j1str = "icons/paplate.png";
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource(j1str));
        Image j2 = j1.getImage().getScaledInstance(284, 333, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel j4 = new JLabel(j3);
        j4.setBounds(18, 990, 284, 333);
        contentPanel.add(j4);

        String s1Str = "icons/client reviwes.png";
        ImageIcon s1 = new ImageIcon(ClassLoader.getSystemResource(s1Str));
        Image s2 = s1.getImage().getScaledInstance(489, 553, Image.SCALE_DEFAULT);
        ImageIcon s3 = new ImageIcon(s2);
        JLabel s4 = new JLabel(s3);
        s4.setBounds(778, 868, 489, 553);
        contentPanel.add(s4);

        String g1str = "icons/client 1.png";
        ImageIcon g1 = new ImageIcon(ClassLoader.getSystemResource(g1str));
        Image g2 = g1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon g3 = new ImageIcon(g2);
        JLabel g4 = new JLabel(g3);
        g4.setBounds(30, 100, 431, 132);
        s4.add(g4);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/client2.png"));
        Image c2 = c1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel c4 = new JLabel(c3);
        c4.setBounds(30, 238, 431, 132);
        s4.add(c4);

        ImageIcon w1 = new ImageIcon(ClassLoader.getSystemResource("icons/client 3.png"));
        Image w2 = w1.getImage().getScaledInstance(431, 132, Image.SCALE_DEFAULT);
        ImageIcon w3 = new ImageIcon(w2);
        JLabel w4 = new JLabel(w3);
        w4.setBounds(30, 378, 431, 132);
        s4.add(w4);

        ImageIcon rnt = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\rental.png");
        rent = new JButton(rnt);
        rent.setBounds(350, 1000, 377, 347);
        rent.setBackground(new Color(71, 72, 86, 255));
        rent.setForeground(new Color(0xFFFFFF));
        rent.setBorder(BorderFactory.createEmptyBorder());
        rent.addActionListener(this);
        contentPanel.add(rent);

        ImageIcon mp = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\Dash_Icons\\rtnmap.png");
        map = new JButton(mp);
        map.setBackground(new Color(0x474856));
        map.setLayout(null);
        map.setBorder(BorderFactory.createEmptyBorder());
        map.setBounds(658, 150, 282, 355);
        map.addActionListener(this);
        contentPanel.add(map);

        ImageIcon wethear = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\weather.png");
        wt = new JButton(wethear);
        wt.setBackground(new Color(0xF9F8FC));
        wt.setLayout(null);
        wt.setBorder(BorderFactory.createEmptyBorder());
        wt.setBounds(958, 150, 300, 171);
        wt.addActionListener(this);
        contentPanel.add(wt);

        ImageIcon iterniti = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\direction.png");
        itr = new JButton(iterniti);
        itr.setBackground(new Color(0x92A7BA));
        itr.setLayout(null);
        itr.setBorder(BorderFactory.createEmptyBorder());
        itr.setBounds(958, 330, 300, 171);
        itr.addActionListener(this);
        contentPanel.add(itr);

        ImageIcon Q1 = new ImageIcon(ClassLoader.getSystemResource("DButns/ask.png"));
        Image Q2 = Q1.getImage().getScaledInstance(307, 124, Image.SCALE_DEFAULT);
        ImageIcon Q3 = new ImageIcon(Q2);
        JLabel Q4 = new JLabel(Q3);
        Q4.setBounds(28, 520, 307, 124);
        contentPanel.add(Q4);

        trip = new JButton("ASK ME");
        trip.setBounds(190, 70, 102, 37);
        trip.setBackground(new Color(71, 72, 86, 255));
        trip.setForeground(new Color(0xFFFFFF));
        trip.setBorder(BorderFactory.createEmptyBorder());
        trip.addActionListener(this);
        Q4.add(trip);

        ImageIcon pkg = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\pakgbutn.png");
        pckgbutn = new JButton(pkg);
        pckgbutn.setBounds(650, 1450, 597, 95);
        pckgbutn.setBackground(new Color(71, 72, 86, 255));
        pckgbutn.setForeground(new Color(0xFFFFFF));
        pckgbutn.setBorder(BorderFactory.createEmptyBorder());
        pckgbutn.addActionListener(this);
        contentPanel.add(pckgbutn);

        ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("DButns/Quote.png"));
        Image f2 = f1.getImage().getScaledInstance(480, 180, Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel f4 = new JLabel(f3);
        f4.setBounds(50, 1360, 480, 180);
        contentPanel.add(f4);

        ImageIcon r2 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\hotelbutn (1).png");
        hotl = new JButton(r2);
        hotl.setBounds(161, 109, 296, 54);
        hotl.setBorder(BorderFactory.createLineBorder(new Color(0x0D1D34)));
        hotl.addActionListener(this);
        f4.add(hotl);

        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new places();
        } else if (e.getSource() == map) {
            try {
                MapInitializer.initializeMap(16.9883994, 73.2900679);
            } catch (Exception s) {
                try {
                    URI uri = new URI("https://www.google.com/maps/place/Ratnagiri,+Maharashtra/@16.9883994,73.2900679,13.1z/data=!4m6!3m5!1s0x3bea0d1839a6bb7f:0x63ab969b79bf6561!8m2!3d16.990215!4d73.3120233!16zL20vMDM0bjBx?entry=ttu");
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException | IOException j) {
                    throw new RuntimeException(j);
                }
            }
        } else if (e.getSource() == wt) {
            try {
                restaurent_func.Delivery_web("https://weather.com/en-IN/weather/today/l/a446e004a3ac5e3d6c70dcd4c4a0449bb6fd874c5fecfedd097ccf3b2a40d1a7");
            } catch (Exception s) {
                try {
                    URI uri = new URI("https://weather.com/en-IN/weather/today/l/a446e004a3ac5e3d6c70dcd4c4a0449bb6fd874c5fecfedd097ccf3b2a40d1a7");
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException | IOException j) {
                    throw new RuntimeException(j);
                }
            }
        } else if (e.getSource() == itr) {
            try {
                restaurent_func.Delivery_web("https://www.google.com/maps/dir/Railway+Ticket+Counter,+Bhisegaon,+Karjat,+Maharashtra+410201/Ratnagiri,+Maharashtra/@17.9157618,72.3488779,8z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3be7fb7686f92299:0x8548bea924623954!2m2!1d73.320546!2d18.9131276!1m5!1m1!1s0x3bea0d1839a6bb7f:0x63ab969b79bf6561!2m2!1d73.3120233!2d16.990215!3e0?entry=ttu");
            } catch (Exception s) {
                try {
                    URI uri = new URI("https://www.google.com/maps/dir/Railway+Ticket+Counter,+Bhisegaon,+Karjat,+Maharashtra+410201/Ratnagiri,+Maharashtra/@17.9157618,72.3488779,8z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3be7fb7686f92299:0x8548bea924623954!2m2!1d73.320546!2d18.9131276!1m5!1m1!1s0x3bea0d1839a6bb7f:0x63ab969b79bf6561!2m2!1d73.3120233!2d16.990215!3e0?entry=ttu");
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException | IOException j) {
                    throw new RuntimeException(j);
                }
            }
            } else if (e.getSource() == trip) {
                try {
                    URI uri = new URI("https://www.google.com/maps/dir/19.2304271,73.0759443/Ratnagiri,+Maharashtra/@18.0711452,72.2939773,8z/data=!3m1!4b1!4m10!4m9!1m1!4e1!1m5!1m1!1s0x3bea0d1839a6bb7f:0x63ab969b79bf6561!2m2!1d73.3120233!2d16.990215!3e0?entry=ttu");
                    Desktop.getDesktop().browse(uri);
                } catch (URISyntaxException | IOException j) {
                    throw new RuntimeException(j);
                }
            } else if (e.getSource() == pckgbutn) {
                setVisible(false);
                new booking();
            } else if (e.getSource() == rent) {
                setVisible(true);
                new rentalrtn();
            } else if (e.getSource() == hotl) {
                new Hotel_ratnagiri();
            }
        }
        public static void main (String[]args){
            new placetemplate();
        }
    }



