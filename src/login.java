import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class login extends JFrame implements ActionListener {
JButton Back,code,Signup,Login;
JTextField tfusername, tfpass;
Font fontTxt = new Font("Open Sauce",Font.PLAIN,15);
   login()
   {
       setSize(900,400);
       setLocationRelativeTo(null);
       setTitle("Login");
       setLayout(null);
       getContentPane().setBackground(new Color(227, 220, 215));

       JPanel p1 = new JPanel();
       p1.setBackground(new Color(136, 162, 217));
       p1.setBounds(0,0,270,300);
       setLayout(null);
       add(p1);

       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/profile.png"));
       Image i2 =  i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       setBounds(300,170,750,330);
       p1.add(image);

       JPanel p2 = new JPanel();
       p2.setLayout(null);
       p2.setBounds(250,0,450,300);
       add(p2);

       //Jlabel use for text
       JLabel Username = new JLabel("Name:");
       Username.setBounds(60,20,230,23);
       Username.setFont(new Font("Open Sauce",Font.BOLD,15));
       p2.add(Username);

       //text box
       tfusername = new JTextField();
       tfusername.setFont(new Font("Open Sauce",Font.BOLD,15));
       tfusername.setBounds(60,45,350,25);
       p2.setBorder(BorderFactory.createEmptyBorder());
       p2.setFont(fontTxt);
       p2.add(tfusername);

       //Jlabel use for text
       JLabel Password = new JLabel("Password:");
       Password.setBounds(60,80,230,23);
       Password.setFont(new Font("Open Sauce",Font.BOLD,15));
       p2.add(Password);

       //text box
       tfpass = new JTextField();
       tfpass.setFont(new Font("Open Sauce",Font.BOLD,15));
       tfpass.setBounds(60,100,350,25);
       p2.setBorder(BorderFactory.createEmptyBorder());
       p2.setFont(fontTxt);
      // p2.setBorder(BorderFactory.createBevelBorder(24,Color.white,Color.white));
       p2.add(tfpass);

       //let's create tms.login Button
       Login = new JButton("Login");
       Login.setBounds(60,160,160,30);
       Login.setBackground(new Color(97, 131, 192));
       Login.setFont(new Font("Open Sauce",Font.BOLD,15));
       Login.setForeground(Color.WHITE);
       Login.setBorder(BorderFactory.createLineBorder(new Color(97,131,192),2,true));
       Login.addActionListener(this);
       p2.add(Login);

       //let's create tms.signup Button
       Signup = new JButton("Signup");
       Signup.setBounds(260,160,160,30);
       Signup.setBackground(new Color(97, 131, 192));
       Signup.setFont(new Font("Open Sauce",Font.BOLD,15));
       Signup.setForeground(Color.WHITE);
       Signup.setBorder(BorderFactory.createLineBorder(new Color(97,131,192),2,true));
       Signup.addActionListener(this);
       p2.add(Signup);

       //let's create Button forgot password
       code = new JButton("Forgot Password ??");
       code.setBounds(160,220,160,30);
       code.setBackground(new Color(243, 240, 237, 255));
       code.setFont(new Font("Open Sauce",Font.BOLD,15));
       code.setForeground(new Color(0x0D8AF1));
       code.setBorder(BorderFactory.createLineBorder(new Color(227,220,215),2,true));
       code.addActionListener(this);
       p2.add(code);

       //let's create Back Button
       Back = new JButton("Back");
       Back.setBounds(350,250,60,20);
       Back.setBackground(new Color(20, 98, 203));
       Back.setFont(new Font("Open Sauce",Font.BOLD,14));
       Back.setForeground(Color.WHITE);
       Back.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255),1,true));
       Back.addActionListener(this);
       p2.add(Back);

       setVisible(true);
   }

    public void actionPerformed(ActionEvent dj)
    {
        if(dj.getSource()==Back)
        {
            setVisible(false);
            new bg();
        }
        else if (dj.getSource() == code)
        {
           setVisible(false);
           new forpass();
        }
        else if (dj.getSource() == Signup)
        {
          setVisible(false);
          new signup();
        }
        else if (dj.getSource() == Login)
        {
            try
           {
              String Username = tfusername.getText();
              String Password = tfpass.getText();
              FileWriter writer1 = new FileWriter("pass.txt");
              FileWriter writer = new FileWriter("user.txt");
               try
              {
                  writer.write(Username);
                  writer1.write(Password);
                   System.out.println("String stored in user.txt\n" +"pass.txt");
               } catch (IOException e) {
                    System.out.println(e);
               }

              String query = "Select * From account where Username = '"+Username+"' AND Password = '"+Password+"'";
              conn c = new conn();

              ResultSet rs = c.s.executeQuery(query);
              if(rs.next())
              {
                  setVisible(false);
                new loading();
              }
              else
              {
               JOptionPane.showMessageDialog(null,"Incorrect username or password");
              }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }

    }


    public static void main(String[] args) {
        new login();
    }
}