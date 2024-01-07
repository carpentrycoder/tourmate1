import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class addDetails extends JFrame implements ActionListener {

    int x = 80;
    int txtX = 250;
    int txtWidth = 200;
    int txtHeight = 40;

    Font font = new Font("Tahoma", Font.BOLD,20);
    Font fontTxt = new Font("Tahoma", Font.PLAIN,20);
    Color txt = (new Color(0xE6E6EC));

    JRadioButton male, female;
    JDateChooser dob ;
    JButton add;
    JComboBox bldGrp;
    JTextField name, address, aadhar, phoneNo;
    addDetails(){

        setSize(550, 650);
        getContentPane().setBackground(new Color(0x001729));
        ImageIcon k1 = new ImageIcon(ClassLoader.getSystemResource("icons/Update_Details.png"));
        Image k2 = k1.getImage().getScaledInstance(550, 600, Image.SCALE_DEFAULT);
        ImageIcon k3 = new ImageIcon(k2);
        JLabel image = new JLabel(k3);
        add(image);

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

//        dob calender

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


        add = new JButton("Add Details");
        add.setBorder(BorderFactory.createEmptyBorder());
        add.setBounds(200,500,150,40);
        add.setFont(font);
        add.setBackground(new Color(0x880509));
        add.setForeground(new Color(0xF9F8FC));
        add.addActionListener(this);
        image.add(add);

//        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==add){
            String name =  this.name.getText();
            String aadhar = this.aadhar.getText();
            String phoneNo = this.phoneNo.getText();
            String address = this.address.getText();

            String bldgrp = (String)this.bldGrp.getSelectedItem();

            String gender = null;
            if(male.isSelected()){
                gender = "Male";
            }
            else if(female.isSelected()){
                gender = "Female";
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
            String dob = dateFormat.format(this.dob.getDate());

            conn c = new conn();

            String query = "insert into umeshnager.details (Username, Aadhar, Birth_date, Address, phoneNo, Blood_Group, gender) values ('"+name+"','"+address+"','"+phoneNo+"', '"+aadhar+"','"+dob+"','"+gender+"','"+bldgrp+"')";

            try{
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Data Added Successfully!");
            }catch (Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Some error occured :(");
            }

        }

    }


    public static void main(String[] args) {
        new addDetails();
    }
}