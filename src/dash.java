import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class dash extends JFrame implements ActionListener {
  JButton j1, j2, j3, j4, j5, j6, j7,j8,S;
  Calendar calendar;
  SimpleDateFormat timeFormat,dayFormat,dateFormat;
  JLabel timeLable,dayLable,dateLable;
  String time,day,date;
  dash()
  {
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);

    ImageIcon l = new ImageIcon(getClass().getClassLoader().getResource("icons\\logo.jpg\\"));
    setIconImage(l.getImage());
    setTitle(" DASHBOARD");

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

//    JLabel h = new JLabel("Dashboard");
//    h.setBounds(58, 3, 200, 40);
//    h.setFont(new Font("Atkinson Hyperlegible", Font.BOLD, 25));
//    h.setForeground(new Color(0x000000));
//    k1.add(h);

    ImageIcon s1 = new ImageIcon("\\tourmate1\\src\\icons\\profile1.png");
    S = new JButton(s1);
    S.setLayout(null);
    S.setBounds(1300, 2, 50, 50);
    S.setBackground(new Color(107, 122, 153, 255));
    S.setBorder(BorderFactory.createLineBorder(new Color(0x6B7A99)));
    S.addActionListener(this);
    k1.add(S);

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

    ImageIcon f1 = new ImageIcon(ClassLoader.getSystemResource("icons/Fl.png"));
    Image f2 = f1.getImage().getScaledInstance(764, 112, Image.SCALE_DEFAULT);
    ImageIcon f3 = new ImageIcon(f2);
    JLabel f4 = new JLabel(f3);
    f4.setBounds(490, 70, 764, 112);
    add(f4); //1st line

    ImageIcon d1 = new ImageIcon(ClassLoader.getSystemResource("icons/fitrs.png"));
    Image d2 = d1.getImage().getScaledInstance(457, 148, Image.SCALE_DEFAULT);
    ImageIcon d3 = new ImageIcon(d2);
    JLabel d4 = new JLabel(d3);
    d4.setBounds(420, 217, 448, 148);
    add(d4); // our frame

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
    Image x2 = x1.getImage().getScaledInstance(480,66, Image.SCALE_DEFAULT);
    ImageIcon x3 = new ImageIcon(x2);
    JLabel x4 = new JLabel(x3);
    x4.setBounds(483, 0, 480,66);
    k1.add(x4);

    ImageIcon w1 = new ImageIcon(ClassLoader.getSystemResource("icons/5c.png"));
    Image w2 = w1.getImage().getScaledInstance(675, 256, Image.SCALE_DEFAULT);
    ImageIcon w3 = new ImageIcon(w2);
    JLabel w4 = new JLabel(w3);
    w4.setBounds(220, 410, 675,256);
    add(w4);

    JPanel k = new JPanel(); // clock
    k.setBounds(215, 70, 260, 123);
    k.setBackground(new Color(0xFF5C2DB0, true));
    k.setLayout(new FlowLayout());
    add(k);

    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dayFormat = new SimpleDateFormat("EEEE");
    dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    timeLable = new JLabel();
    dayLable = new JLabel();
    dateLable = new JLabel();

    time = timeFormat.format(Calendar.getInstance().getTime());

    timeLable.setText(time);
    timeLable.setFont(new Font("Tahoma", Font.BOLD, 28));
    timeLable.setForeground(new Color(0xF9F8FC));
    timeLable.setBackground(new Color (0xFF5C2DB0,true));
    timeLable.setOpaque(true);

    dayLable.setFont(new Font("Tahoma", Font.BOLD, 32));
    dayLable.setForeground(new Color(0xF9F8FC));
    dayLable.setBackground(new Color (0xFF5C2DB0,true));

    dateLable.setFont(new Font("Tahoma", Font.BOLD, 28));
    dateLable.setForeground(new Color(0xF9F8FC));
    dateLable.setBackground(new Color (0xFF5C2DB0,true));

    k.add(timeLable);
    k.add(dayLable);
    k.add(dateLable);

    setVisible(true);
    setTime();
  }
  public void setTime() {
    while(true) {
      time = timeFormat.format(Calendar.getInstance().getTime());
      timeLable.setText(time);

      day = dayFormat.format(Calendar.getInstance().getTime());
      dayLable.setText(day);

      date = dateFormat.format(Calendar.getInstance().getTime());
      dateLable.setText(date);

      try{
        Thread.sleep(1000);
      }catch (Exception e){
        System.out.println(e);
      }
    }
  }

  public void actionPerformed(ActionEvent j)
    {
      if(j.getSource()==S)
      {
      new profile();
      } else if (j.getSource()==j1) {
        new places();
      }
      else if (j.getSource()==j2) {
        new booking();
      } else if (j.getSource()==j4) {
        Map map = new Map();
        map.setVisible(true);
      } else if (j.getSource()==j8) {
        setVisible(true);
        new support();
      } else if (j.getSource()==j3) {
        setVisible(true);
        new trip();
      }
    }
    public static void main(String[] args) {
        new dash();
    }
}


//        Button 1: Y-coordinate = 128
//        Button 2: Y-coordinate = 128 + 45 + 28 = 201
//        Button 3: Y-coordinate = 201 + 45 + 28 = 274
//        Button 4: Y-coordinate = 274 + 45 + 28 = 347
//        Button 5: Y-coordinate = 347 + 45 + 28 = 420
//        Button 6: Y-coordinate = 420 + 45 + 28 = 493
//        Button 7: Y-coordinate = 493 + 45 + 28 = 566
//        Button 8: Y-coordinate = 566 + 45 + 28 = 639