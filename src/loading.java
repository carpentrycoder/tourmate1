import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar sutar;

    public void run()
    {
        try
    {
     for (int i=1;i<=101;i++)
     {
        int max = sutar.getMaximum(); //100
        int value = sutar.getValue();

        if(value < max)
        {
            sutar.setValue(sutar.getValue()+1);
        }
        else
        {
            setVisible(false);
            new dash();
        }
        Thread.sleep(50);
     }
    }catch (Exception e)
        {
            System.out.println(e);
        }
    }
    loading()
    {
        t = new Thread(this);
      setBounds(390,180,600,320);
      ImageIcon q1 = new ImageIcon(ClassLoader.getSystemResource("icons/Loading.png"));
      Image q2 = q1.getImage().getScaledInstance(600,320,Image.SCALE_DEFAULT);
      ImageIcon q3 = new ImageIcon(q2);
      JLabel q4 = new JLabel(q3);
      add(q4);

      JLabel n = new JLabel("Loading....");
      n.setLayout(null);
      n.setBounds(50,310,100,20);
      n.setForeground(new Color(0x000000));
      n.setFont(new Font("Atkinson Hyperlegible",Font.BOLD,18));
      q4.add(n);

      sutar = new JProgressBar();
      sutar.setBounds(50,240,500,15);
      sutar.setBackground(Color.BLACK);
      sutar.setForeground(Color.WHITE);
      sutar.setStringPainted(true);
      q4.add(sutar);

      t.start();
      setVisible(true);
    }

    public static void main(String[] args) {
        new loading();
    }
}

