import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dash extends JFrame implements ActionListener {
  JButton j1, j2, j3, j4, j5, j6, j7, j8, S;
  SimpleDateFormat timeFormat, dayFormat, dateFormat;
  JLabel timeLabel, dayLabel, dateLabel;
  String time, day, date;

  dash() {
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);

    ImageIcon l = new ImageIcon(getClass().getClassLoader().getResource("icons/logo.jpg"));
    if (l != null)
      setIconImage(l.getImage());
    setTitle("DASHBOARD");

    getContentPane().setBackground(new Color(0, 23, 41, 255));

    JPanel k1 = new JPanel();
    k1.setLayout(null);
    k1.setBackground(new Color(0x6B7A99));
    k1.setBounds(0, 0, 1600, 57);
    add(k1);

    JPanel j = new JPanel();
    j.setLayout(null);
    j.setBackground(new Color(0xFFB7D1E2, true));
    j.setBounds(0, 0, 203, 1000);
    add(j);

    ImageIcon g1 = new ImageIcon(ClassLoader.getSystemResource("icons/MH.png"));
    Image g2 = g1.getImage().getScaledInstance(195, 188, Image.SCALE_DEFAULT);
    ImageIcon g3 = new ImageIcon(g2);
    JLabel g4 = new JLabel(g3);
    g4.setBounds(215, 199, 195, 188);
    add(g4);

    ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashL.png"));
    Image a2 = a1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    ImageIcon a3 = new ImageIcon(a2);
    JLabel a4 = new JLabel(a3);
    a4.setBounds(6, 4, 50, 50);
    k1.add(a4);

    ImageIcon s1 = new ImageIcon("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\icons\\profile1.png");
    S = new JButton(s1);
    S.setLayout(null);
    S.setBounds(1300, 2, 50, 50);
    S.setBackground(new Color(107, 122, 153, 255));
    S.setBorder(BorderFactory.createLineBorder(new Color(0x6B7A99)));
    S.addActionListener(this);
    k1.add(S);

    j1 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\1.png", 18, 128);
    j1.setFont(new Font("open sauce", Font.BOLD, 20));
    j1.addActionListener(this);
    j.add(j1);

    j2 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\2.png", 18, 201);
    j2.setFont(new Font("open sauce", Font.BOLD, 20));
    j2.addActionListener(this);
    j.add(j2);

    j3 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\3.png", 18, 274);
    j3.setFont(new Font("open sauce", Font.BOLD, 20));
    j3.addActionListener(this);
    j.add(j3);

    j4 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\4.png", 18, 347);
    j4.setFont(new Font("open sauce", Font.BOLD, 20));
    j4.addActionListener(this);
    j.add(j4);

    j5 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\5.png", 18, 420);
    j5.setFont(new Font("open sauce", Font.BOLD, 20));
    j5.addActionListener(this);
    j.add(j5);

    j6 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\6.png", 18, 493);
    j6.setFont(new Font("open sauce", Font.BOLD, 20));
    j6.addActionListener(this);
    j.add(j6);

    j7 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\mini_tv_-removebg-preview.png", 18, 566);
    j7.setFont(new Font("open sauce", Font.BOLD, 20));
    j7.addActionListener(this);
    j.add(j7);

    j8 = createButton("C:\\Users\\Admin\\Documents\\GitHub\\tourmate1\\src\\DButns\\8.png", 18, 639);
    j8.setFont(new Font("open sauce", Font.BOLD, 20));
    j8.addActionListener(this);
    j.add(j8);

    ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/Fl.png"));
    Image f2 = f1.getImage().getScaledInstance(764, 112, Image.SCALE_DEFAULT);
    ImageIcon f3 = new ImageIcon(f2);
    JLabel f4 = new JLabel(f3);
    f4.setBounds(490, 70, 764, 112);
    add(f4);

    ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("icons/fitrs.png"));
    Image d2 = d1.getImage().getScaledInstance(457, 148, Image.SCALE_DEFAULT);
    ImageIcon d3 = new ImageIcon(d2);
    JLabel d4 = new JLabel(d3);
    d4.setBounds(420, 217, 448, 148);
    add(d4);

    ImageIcon v1 = new ImageIcon(ClassLoader.getSystemResource("icons/About_us.png"));
    Image v2 = v1.getImage().getScaledInstance(387, 510, Image.SCALE_DEFAULT);
    ImageIcon v3 = new ImageIcon(v2);
    JLabel v4 = new JLabel(v3);
    v4.setBounds(915, 192, 387, 510);
    add(v4);

    ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("icons/r1.png"));
    Image t2 = t1.getImage().getScaledInstance(159, 166, Image.SCALE_DEFAULT);
    ImageIcon t3 = new ImageIcon(t2);
    JLabel t4 = new JLabel(t3);
    t4.setBounds(205, 330, 159, 166);
    v4.add(t4);

    ImageIcon e1 = new ImageIcon(ClassLoader.getSystemResource("icons/r2.png"));
    Image e2 = e1.getImage().getScaledInstance(159, 166, Image.SCALE_DEFAULT);
    ImageIcon e3 = new ImageIcon(e2);
    JLabel e4 = new JLabel(e3);
    e4.setBounds(20, 330, 159, 166);
    v4.add(e4);

    ImageIcon x1 = new ImageIcon(ClassLoader.getSystemResource("icons/title.png"));
    Image x2 = x1.getImage().getScaledInstance(480, 66, Image.SCALE_DEFAULT);
    ImageIcon x3 = new ImageIcon(x2);
    JLabel x4 = new JLabel(x3);
    x4.setBounds(483, 0, 480, 66);
    k1.add(x4);

    ImageIcon w1 = new ImageIcon(ClassLoader.getSystemResource("icons/5c.png"));
    Image w2 = w1.getImage().getScaledInstance(675, 256, Image.SCALE_DEFAULT);
    ImageIcon w3 = new ImageIcon(w2);
    JLabel w4 = new JLabel(w3);
    w4.setBounds(220, 410, 675, 256);
    add(w4);

    JPanel k = new JPanel(); // clock
    k.setBounds(215, 70, 260, 123);
    k.setBackground(new Color(0xFF5C2DB0, true));
    k.setLayout(new FlowLayout());
    add(k);

    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dayFormat = new SimpleDateFormat("EEEE");
    dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    timeLabel = new JLabel();
    dayLabel = new JLabel();
    dateLabel = new JLabel();

    time = timeFormat.format(Calendar.getInstance().getTime());

    timeLabel.setText(time);
    timeLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
    timeLabel.setForeground(new Color(0xF9F8FC));
    timeLabel.setBackground(new Color(0xFF5C2DB0, true));
    timeLabel.setOpaque(true);

    dayLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
    dayLabel.setForeground(new Color(0xF9F8FC));
    dayLabel.setBackground(new Color(0xFF5C2DB0, true));

    dateLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
    dateLabel.setForeground(new Color(0xF9F8FC));
    dateLabel.setBackground(new Color(0xFF5C2DB0, true));

    k.add(timeLabel);
    k.add(dayLabel);
    k.add(dateLabel);

    setUndecorated(true);
    setVisible(true);
    setTime();
  }

  public void setTime() {
    while (true) {
      time = timeFormat.format(Calendar.getInstance().getTime());
      timeLabel.setText(time);

      day = dayFormat.format(Calendar.getInstance().getTime());
      dayLabel.setText(day);

      date = dateFormat.format(Calendar.getInstance().getTime());
      dateLabel.setText(date);

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public void actionPerformed(ActionEvent j) {
    if (j.getSource() == S) {
      new profile();
    } else if (j.getSource() == j1) {
      new places();
    } else if (j.getSource() == j2) {
      new booking();
    } else if (j.getSource() == j4) {
      SwingHTMLViewer.showHTMLViewer();
    } else if (j.getSource() == j8) {
      setVisible(true);
      new support();
    } else if (j.getSource() == j3) {
      setVisible(true);
      new trip();
    } else if (j.getSource() == j7) {
      String url = "https://www.amazon.in/minitv?mtv_pt=external&refMarker=AVOD_gs_mw_BRND_EDU_GS_TXT_Desk_skey28&gad_source=1&gclid=CjwKCAjwnv-vBhBdEiwABCYQA2XLgWAnuldro82cRVNpAhSaBK5hFI0i5bIGDzZOp0zgMypfigGqsxoCZ7gQAvD_BwE";
      restaurent_func.Delivery_web(url);
    } else if (j.getSource() == j5) {
      JFrame cityFrame = new JFrame("Select City");
      JPanel cityPanel = new JPanel();

      // Create buttons for each city
      JButton ratnagiriButton = new JButton("Ratnagiri");
      ratnagiriButton.setBackground(new Color(214, 128, 7)); // Red
      ratnagiriButton.setPreferredSize(new Dimension(200, 50)); // Increase button size

      JButton mumbaiButton = new JButton("Mumbai");
      mumbaiButton.setBackground(new Color(214, 128, 7)); // Green
      mumbaiButton.setPreferredSize(new Dimension(200, 50)); // Increase button size

      JButton nashikButton = new JButton("Nashik");
      nashikButton.setBackground(new Color(214, 128, 7)); // Blue
      nashikButton.setPreferredSize(new Dimension(200, 50)); // Increase button size

      JButton sambhajinagarButton = new JButton("Sambhajinagar");
      sambhajinagarButton.setBackground(new Color(214, 128, 7)); // Yellow
      sambhajinagarButton.setPreferredSize(new Dimension(200, 50)); // Increase button size

      JButton puneButton = new JButton("Pune");
      puneButton.setBackground(new Color(214, 128, 7)); // Magenta
      puneButton.setPreferredSize(new Dimension(200, 50)); // Increase button size

      // Add action listeners to the buttons
      ratnagiriButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Call method or perform action for Ratnagiri
        }
      });

      mumbaiButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Call method or perform action for Mumbai
        }
      });

      nashikButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Call method or perform action for Nashik
        }
      });

      sambhajinagarButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Call method or perform action for Sambhajinagar
        }
      });

      puneButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Call method or perform action for Pune
        }
      });

      // Add buttons to the panel
      cityPanel.add(ratnagiriButton);
      cityPanel.add(mumbaiButton);
      cityPanel.add(nashikButton);
      cityPanel.add(sambhajinagarButton);
      cityPanel.add(puneButton);

      // Add panel to the frame and set frame properties
      cityFrame.add(cityPanel);
      cityFrame.setSize(400, 450); // Increase frame size
      cityFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      cityFrame.setLocationRelativeTo(null);
      cityPanel.setBackground(new Color(0x2093F3));
      cityFrame.setVisible(true);
    }

  }

  public static JButton createButton(String imagePath, int x, int y) {
    ImageIcon icon = new ImageIcon(imagePath);
    JButton button = new JButton(icon);
    button.setBackground(new Color(0xB7D1E2));
    button.setLayout(null);
    button.setBorder(BorderFactory.createEmptyBorder());
    button.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
    button.setFont(new Font("open sauce", Font.BOLD, 20));
    button.setForeground(Color.BLACK);
    return button;
  }

  public static void main(String[] args) {
    new dash();
  }
}
