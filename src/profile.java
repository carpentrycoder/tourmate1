import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class profile extends JFrame implements ActionListener
{
   JButton b1,b2,b3;
    String Sname, Saadhar, SphoneNo, Saddress, Sbldgrp, Sgender, Sdob;
    int x = 80;
    int txtX = 250;
    int txtWidth = 200;
    int txtHeight = 40;

    Font font = new Font("Tahoma", Font.BOLD,20);
    Font fontTxt = new Font("Tahoma", Font.PLAIN,20);
    Color txt = (new Color(0xE6E6EC));
    JRadioButton male, female;
    JDateChooser dob ;
    JButton adddata;
    JComboBox bldGrp;
    JTextField name, address, aadhar, phoneNo;
    JLabel  phoneNo1,aadhar1,address1,bldgrp1,gender1,name1;
    profile()
    {
        ImageIcon logo = new ImageIcon(getClass().getClassLoader().getResource("icons/profile1.png"));
        setIconImage(logo.getImage());

        setSize(370,250);

        setLocation(1000,85);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/profilebg.png"));
        Image i2 = i1.getImage().getScaledInstance(350,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        add(i4);

        ImageIcon p1 = new ImageIcon("\\tourmate1\\src\\icons\\probutns1.png");
        b1 = new JButton(p1);//show
        b1.setLayout(null);
        b1.setBounds(11,14,333,52);
        b1.setBackground(new Color(0xFFFFFFFF, true));
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        i4.add(b1);

        ImageIcon p2 = new ImageIcon("\\tourmate1\\src\\icons\\probutns2.png");
        b2 = new JButton(p2);//update
        b2.setLayout(null);
        b2.setBounds(11,70,333,52);
        b2.setBackground(new Color(0xFFFFFFFF, true));
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        i4.add(b2);

        ImageIcon p3 = new ImageIcon("\\tourmate1\\src\\icons\\probutns3.png");
        b3 = new JButton(p3);//delete
        b3.setLayout(null);
        b3.setBounds(11,128,333,52);
        b3.setBackground(new Color(0xFFFFFFFF, true));
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        i4.add(b3);

        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent k) {
        if(k.getSource()==b1)
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

            name1 = new JLabel();
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
        else if (k.getSource()==b2)
        {

            JFrame Add = new JFrame();
            Add.setSize(550, 650);
            Add.getContentPane().setBackground(new Color(0x001729));
            ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/Update_Details.png"));
            Image k2 = k1.getImage().getScaledInstance(550, 600, Image.SCALE_DEFAULT);
            ImageIcon k3 = new ImageIcon(k2);
            JLabel image = new JLabel(k3);
            Add.add(image);

            JLabel l1  = new JLabel("Name");
            l1.setBounds(x,70,150,40);
            l1.setFont(font);
            l1.setForeground(txt);
            image.add(l1);

            JLabel q1  = new JLabel("NOTE: IF YOU DON'T FILLED YOUR DETAILS HERE FILL FIRST ");
            q1.setBounds(50,570,500,40);
            q1.setFont(new Font("Tahoma", Font.PLAIN,14));
            q1.setForeground(Color.red);
            image.add(q1);

            JLabel l2  = new JLabel("Aadhar");
            l2.setBounds(x,130,150,40);
            l2.setFont(font);
            l2.setForeground(txt);
            image.add(l2);

            JLabel l3  = new JLabel("D.O.B");
            l3.setBounds(x,190,150,40);
            l3.setFont(font);
            l3.setForeground(txt);
            image.add(l3);

            JLabel l4  = new JLabel("Gender");
            l4.setBounds(x,250,150,40);
            l4.setFont(font);
            l4.setForeground(txt);
            image.add(l4);

            JLabel l5  = new JLabel("Address");
            l5.setBounds(x,310,150,40);
            l5.setFont(font);
            l5.setForeground(txt);
            image.add(l5);

            JLabel l6  = new JLabel("Phone No");
            l6.setBounds(x,370,150,40);
            l6.setFont(font);
            l6.setForeground(txt);
            image.add(l6);

            JLabel l7  = new JLabel("Blood Grp");
            l7.setBounds(x,430,150,40);
            l7.setFont(font);
            l7.setForeground(txt);
            image.add(l7);


            name = new JTextField();
            name.setBounds(txtX, 70,  txtWidth,txtHeight);
            name.setFont(fontTxt);
            image.add(name);

            aadhar = new JTextField();
            aadhar.setBounds(txtX, 130,  txtWidth,txtHeight);
            aadhar.setFont(fontTxt);
            image.add(aadhar);

            address = new JTextField();
            address.setBounds(txtX, 310,  txtWidth,txtHeight);
            address.setFont(fontTxt);
            image.add(address);

            phoneNo = new JTextField();
            phoneNo.setBounds(txtX, 370,  txtWidth,txtHeight);
            phoneNo.setFont(fontTxt);
            image.add(phoneNo);

            //dob calender
            dob = new JDateChooser();
            dob.setBounds(txtX, 190, txtWidth, txtHeight);
            dob.setFont(fontTxt);
            image.add(dob);

            ButtonGroup btn = new ButtonGroup();

            male = new JRadioButton("Male");
            male.setBounds(txtX, 250, txtWidth/2, txtHeight);
            male.setFont(fontTxt);
            btn.add(male);
            image.add(male);

            female = new JRadioButton("Female");
            female.setBounds(txtX+120, 250, txtWidth/2, txtHeight);
            female.setFont(fontTxt);
            btn.add(female);
            image.add(female);

            String [] arr = {"A+", "AB+","O+","O-","AB-"};
            bldGrp = new JComboBox(arr);
            bldGrp.setBounds(txtX,430, txtWidth,txtHeight );
            bldGrp.setFont(fontTxt);
            image.add(bldGrp);

            adddata = new JButton("Add Details");
            adddata.setBorder(BorderFactory.createEmptyBorder());
            adddata.setBounds(200,500,150,40);
            adddata.setFont(font);
            adddata.setBackground(new Color(0x880509));
            adddata.setForeground(new Color(0xF9F8FC));
            adddata.addActionListener(this);
            image.add(adddata);

            Add.setLocationRelativeTo(null);
            Add.setVisible(true);

        } else if (k.getSource()==adddata)
        {
             Sname =  this.name.getText();
             Saadhar = this.aadhar.getText();
             SphoneNo = this.phoneNo.getText();
             Saddress = this.address.getText();

             Sbldgrp = (String)this.bldGrp.getSelectedItem();

             Sgender = null;
            if(male.isSelected()){
                Sgender = "Male";
            }
            else if(female.isSelected()){
                Sgender = "Female";
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            Sdob = dateFormat.format(this.dob.getDate());

            conn c = new conn();

            String query = "insert into umeshnager.details (Username, Aadhar, Birth_date, Address, phoneNo, Blood_Group, gender) values ('"+Sname+"','"+Saddress+"','"+SphoneNo+"', '"+Saadhar+"','"+Sdob+"','"+Sgender+"','"+Sbldgrp+"')";

            try{
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Added Successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }

        } else if (k.getSource()==b3)
        {
            try {
                int option = JOptionPane.showConfirmDialog(null, "Do you want to delete your profile?", "Delete", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    String nameString = "user.txt";
                    String passString = "pass.txt";

                    try (BufferedReader reader1 = new BufferedReader(new FileReader("user.txt"));
                         BufferedReader reader2 = new BufferedReader(new FileReader("pass.txt"))) {

                        nameString = reader1.readLine();
                        passString = reader2.readLine();

                        if (nameString != null) {
                            System.out.println("Stored string: " + nameString);
                            System.out.println("Stored string: " + passString);

                            try {
                                // Check if the record exists before attempting deletion
                                String checkQuery = "SELECT * FROM account WHERE Username = '" + nameString + "' AND Password = '" + passString + "'";
                                conn checkConn = new conn();
                                ResultSet resultSet = checkConn.s.executeQuery(checkQuery);
                                if (resultSet.next()) {
                                    // The record exists, proceed with deletion
                                    String deleteQuery = "DELETE FROM account WHERE Username = '" + nameString + "' AND Password = '" + passString + "'";
                                    conn deleteConn = new conn();
                                    int rowsAffected = deleteConn.s.executeUpdate(deleteQuery);

                                    if (rowsAffected > 0) {
                                        JOptionPane.showMessageDialog(null, "Profile deleted successfully!");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Deletion failed. Please try again.");
                                    }
                                } else {
                                    // The record does not exist
                                    JOptionPane.showMessageDialog(null, "No matching profile found. Deletion failed.");
                                }
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error occurred: " + e.getMessage());
                                e.printStackTrace();
                            }

                        } else {
                            System.out.println("No string stored yet.");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error occurred: " + e.getMessage());
                e.printStackTrace();
            }

        }
        }


    public static void main(String[] args) {
        new profile();
    }
}
