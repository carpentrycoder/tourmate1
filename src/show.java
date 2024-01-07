import javax.swing.*;
import java.awt.*;

public class show extends JFrame {
    //JButton Back;
    int x = 80;
  int txtX = 250;
  int txtWidth = 200;
  int txtHeight = 30;
    Font font = new Font("Tahoma", Font.BOLD,20);
   JLabel  phoneNo1, aadhar1, address1, bldgrp1, gender1;
   JTextField name1;

    show()
    {
      JFrame show = new JFrame();
      show.setSize(550,610);
      ImageIcon k1  = new ImageIcon(ClassLoader.getSystemResource("icons/Show_Profile.png"));
      Image k2 = k1.getImage().getScaledInstance(550,610,Image.SCALE_DEFAULT);
      ImageIcon k3 = new ImageIcon(k2);
      JLabel image = new JLabel(k3);
      show.add(image);

        JLabel l1  = new JLabel("Name");
        l1.setBounds(x,70,150,40);
        l1.setFont(font);
        l1.setForeground(Color.WHITE);
        image.add(l1);

        name1 = new JTextField();
        name1.setBounds(txtX,70,150,40);
        name1.setFont(font);
        name1.setForeground(Color.WHITE);
        image.add(name1);

        JLabel l2  = new JLabel("Aadhar");
        l2.setBounds(x,130,150,40);
        l2.setFont(font);
        l2.setForeground(Color.WHITE);
        image.add(l2);

        JLabel l3  = new JLabel("D.O.B");
        l3.setBounds(x,190,150,40);
        l3.setFont(font);
        l3.setForeground(Color.WHITE);
        image.add(l3);

        JLabel l4  = new JLabel("Gender");
        l4.setBounds(x,250,150,40);
        l4.setFont(font);
        l4.setForeground(Color.WHITE);
        image.add(l4);

        JLabel l5  = new JLabel("Address");
        l5.setBounds(x,310,150,40);
        l5.setFont(font);
        l5.setForeground(Color.WHITE);
        image.add(l5);

        JLabel l6  = new JLabel("Phone No");
        l6.setBounds(x,370,150,40);
        l6.setFont(font);
        l6.setForeground(Color.WHITE);
        image.add(l6);

        JLabel l7  = new JLabel("Blood Group");
        l7.setBounds(x,430,150,40);
        l7.setFont(font);
        l7.setForeground(Color.WHITE);
        image.add(l7);


        aadhar1 = new JLabel();
        aadhar1.setBounds(txtX, 130,  txtWidth,txtHeight);
        aadhar1.setFont(font);
        aadhar1.setForeground(Color.WHITE);
        image.add(aadhar1);

        address1 = new JLabel();
        address1.setBounds(txtX, 310,  txtWidth,txtHeight);
        address1.setFont(font);
        address1.setForeground(Color.WHITE);
        image.add(address1);


        phoneNo1 = new JLabel();
        phoneNo1.setBounds(txtX, 370,  txtWidth,txtHeight);
        phoneNo1.setFont(font);
        phoneNo1.setForeground(Color.WHITE);
        image.add(phoneNo1);

      bldgrp1 = new JLabel();
      bldgrp1.setBounds(txtX, 430,  txtWidth,txtHeight);
      bldgrp1.setFont(font);
      bldgrp1.setForeground(Color.WHITE);
      image.add(bldgrp1);

      gender1 = new JLabel();
      gender1.setBounds(txtX, 490,  txtWidth,txtHeight);
      gender1.setFont(font);
      gender1.setForeground(Color.WHITE);
      image.add(gender1);


      show.setLocationRelativeTo(null);
      show.setVisible(true);
    }
    public static void main(String[] args) {
        new show();
    }
}
