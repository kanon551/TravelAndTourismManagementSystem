
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JRadioButton;


public class UpdateCustomer extends JFrame implements ActionListener {
    JPanel p2;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Choice c1;
    JButton b1,b2;
    JRadioButton r1,r2,r3;
    //private AddCustomer addcustomer;
    
    String user;
    String id;
    String id_number;
    String namee;
    String gender;
    String country;
    String address;
    String number;
    String favPlace;
    
    private Login login;
    
    UpdateCustomer()
    {
        
    }
    UpdateCustomer(Login login)
    {
        this.login = login;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(550,0,350,400);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/update_customer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,350,400);
        p1.add(l1); 
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,0,550,400);
        p2.setBackground(Color.WHITE);
        add(p2);
        //setVisible(true);
        
        JLabel l11 = new JLabel("Update Customer Details");
        l11.setBounds(20,15,300,22);
        l11.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        l11.setForeground(Color.GREEN);
        p2.add(l11);
        
        JLabel l2 = new JLabel("Username / Email");
        l2.setBounds(20,65,200,18);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(200,65,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        // t1.setText(login.getuser());
        
         JLabel l3 = new JLabel("ID");
        l3.setBounds(20,100,200,18);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l3);
        
        t2 = new JTextField();
        t2.setBounds(200,100,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
//        c1 = new Choice();
//        c1.add("        AADHAR CARD");
//        c1.setForeground(new Color(133,193,233));
//        c1.add("            PAN CARD");
//        c1.add("        RATION CARD");
//        c1.setBounds(200,65,200,20);
//        p2.add(c1);
        
         JLabel l4 = new JLabel("ID Number");
        l4.setBounds(20,135,200,18);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l4);
        
        t3 = new JTextField();
        t3.setBounds(200,135,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);
        
         JLabel l5 = new JLabel("Name");
        l5.setBounds(20,170,200,18);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l5);
        
        t4 = new JTextField();
        t4.setBounds(200,170,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);
        
        JLabel l6 = new JLabel("Gender");
        l6.setBounds(20,205,200,18);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l6);
        
        t5 = new JTextField();
        t5.setBounds(200,205,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t5);
        
//         r1 = new JRadioButton("PROUD LGBTQI");
//        r1.setBounds(200,170,200,20);
//        r1.setBackground(Color.WHITE);
//        p2.add(r1);
//        
//        r2 = new JRadioButton("MALE");
//        r2.setBounds(200,205,70,20);
//        r2.setBackground(Color.WHITE);
//        p2.add(r2);
//
//        r3 = new JRadioButton("FEMALE");
//        r3.setBounds(280,205,100,20);
//        r3.setBackground(Color.WHITE);
//        p2.add(r3);
        
        JLabel l7 = new JLabel("Country");
        l7.setBounds(20,240,200,18);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l7);
       
        t6 = new JTextField();
        t6.setBounds(200,240,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t6);
        
        JLabel l8 = new JLabel("Address");
        l8.setBounds(20,275,200,18);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l8);
        
        t7 = new JTextField();
        t7.setBounds(200,275,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t7);
        
        JLabel l9 = new JLabel("Mobile");
        l9.setBounds(20,305,200,18);
        l9.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l9);
        
        t8 = new JTextField();
        t8.setBounds(200,305,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t8);
        
        JLabel l10 = new JLabel("Favorite Place");
        l10.setBounds(20,345,200,18);
        l10.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l10);
        
        t9 = new JTextField();
        t9.setBounds(200,345,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t9);
        
        b1 = new JButton("UPDATE");
        b1.setBounds(180, 370,100,25);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);
        
         b2 = new JButton("BACK");
        b2.setBounds(330, 370,100,25);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b2);
        
        
       // System.out.println(login.getuser());
        user = login.getuser();
        namee = login.getname();
        number = login.getnumber();
        
        t1.setText(user);
       
        t4.setText(namee);
       
        t8.setText(number);
        
        try
           {
              Conn c = new Conn();
               String qry = "SELECT `Id`,`Id_Number`,`Gender`,`Country`,`Address`,`Favorite_Place` FROM `add_customer` WHERE `Username_Email` = '"+t1.getText()+"' AND `Name`='"+t4.getText()+"' AND `Mobile`='"+t8.getText()+"' ";
               ResultSet rs = c.s.executeQuery(qry);
               while(rs.next())
               {
//                   
                   
//                   t2.setText(rs.getString("Id"));
//                   t3.setText(rs.getString("Id_Number"));
//                   t5.setText(rs.getString("Gender"));
//                   t6.setText(rs.getString("Country"));
//                   t7.setText(rs.getString("Address"));
//                   t9.setText(rs.getString("Favorite_Place"));
                   id = rs.getString("Id");
                   t2.setText(id);
                   id_number = rs.getString("Id_Number");
                    t3.setText(id_number);
                   gender = rs.getString("Gender");
                    t5.setText(gender);
                   country = rs.getString("Country");
                   t6.setText(country);
                   address = rs.getString("Address");
                   t7.setText(address);
                   favPlace = rs.getString("Favorite_Place");
                   t9.setText(favPlace);
               }
               //t2.setText(rs.first);
           }
           catch(Exception e)
           {
               
           }
        
    }
    
     public void actionPerformed(ActionEvent ae)
    {
       
        if(ae.getSource()==b1)
        {
//            String Username_Email = t1.getText();
//            String Id = c1.getSelectedItem();
//            String Id_Number = t2.getText();
//            String Name = t3.getText();
//            String radio = null;
//               if(r1.isSelected())
//               {
//                   radio = "Proud LGBTQI";
//               }
//               else if(r2.isSelected())
//               {
//                   radio = "Male";
//               }
//               else if(r3.isSelected())
//               {
//                          radio = "Female"; 
//               }
//            String Country = t4.getText();
//            String Address = t5.getText();
//            String Mobile = t6.getText();
//            String Favorite_Place = t7.getText();
            
           Conn c = new Conn();
           
           
            
           // String query = "UPDATE INTO `add_customer`(`Username_Email`, `Id`, `Id_Number`, `Name`, `Gender`, `Country`, `Address`, `Mobile`, `Favorite_Place`)VALUES ('"+Username_Email+"','"+Id+"','"+Id_Number+"','"+Name+"','"+radio+"','"+Country+"','"+Address+"','"+Mobile+"','"+Favorite_Place+"')";
           String query =  "UPDATE `add_customer` SET `Username_Email`='"+t1.getText()+"',`Id`='"+t2.getText()+"',`Id_Number`='"+t3.getText()+"',`Name`='"+t4.getText()+"',`Gender`='"+t5.getText()+"',`Country`='"+t6.getText()+"',`Address`='"+t7.getText()+"',`Mobile`='"+t8.getText()+"',`Favorite_Place`='"+t9.getText()+"' WHERE `Username_Email` = '"+user+"' AND `Name`='"+namee+"' AND `Mobile`='"+number+"'  ";
            try{
                
                
                //Execute Query
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
                this.setVisible(false);
                 new DashBoard(login).setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println("There is errror"+e);
            }
            
        }
        if(ae.getSource()==b2)
        {
            this.setVisible(false);
            new DashBoard(login).setVisible(true);
        }
    }
    
    public static void main(String[]  args)
    {
           new UpdateCustomer().setVisible(true);
    }
    
}




