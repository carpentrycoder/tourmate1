import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//add back button on bg
//add back button on login

public class bg extends JFrame implements ActionListener {
JButton Login,Signup,exit;
bg()

{
    ImageIcon l = new ImageIcon(getClass().getClassLoader().getResource("icons\\logo.jpg\\"));
    setIconImage(l.getImage());

    setSize(1200,600);
    setLocationRelativeTo(null);
    ImageIcon k1  = new ImageIcon(ClassLoader.getSystemResource("icons/bg.jpg"));
    Image k2 = k1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
    ImageIcon k3 = new ImageIcon(k2);
    setIconImage(l.getImage());
    JLabel image = new JLabel(k3);
    add(image);

    //let's create login Button
    Login = new JButton("Login");
    Login.setBounds(300,350,250,30);
    Login.setBackground(new Color(255, 255, 255, 255));
    Login.setFont(new Font("Open Sauce",Font.BOLD,18));
    Login.setForeground(Color.BLACK);
    Login.setBorder(BorderFactory.createLineBorder(new Color(97,131,192),2,true));
    Login.addActionListener(this);
    image.add(Login);

    //let's create sign up button
    Signup = new JButton("Signup");
    Signup.setBounds(600,350,250,30);
    Signup.setBackground(new Color(255, 255, 255, 255));
    Signup.setFont(new Font("Open Sauce",Font.BOLD,18));
    Signup.setForeground(Color.black);
    Signup.setBorder(BorderFactory.createLineBorder(new Color(97,131,192),2,true));
    Signup.addActionListener(this);
    image.add(Signup);

    exit = new JButton("Exit");
    exit.setBounds(450,450,250,30);
    exit.setBackground(new Color(255, 255, 255, 255));
    exit.setFont(new Font("Open Sauce",Font.BOLD,18));
    exit.setForeground(Color.black);
    exit.setBorder(BorderFactory.createLineBorder(new Color(97,131,192),2,true));
    exit.addActionListener(this);
    image.add(exit);


    setUndecorated(true);
    setVisible(true);

}
public void actionPerformed(ActionEvent dj)
{
  if(dj.getSource()==Login)
  {
      setVisible(false);
      new login();
  }
  else if (dj.getSource()==Signup)
  {
      setVisible(false);
      new signup();
  } else if (dj.getSource()==exit) {
      System.exit(0);
  }
}

public static void main(String[] args)
{
        new bg();
    }
}
