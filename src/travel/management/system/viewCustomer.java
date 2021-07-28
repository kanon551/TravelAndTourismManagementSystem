
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JRadioButton;


public class viewCustomer extends JFrame implements ActionListener {
  
    JPanel p2;
    //JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    JLabel l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
    Choice c1;
    JButton b1,b2;
    private Login login;
   // private UpdateCustomer updatecustomer;

    viewCustomer()
    {
        
    }
    
    public viewCustomer(Login login)
    {
        this.login = login;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0,250,900,150);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(100,0,700,150);
        p1.add(l1); 
        
         p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,0,900,250);
        p2.setBackground(Color.WHITE);
        add(p2);
        
        l11 = new JLabel(" View Customer Details");
        l11.setBounds(20,15,300,22);
        l11.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        l11.setForeground(Color.BLUE);
        p2.add(l11);
        
        l2 = new JLabel("Name");
        l2.setBounds(20,50,200,15);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l2);
        
        l13 = new JLabel();
        l13.setBounds(150,50,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l13);
        
        l3 = new JLabel("Username / Email");
        l3.setBounds(450,50,200,15);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l3);
        
        l14 = new JLabel();
        l14.setBounds(580,50,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l14);
        
        l4 = new JLabel("Mobile");
        l4.setBounds(20,85,200,15);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l4);
        
        l15 = new JLabel();
        l15.setBounds(150,85,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l15);
        
        l5 = new JLabel("Passport Number");
        l5.setBounds(450,85,200,15);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l5);
        
        l16 = new JLabel();
        l16.setBounds(580,85,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l16);
        
        l6 = new JLabel("Idenity");
        l6.setBounds(20,120,200,15);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l6);
        
        l17 = new JLabel();
        l17.setBounds(150,120,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l17);
        
        l7 = new JLabel("Id Number");
        l7.setBounds(450,120,200,15);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l7);
        
        l18= new JLabel();
        l18.setBounds(580,120,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l18);
        
        l8 = new JLabel("Gender");
        l8.setBounds(20,155,200,15);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l8);
        
        l19 = new JLabel();
        l19.setBounds(150,155,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l19);
        
        l9 = new JLabel("Country");
        l9.setBounds(450,155,200,15);
        l9.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l9);
        
        l20 = new JLabel();
        l20.setBounds(580,155,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l20);
        
        l10 = new JLabel("Address");
        l10.setBounds(20,190,200,15);
        l10.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l10);
        
        l21 = new JLabel();
        l21.setBounds(150,190,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l21);
        
        l12 = new JLabel("Favorite Place");
        l12.setBounds(450,190,200,15);
        l12.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        p2.add(l12);
        
        l22 = new JLabel();
        l22.setBounds(580,190,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(l22);
        
        b1 = new JButton("<");
        b1.setBounds(365, 220,100,25);
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font("SAN_SERIF", Font.BOLD,30));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);
        
        try
        {
            l13.setText(login.getname());
            l14.setText(login.getuser());
            l15.setText(login.getnumber());
            
            Conn c = new Conn();
            String ql = "SELECT `Passport_Number` FROM `signup` WHERE `Username_Email`='"+l14.getText()+"' AND `Name`= '"+l13.getText()+"' AND `Number` = '"+l15.getText()+"' ";
            ResultSet rs = c.s.executeQuery(ql);
            rs.first();
            l16.setText(rs.getString("Passport_Number"));
            
            String qry = "SELECT `Id`,`Id_Number`,`Gender`,`Country`,`Address`,`Favorite_Place` FROM `add_customer` WHERE `Username_Email` = '"+l14.getText()+"' AND `Name`='"+l13.getText()+"' AND `Mobile`='"+l15.getText()+"' ";
            ResultSet res = c.s.executeQuery(qry);
               while(res.next())
               {
//                   
                   
                   l17.setText(res.getString("Id"));
                   l18.setText(res.getString("Id_Number"));
                   l19.setText(res.getString("Gender"));
                   l20.setText(res.getString("Country"));
                   l21.setText(res.getString("Address"));
                   l22.setText(res.getString("Favorite_Place"));
//                   id = rs.getString("Id");
//                   t2.setText(id);
//                   id_number = rs.getString("Id_Number");
//                    t3.setText(id_number);
//                   gender = rs.getString("Gender");
//                    t5.setText(gender);
//                   country = rs.getString("Country");
//                   t6.setText(country);
//                   address = rs.getString("Address");
//                   t7.setText(address);
//                   favPlace = rs.getString("Favorite_Place");
//                   t9.setText(favPlace);
               }
        }
        catch(Exception e)
        {
            
        }
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            this.setVisible(false);
            new DashBoard(login).setVisible(true);
        }
    }
    
    public static void main(String[] args)
{
       new viewCustomer().setVisible(true);
}  
}

