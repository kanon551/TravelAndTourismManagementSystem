
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JRadioButton;

public class bookPackage extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JButton b1,b2,b3;
    Choice c1;
    JTextField t2;
    private Login login;
    
    bookPackage()
    {
        
    }
    
    bookPackage(Login login)
    {
        this.login = login;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0,0,900,400);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/bookpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,900,400);
        p1.add(l1); 
        
         l9 = new JLabel("Pack Your Bags Now");
        l9.setBounds(520,10,250,30);
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("SAN_SERIF", Font.BOLD,25));
        l1.add(l9);
        
        l3 = new JLabel(": Username / Email");
        l3.setBounds(700,50,200,15);
        //l3.setForeground(Color.WHITE);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l3);
        
        l9 = new JLabel();
        l9.setBounds(490,50,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(l9);
        
        l4 = new JLabel(": Select Package");
        l4.setBounds(650,80,200,15);
        //l4.setForeground(Color.WHITE);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l4);
        
        c1 = new Choice();
        c1.add("Gold Package");
        c1.setForeground(new Color(133,193,233));
        c1.add("Silver Package");
        c1.add("Platinum Package");
        c1.setBounds(490,80,150,25);
        l1.add(c1);
        
        t2 = new JTextField();
        t2.setBounds(490,110,50,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(t2);
        
        l5 = new JLabel(": Total Persons");
        l5.setBounds(540,110,200,15);
        //l5.setForeground(Color.WHITE);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l5);
        
        l10 = new JLabel();
        l10.setBounds(750,110,100,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(l10);
        
        l6 = new JLabel("Mobile :");
        l6.setBounds(680,110,110,15);
        //l5.setForeground(Color.WHITE);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l6);
        
         l7 = new JLabel(": Passport Number");
        l7.setBounds(700,140,200,15);
        //l3.setForeground(Color.WHITE);
        l7.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l7);
        
        l11 = new JLabel();
        l11.setBounds(490,140,200,25);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(l11);
        
         l8 = new JLabel(": Total Price in ₹ ");
        l8.setBounds(700,175,200,15);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("SAN_SERIF", Font.PLAIN,15));
        l1.add(l8);
        
        l12 = new JLabel();
        l12.setBounds(490,175,200,25);
        l12.setForeground(Color.RED);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(l12);
        
        b1 = new JButton("Check Price");
        b1.setBounds(500, 350,125,25);
        b1.setBackground(new Color(0,0,0,65));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b1);
        
        b2 = new JButton("Book Package");
        b2.setBounds(700, 350,125,25);
        b2.setBackground(new Color(0,0,0,65));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b2);
        
        b3 = new JButton("<");
        b3.setBounds(850, 180,50,150);
        b3.setBackground(new Color(0,0,0,65));
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("SAN_SERIF", Font.BOLD,25));
        b3.addActionListener(this);
        b3.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b3);
        
        try
        {
            l9.setText(login.getuser());
            l10.setText(login.getnumber());
            t2.setText("1");
            Conn c = new Conn();
            
            String ql = "SELECT `Passport_Number` FROM `signup` WHERE `Username_Email`='"+l9.getText()+"' AND `Number` = '"+l10.getText()+"' ";
            ResultSet rs = c.s.executeQuery(ql);
            rs.first();
            l11.setText(rs.getString("Passport_Number"));
        }
        catch(Exception e)
        {
            
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            int j = Integer.parseInt(t2.getText());
            if(c1.getSelectedItem()=="Gold Package")
            {
                l12.setText(String.valueOf(12000 * j) );
            }
            
            if(c1.getSelectedItem() =="Silver Package" )
            {
                l12.setText(String.valueOf(18000 * j) );
            }
            
            if(c1.getSelectedItem() == "Platinum Package" )
            {
                l12.setText(String.valueOf(24000 * j) );
            }
        }
        
        if(ae.getSource() == b2)
        {
//             
            try
            {
                Conn c = new Conn();
                String query = "INSERT INTO `book_package`(`Username_Email`, `Select_Package`, `Total_Persons`, `Mobile`, `Passport_Number`, `Total_Price`) VALUES ('"+l9.getText()+"','"+c1.getSelectedItem()+"','"+t2.getText()+"','"+l10.getText()+"','"+l11.getText()+"','"+l12.getText()+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
              // r.first();
              // l11.setText(r.getString("Passport_Number"));
            }
            catch(Exception e)
            {
                
            }
            
        }
        if(ae.getSource() == b3)
            {
                this.setVisible(false);
            }
    }
    
public static void main(String[] args)
{
new bookPackage().setVisible(true);
}

}
