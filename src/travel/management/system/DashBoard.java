
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.event.*;


public class DashBoard extends JFrame implements ActionListener {
    
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    JPanel p2;
    private Login login;
    
public DashBoard()
{
   
}

DashBoard(Login login){
    
    this.login = login;
setExtendedState(JFrame.MAXIMIZED_BOTH);
setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0,0,1550,65);
        p1.setBackground(Color.WHITE);
        add(p1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,800);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/wine2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(50,0,150,65);
        p1.add(l2);
        
        

        JLabel l3 = new JLabel("Travel Management System");
        l3.setForeground(Color.BLACK);
        //l3.setBorder(new LineBorder(Color.BLACK));
        l3.setBounds(200,0,700,45);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,30));
        p1.add(l3);
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,700,1550,110);
        p2.setBackground(Color.WHITE);
        l1.add(p2);
        
        b1 = new JButton("Add Personal Details");
        b1.setBounds(20, 750, 120, 30);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b1.setForeground(Color.BLACK);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        l1.add(b1);
        
        b2 = new JButton("Update Personal Details");
        b2.setBounds(160, 750, 140, 30);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b2.setForeground(Color.BLACK);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        l1.add(b2);
        
        b3 = new JButton("View Details");
        b3.setBounds(310, 750, 100, 30);
        b3.setBackground(Color.WHITE);
        b3.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b3.setForeground(Color.BLACK);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        l1.add(b3);
        
        b4 = new JButton("Delete Personal Details");
        b4.setBounds(420, 750, 140, 30);
        b4.setBackground(Color.WHITE);
        b4.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b4.setForeground(Color.BLACK);
        b4.setBorder(BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        l1.add(b4);
        
        b5 = new JButton("Check Package");
        b5.setBounds(570, 750, 100, 30);
        b5.setBackground(Color.WHITE);
        b5.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b5.setForeground(Color.BLACK);
        b5.setBorder(BorderFactory.createEmptyBorder());
        b5.addActionListener(this);
        l1.add(b5);
        
        b6 = new JButton("Book Package");
        b6.setBounds(700, 750, 100, 30);
        b6.setBackground(Color.WHITE);
        b6.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b6.setForeground(Color.BLACK);
        b6.setBorder(BorderFactory.createEmptyBorder());
        b6.addActionListener(this);
        l1.add(b6);
        
         b7 = new JButton("View Package");
        b7.setBounds(830, 750, 100, 30);
        b7.setBackground(Color.WHITE);
        b7.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b7.setForeground(Color.BLACK);
        b7.setBorder(BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        l1.add(b7);
        
        
         b8 = new JButton("Payment");
        b8.setBounds(960, 750, 100, 30);
        b8.setBackground(Color.WHITE);
        b8.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b8.setForeground(Color.BLACK);
        b8.setBorder(BorderFactory.createEmptyBorder());
        b8.addActionListener(this);
        l1.add(b8);
        
        b9 = new JButton("Calculator");
        b9.setBounds(1090, 750, 100, 30);
        b9.setBackground(Color.WHITE);
        b9.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b9.setForeground(Color.BLACK);
        b9.setBorder(BorderFactory.createEmptyBorder());
        b9.addActionListener(this);
        l1.add(b9);
        
        b10 = new JButton("NotePad");
        b10.setBounds(1220, 750, 100, 30);
        b10.setBackground(Color.WHITE);
        b10.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b10.setForeground(Color.BLACK);
        b10.setBorder(BorderFactory.createEmptyBorder());
        b10.addActionListener(this);
        l1.add(b10);
        
        b11 = new JButton("About");
        b11.setBounds(1350, 750, 100, 30);
        b11.setBackground(Color.WHITE);
        b11.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b11.setForeground(Color.BLACK);
        b11.setBorder(BorderFactory.createEmptyBorder());
        b11.addActionListener(this);
        l1.add(b11);
        
        b12 = new JButton("View Hotels");
        b12.setBounds(570, 710, 100, 30);
        b12.setBackground(Color.WHITE);
        b12.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b12.setForeground(Color.BLACK);
        b12.setBorder(BorderFactory.createEmptyBorder());
        b12.addActionListener(this);
        l1.add(b12);
        
        b13 = new JButton("Book Hotel");
        b13.setBounds(700, 710, 100, 30);
        b13.setBackground(Color.WHITE);
        b13.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b13.setForeground(Color.BLACK);
        b13.setBorder(BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        l1.add(b13);
        
         b14 = new JButton("View Booked Hotels");
        b14.setBounds(820, 710, 120, 30);
        b14.setBackground(Color.WHITE);
        b14.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b14.setForeground(Color.BLACK);
        b14.setBorder(BorderFactory.createEmptyBorder());
        //b1.addActionListener(this);
        l1.add(b14);
        
        
         b15 = new JButton("Destinations");
        b15.setBounds(960, 710, 100, 30);
        b15.setBackground(Color.WHITE);
        b15.setFont(new Font("SAN_SERIF", Font.PLAIN,12));
        b15.setForeground(Color.BLACK);
        b15.setBorder(BorderFactory.createEmptyBorder());
        b15.addActionListener(this);
        l1.add(b15);




setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()== b1)
    {
        this.setVisible(false);
         new AddCustomer(login).setVisible(true);
    }
    
     if(ae.getSource()== b2)
    {
        this.setVisible(false);
         new UpdateCustomer(login).setVisible(true);
    }
     if(ae.getSource()== b3)
    {
        this.setVisible(false);
         new viewCustomer(login).setVisible(true);
    }
        if(ae.getSource()== b5)
    {
        //this.setVisible(false);
         new checkPackage().setVisible(true);
    }
    if(ae.getSource()== b6)
    {
        //this.setVisible(false);
         new bookPackage(login).setVisible(true);
    }
    
    if(ae.getSource()== b8)
    {
        //this.setVisible(false);
         new Payment().setVisible(true);
    }
     if(ae.getSource()== b11)
    {
        //this.setVisible(false);
         new About().setVisible(true);
    }
     if(ae.getSource()== b12)
    {
        //this.setVisible(false);
         new checkHotels().setVisible(true);
    }
     if(ae.getSource()== b15)
    {
        //this.setVisible(false);
         new Destinations().setVisible(true);
    }
    
        if(ae.getSource() == b9)
        {
           try
           {
               Runtime.getRuntime().exec("Calc.exe");
           }
           catch(Exception e){ }
        }
        else if(ae.getSource() == b10)
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e){}
         }
}

public static void main(String[] args){
DashBoard dashboard = new DashBoard();
}
    
}
