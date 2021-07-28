
package travel.management.system;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Arrays;

public class Login extends JFrame implements ActionListener{
   JTextField t1;
   JPasswordField t2;
    JButton b1,b2,b3;
    String namee;
    String number ;
    String user;
   
    
   // String getnamee;
   
    public String getname()
    {
       return namee;
    }
    
    public String getuser()
    {
        return user;
    }
    public String getnumber()
    {
        return number;
    }

    Login()
    {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        
        
        JPanel p1 = new JPanel();
         p1.setBackground(Color.WHITE);
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0,0,450,400);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/login1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(100,120,200,200);
        p1.add(l1);
       // setVisible(true);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(450,0,450,400);
        p2.setBackground(Color.WHITE);
        add(p2);
        //setVisible(true);
        
        JLabel l2 = new JLabel("Username / Email");
        l2.setBounds(100,80,300,25);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l2);
        //setVisible(true);
        
        
        t1 = new JTextField();
        t1.setBounds(100,120,300,30);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        //setVisible(true);
        
        JLabel l3 = new JLabel("Password");
        l3.setBounds(100,160,100,25);
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        p2.add(l3);
        
        t2 = new JPasswordField();
        t2.setBounds(100,200,300,30);
        //t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        b1 = new JButton("Login");
        b1.setBounds(100, 260, 130, 30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Signup");
        b2.setBounds(270, 260, 130, 30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(new Color(133,193,233));
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("Forget Password");
        b3.setBounds(170, 330, 130, 30);
//        b2.setBackground(Color.WHITE);
//        b2.setForeground(new Color(133,193,233));
//        b2.setBorder(new LineBorder(new Color(133,193,233)));
      b3.addActionListener(this);

        p2.add(b3);
        
        JLabel l4 = new JLabel("Having Trouble Logging in ....?");
        l4.setBounds(150, 300, 200, 30);
        l4.setForeground(Color.RED);
        p2.add(l4);
        
        //String namee;
        
//        JTextField t2 = new JTextField();
//        t2.setBounds(60,60,300,30);
//        t2.setBorder(BorderFactory.createEmptyBorder());
//        p2.add(t2);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b2)
        {
            this.setVisible(false);
            new Signup().setVisible(true);
            
        }
        
        if(ae.getSource()==b3)
        {
            this.setVisible(false);
            new ForgetPassword().setVisible(true);
            
        }
        if(ae.getSource()==b1)
        {
            
            try
            {
                Conn c = new Conn();
                String sq = "SELECT `Passport_Number` FROM `signup` WHERE `Username_Email`= '"+t1.getText()+"' "; 
                String ql = "SELECT `Passport_Number` FROM `signup` WHERE `Password`= '"+(t2.getText())+"' ";
                ResultSet r = c.s.executeQuery(sq);
                r.first();
                String n = r.getString("Passport_Number");
                
                ResultSet rse = c.s.executeQuery(ql);
                rse.first();
                String ns = rse.getString("Passport_Number");
                
                String nam = "SELECT `Name` FROM `signup` WHERE `Username_Email`='"+t1.getText()+"' AND `Password`='"+(t2.getText())+"' ";
                ResultSet na = c.s.executeQuery(nam);
                na.first();
                namee = na.getString("Name");
                
                String num = "SELECT `Number` FROM `signup` WHERE `Username_Email`='"+t1.getText()+"' AND `Password`='"+(t2.getText())+"' ";
                ResultSet numb = c.s.executeQuery(num);
                numb.first();
                number = numb.getString("Number");
                
                user = t1.getText();
               // System.out.println(namee);
               
               // return namee;
              
                //System.out.println(n);
                
                if(n.equals(ns))
                {
                JOptionPane.showMessageDialog(null,"Login Credentials matched");
                this.setVisible(false);
                
                
              // AddCustomer ad = new AddCustomer(this);
               new Loading(this).setVisible(true);
                    //new AddCustomer(this);
                }
                        
               
                
            }
            catch(Exception e)
            {
                
                int error = 1;
                error = error +1;
                if(error==3)
                {
                    JOptionPane.showMessageDialog(null,"Login Credentials got "+error+"times error now.  ");
                    JOptionPane.showMessageDialog(null,"You only have 1 last chance");
                    JOptionPane.showMessageDialog(null,"If not given correctly. You are gonna loose the data permanently");
                    JOptionPane.showMessageDialog(null,"kindly try forgot password");
                    
                }
                JOptionPane.showMessageDialog(null,"Login Credentials Not Matched");
                System.out.println(e);
            }
          
        }
       
             
    }
    
    public static void main (String[] args)
    {
        new Login();
    }

//    String getUsername_Email() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    String getuser() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}

