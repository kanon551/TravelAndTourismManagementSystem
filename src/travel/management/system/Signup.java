
package travel.management.system;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Signup extends JFrame implements ActionListener{
    
    
    JButton b1,b2;
    JTextField t1,t2,t3,t4,t5,t6;
    Choice c1;

    Signup()
    {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        //setUndecorated(true);
        
        JPanel p1 = new JPanel();
       // p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0,0,900,400);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/signup2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,900,400);
        p1.add(l1);
        
        JLabel l2 = new JLabel("Name");
        l2.setForeground(Color.WHITE);
        l2.setBounds(50,30,150,15);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l2);
      
        t1 = new JTextField();
        t1.setBounds(50,50,150,15);
        t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t1);
        
         JLabel l3 = new JLabel("Username / Email ");
        l3.setForeground(Color.WHITE);
        l3.setBounds(50,80,150,15);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l3);
      
        t2 = new JTextField();
        t2.setBounds(50,100,150,15);
        t2.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t2);
        
         JLabel l4 = new JLabel("Mobile Number");
        l4.setForeground(Color.WHITE);
        l4.setBounds(50,130,150,15);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l4);
      
        t3 = new JTextField();
        t3.setBounds(50,150,150,15);
        t3.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t3);
        
        JLabel l5 = new JLabel("Password");
        l5.setForeground(Color.WHITE);
        l5.setBounds(50,180,150,15);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l5);
      
        t4 = new JTextField();
        t4.setBounds(50,200,150,15);
        t4.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t4);
        
        JLabel l6 = new JLabel("Passport Number");
        l6.setForeground(Color.WHITE);
        l6.setBounds(50,230,150,15);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l6);
      
        t5 = new JTextField();
        t5.setBounds(50,250,150,15);
        t5.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t5);
        
        JLabel l7 = new JLabel("Security Question");
        l7.setForeground(Color.WHITE);
        l7.setBounds(50,280,150,15);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l7);
        
        c1 = new Choice();
        c1.add("Your Date of Birth");
        c1.setForeground(new Color(133,193,233));
        c1.add("Your Nickname");
        c1.setBounds(50,300,150,15);
        l1.add(c1);
        
        JLabel l8 = new JLabel("Answer");
        l8.setForeground(Color.WHITE);
        l8.setBounds(50,330,150,15);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l8);
        
        t6 = new JTextField();
        t6.setBounds(50,350,150,15);
        t6.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t6);
        
        b1 = new JButton("Create");
        b1.setBounds(250, 377,100,25);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        b1.addActionListener(this);
       // b1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(805, 0,100,25);
        b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        b2.addActionListener(this);
        // b2.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b2);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b1)
        {
            String name = t1.getText();
            String email = t2.getText();
            String number = t3.getText();
            //long num = Long.parseLong(number);
           // Long number =   9505823427L;
            //JTextField number = t3;
            String password = t4.getText();
            String passport = t5.getText();
            String security = c1.getSelectedItem();
            String answer = t6.getText();
            
           // String query = "insert into signup(Name,Username_Email,Number,Password,Passport_Number,Security,Answer) values('"+name+"','"+email+"','"+number+"','"+password+"','"+passport+"','"+security+"','"+answer+"')";
            String query = "insert into signup(Name,Username_Email,Number,Password,Passport_Number,Security,Answer) values('"+name+"','"+email+"','"+number+"','"+password+"','"+passport+"','"+security+"','"+answer+"')";
           //String query = "insert into signup(Name,Username_Email,Number,Password,Passport_Number,Security,Answer) VALUES(108,'"+name+"',"krimore@gmail.com","7406447857","dbckdbcvc589","N9999999","Your date of Birth","23/03/1997")
           //String query = "insert into signup values(60,'"+email+"','"+name+"','"+number+"','"+password+"','"+passport+"','"+security+"','"+answer+"')";
          //  long queue = "insert into signup(Number) values('"+num+"')";
           //String query = "insert into signup values('"+name+"')";
            try{
                Conn c = new Conn();
                
                //Execute Query
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account Created Successfully");
                this.setVisible(false);
            new Login().setVisible(true);
            }
            catch(Exception e)
            {
                System.out.println("There is errror"+e);
            }
        }
        
        
        if(ae.getSource()== b2)
        {
            this.setVisible(false);
            new Login().setVisible(true);
            
        }
    }
    
    public static void main (String[] args)
    {
        new Signup();
    }
    
}

