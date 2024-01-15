import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
// Copyright (c) 2024 Sutar
public class forpass extends JFrame implements ActionListener {
    TextField tfname,tfmail,tfans,tfsec;
    JButton S,retrive,b;
    JTextField tfpass;

    forpass()
    {
       //set Background
        setSize(635,540);
        setLocation(370,100);
        ImageIcon k1  = new ImageIcon(ClassLoader.getSystemResource("icons/forgot.jpg"));
        Image k2 = k1.getImage().getScaledInstance(600,490,Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel image = new JLabel(k3);
        add(image);

        //name txt is here
        JLabel Name = new JLabel("Name:");
        Name.setBounds(60,180,60,20);
        Name.setFont(new Font("Open Sauce",Font.BOLD,20));
        Name.setForeground(Color.BLACK);
        image.add(Name);

        //text box here
        tfname = new TextField();
        tfname.setBounds(130,183,300,20);
        image.setBorder(BorderFactory.createEmptyBorder());
        tfname.setBackground(new Color(249, 248, 250,255));
        image.add(tfname);

        //search button
        ImageIcon s1 = new ImageIcon("H:\\tourmate1\\src\\icons\\search.png");

        S = new JButton(s1);
        S.setBounds(442,172,35,35);
        S.setBackground(new Color(255,227,190,255));
        S.setFont(new Font("Open Sauce",Font.BOLD,18));
        S.setForeground(new Color(0, 0, 0,255));
        S.setBorder(BorderFactory.createEmptyBorder());
        S.addActionListener(this);
        image.add(S);
        setLayout(new FlowLayout());


        //name txt is here
        JLabel email = new JLabel("Email:");
        email.setBounds(60,220,60,20);
        email.setFont(new Font("Open Sauce",Font.BOLD,20));
        email.setForeground(Color.BLACK);
        image.add(email);

        //text box here
        tfmail = new TextField();
        tfmail.setBounds(130,222,300,20);
        image.setBorder(BorderFactory.createEmptyBorder());
        tfmail.setBackground(new Color(249, 248, 252,255));
        image.add(tfmail);

        //name txt is here
        JLabel Question = new JLabel("Question:");
        Question.setBounds(60,260,100,20);
        Question.setFont(new Font("Open Sauce",Font.BOLD,20));
        Question.setForeground(Color.BLACK);
        image.add(Question);

        //text choice box here
        tfsec = new TextField();
        tfsec.setBounds(160,260,220,20);
        image.setBorder(BorderFactory.createBevelBorder(1));
        image.add(tfsec);

        JLabel a = new JLabel("Answer:");
        a.setBounds(60,284,90,50);
        a.setFont(new Font("Open Sauce",Font.BOLD,20));
        a.setForeground(new Color(0x000000));
        image.add(a);

        //text box here
        tfans = new TextField();
        tfans.setBounds(150,302,250,20);
        image.setBorder(BorderFactory.createEmptyBorder());
        tfans.setBackground(new Color(250, 249, 252,255));
        image.add(tfans);

        //search button
        ImageIcon retrive1 = new ImageIcon("\\tourmate1\\src\\icons\\retrive.png");

        retrive = new JButton(retrive1);
        retrive.setBounds(410,298,30,30);
        retrive.setBackground(new Color(255,227,190,255));
        retrive.setBorder(BorderFactory.createEmptyBorder());
        retrive.addActionListener(this);
        image.add(retrive);
        setLayout(new FlowLayout());

        //text password
        JLabel z = new JLabel("Password:");
        z.setBounds(60,324,100,50);
        z.setFont(new Font("Open Sauce",Font.BOLD,20));
        z.setForeground(new Color(0x000000));
        image.add(z);

        //pass box
        tfpass = new JTextField();
        tfpass.setBounds(170,340,200,20);
        image.setBorder(BorderFactory.createEmptyBorder());
        tfpass.setBackground(Color.WHITE);
        image.add(tfpass);

        //search button
        ImageIcon b1 = new ImageIcon("\\tourmate1\\src\\icons\\back.png");

        b = new JButton(b1);
        b.setBounds(290,390,70,45);
        b.setBackground(new Color(134, 171, 231,255));
        b.setBorder(BorderFactory.createLineBorder(Color.BLACK,1,false));
        b.addActionListener(this);
        image.add(b);
        setLayout(new FlowLayout());

        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource()==S)
        {
            try
            {
            String query = "Select * From account where Username = '"+tfname.getText()+"'";
                    conn c = new conn();

                ResultSet rs = c.s.executeQuery(query);
                while(rs.next())
                {
                    tfmail.setText(rs.getString("Email"));
                    tfsec.setText(rs.getString("Question")) ;
                }

            }catch (Exception e)
            {
                e.printStackTrace();
            }

        } else if (ae.getSource()==retrive)
        {
            try
            {
                String query = "Select * From account where answer = '"+ tfans.getText()+"' AND Username = '"+tfname.getText()+"'";
                conn c = new conn();

                ResultSet rs = c.s.executeQuery(query);

                while (rs.next())
                {
                    //  tfmail.setText(rs.getString("Email"));
                    tfpass.setText(rs.getString("Password"));
                }
            }catch (Exception j)
            {
                j.printStackTrace();
                JOptionPane.showMessageDialog(null,"NOT USER FOUND !!!");
            }

        } else if (ae.getSource()==b)
        {
         setVisible(false);
         new login();
        }

    }

    public static void main(String[] args) {
        new forpass();
    }
}
