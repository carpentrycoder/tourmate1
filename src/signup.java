import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;


public class signup extends JFrame implements ActionListener {
    JButton Signup,Back,code;
    TextField tfmail,tfuser,tfans,tfpass;
    Choice tfsec;

    Font font = new Font("Tahoma", Font.BOLD,10);

   signup()
   {
       setSize(625,550);
       setLocation(370,100);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newsignup.jpg"));
       Image i2 = i1.getImage().getScaledInstance(600,490,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel i4 = new JLabel(i3);
       add(i4);

       //add text here
       JLabel Email = new JLabel("Email:");
       Email.setFont(font);
       Email.setBounds(270,80,100,50);
       Email.setFont(new Font("Open Sauce",Font.BOLD,18));
       Email.setForeground(new Color(0x525151));
       i4.add(Email);

       //add box here
       tfmail = new TextField();
       tfmail.setBounds(369,98,200,20);
       i4.setBorder(BorderFactory.createBevelBorder(1));
       i4.add(tfmail);

       //add text here
       JLabel username = new JLabel("Name:");
       username.setFont(font);
       username.setBounds(270,113,100,50);
       username.setFont(new Font("Open Sauce",Font.BOLD,18));
       username.setForeground(new Color(0x525151));
       i4.add(username);

       //add box here
       tfuser = new TextField();
       tfuser.setBounds(369,130,200,20);
       i4.setBorder(BorderFactory.createBevelBorder(1));
       i4.add(tfuser);

       //add text here
       JLabel pass = new JLabel("Password:");
       pass.setFont(font);
       pass.setBounds(255,150,100,50);
       pass.setFont(new Font("Open Sauce",Font.BOLD,18));
       pass.setForeground(new Color(0x525151));
       i4.add(pass);

       //add box here
       tfpass = new TextField();
       tfpass.setBounds(369,168,200,20);
       i4.setBorder(BorderFactory.createBevelBorder(1));
       i4.add(tfpass);

       JLabel security = new JLabel("Security");
       security.setFont(font);
       security.setBounds(270,185,90,50);
       security.setFont(new Font("Open Sauce",Font.BOLD,18));
       security.setForeground(new Color(0x525151));
       i4.add(security);

       JLabel Q = new JLabel("Question:");
       Q.setFont(font);
       Q.setBounds(263,210,90,50);
       Q.setFont(new Font("Open Sauce",Font.BOLD,18));
       Q.setForeground(new Color(0x525151));
       i4.add(Q);

       tfsec = new Choice();
       tfsec.setBounds(370,225,220,20);
       tfsec.add("             --SELECT QUESTION--");
       tfsec.add("Which app you use most ?");
       tfsec.add("You are favorite car ?");
       tfsec.add("What is your favorite sport ?");
       tfsec.add("Favorite character from mirzapur ?");
       i4.setBorder(BorderFactory.createBevelBorder(1));
       i4.add(tfsec);

       JLabel a = new JLabel("Answer:");
       a.setFont(font);
       a.setBounds(270,245,90,50);
       a.setFont(new Font("Open Sauce",Font.BOLD,18));
       a.setForeground(new Color(0x525151));
       i4.add(a);

       //box
       tfans = new TextField();
       tfans.setBounds(370,260,220,20);
       i4.setBorder(BorderFactory.createBevelBorder(1));
       i4.add(tfans);

       //button
       //let's create tms.signup Button
       Signup = new JButton("SIGN UP");
       Signup.setBounds(250,350,160,30);
       Signup.setBackground(new Color(20, 98, 203));
       Signup.setFont(new Font("Open Sauce",Font.BOLD,18));
       Signup.setForeground(Color.WHITE);
       Signup.setBorder(BorderFactory.createBevelBorder(1));
       Signup.addActionListener(this);
       i4.add(Signup);

       //let's create Back Button
       Back = new JButton("BACK");
       Back.setBounds(425,350,160,30);
       Back.setBackground(new Color(20, 98, 203));
       Back.setFont(new Font("Open Sauce",Font.BOLD,18));
       Back.setForeground(Color.WHITE);
       Back.setBorder(BorderFactory.createBevelBorder(1));
       Back.addActionListener(this);
       i4.add(Back);

       //let's create Button forgot password
       code = new JButton("LOGIN");
       code.setBounds(295,400,240,30);
       code.setBackground(new Color(20, 98, 203, 255));
       code.setFont(new Font("Open Sauce",Font.BOLD,18));
       code.setForeground(new Color(0xFFFFFF));
       code.setBorder(BorderFactory.createBevelBorder(1));
       code.addActionListener(this);
       i4.add(code);

       setUndecorated(true);
       setVisible(true);
   }
public void actionPerformed (ActionEvent ae)
{
  if(ae.getSource()==Signup)
  {
      String Username = tfuser.getText();
      String EMail = tfmail.getText();
      String Password = tfpass.getText();
      String Question = tfsec.getSelectedItem();
      String answer = tfans.getText();

      String query = "insert into account values('" + Username + "','" + EMail + "','" + Password + "','" + Question + "','" + answer + "')";

          try {
              try (FileWriter writer = new FileWriter("user.txt")) {
                  writer.write(Username);
                  FileWriter writer1 = new FileWriter("pass.txt");
                  writer1.write(Password);
                  System.out.println("String stored in user.txt\n" +"pass.txt");
              } catch (IOException e) {
                  System.out.println(e);
              }
              conn c = new conn();
              c.s.executeUpdate(query);

              JOptionPane.showMessageDialog(null,"Account Created Successfully");
              setVisible(false);
              new login();
          } catch (Exception e) {
              System.out.println(e);
              JOptionPane.showMessageDialog(this,"there is some erorr!!\n" + "do want to enter as a guest :)");
              setVisible(false);
              new loading();
          }
  } else if (ae.getSource()==Back) {
      setVisible(false);
      new bg();
  }
  else if(ae.getSource()==code)
  {
     setVisible(false);
      new login();
  }

  }

  public static void main(String[] args) {
        new signup();
    }
}
