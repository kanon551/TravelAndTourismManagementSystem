
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JRadioButton;

public class AddCustomer extends JFrame implements ActionListener {
    
   // private Login login;
    JPanel p2;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    Choice c1;
    JButton b1,b2;
    JRadioButton r1,r2,r3;
    String namee;
    String user;
    String number;
    private Login login;
    
//    public AddCustomer(Login login)
//    {
//        this.login = login;
//    }
//    
    AddCustomer()
    {
       // String x = login.getuser();
    }
    
    AddCustomer(Login login)
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/addcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
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
        
        
        JLabel l2 = new JLabel("Username / Email");
        l2.setBounds(20,30,200,18);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l2);
        
        t1 = new JTextField();              // This shouldnt change
        t1.setBounds(200,30,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        // t1.setText(login.getuser());
        
         JLabel l3 = new JLabel("ID");
        l3.setBounds(20,65,200,18);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l3);
        
        c1 = new Choice();
        c1.add("        AADHAR CARD");
        c1.setForeground(new Color(133,193,233));
        c1.add("            PAN CARD");
        c1.add("        RATION CARD");
        c1.setBounds(200,65,200,20);
        p2.add(c1);
        
         JLabel l4 = new JLabel("ID Number");
        l4.setBounds(20,100,200,18);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l4);
        
        t2 = new JTextField();
        t2.setBounds(200,100,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
         JLabel l5 = new JLabel("Name");
        l5.setBounds(20,135,200,18);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l5);
        
        t3 = new JTextField();                     // This shouldnt change
        t3.setBounds(200,135,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);
        
        JLabel l6 = new JLabel("Gender");
        l6.setBounds(20,170,200,18);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l6);
        
         r1 = new JRadioButton("PROUD LGBTQI");
        r1.setBounds(200,170,200,20);
        r1.setBackground(Color.WHITE);
        p2.add(r1);
        
        r2 = new JRadioButton("MALE");
        r2.setBounds(200,205,70,20);
        r2.setBackground(Color.WHITE);
        p2.add(r2);

        r3 = new JRadioButton("FEMALE");
        r3.setBounds(280,205,100,20);
        r3.setBackground(Color.WHITE);
        p2.add(r3);
        
        JLabel l7 = new JLabel("Country");
        l7.setBounds(20,240,200,18);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l7);
       
        t4 = new JTextField();
        t4.setBounds(200,240,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);
        
        JLabel l8 = new JLabel("Address");
        l8.setBounds(20,275,200,18);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l8);
        
        t5 = new JTextField();
        t5.setBounds(200,275,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t5);
        
        JLabel l9 = new JLabel("Mobile");                  // This shouldnt change
        l9.setBounds(20,305,200,18);
        l9.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l9);
        
        t6 = new JTextField();
        t6.setBounds(200,305,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t6);
        
        JLabel l10 = new JLabel("Favorite Place");
        l10.setBounds(20,345,200,18);
        l10.setFont(new Font("SAN_SERIF", Font.PLAIN,18));
        p2.add(l10);
        
        t7 = new JTextField();
        t7.setBounds(200,345,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t7);
        
        b1 = new JButton("CREATE");
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
        t3.setText(namee);
        t6.setText(number);
       
        
        
        
       // t1.setText(x);
                
                
                
                
                
                
   
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String Username_Email = t1.getText();
            String Id = c1.getSelectedItem();
            String Id_Number = t2.getText();
            String Name = t3.getText();
            String radio = null;
               if(r1.isSelected())
               {
                   radio = "Proud LGBTQI";
               }
               else if(r2.isSelected())
               {
                   radio = "Male";
               }
               else if(r3.isSelected())
               {
                          radio = "Female"; 
               }
            String Country = t4.getText();
            String Address = t5.getText();
            String Mobile = t6.getText();
            String Favorite_Place = t7.getText();
            
            String query = "INSERT INTO `add_customer`(`Username_Email`, `Id`, `Id_Number`, `Name`, `Gender`, `Country`, `Address`, `Mobile`, `Favorite_Place`)VALUES ('"+Username_Email+"','"+Id+"','"+Id_Number+"','"+Name+"','"+radio+"','"+Country+"','"+Address+"','"+Mobile+"','"+Favorite_Place+"')";
             try{
                Conn c = new Conn();
                
                //Execute Query
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
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
    
    public static void main(String[] args)
    {
        new AddCustomer().setVisible(true);
    }

//    AddCustomer(Login aThis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

  
}
