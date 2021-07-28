
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Payment extends JFrame implements ActionListener {
 
    JButton b1,b2;
    Payment()
    {
        setBounds(400,200,900,400);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(700, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(150,0,600,300);
        add(l1); 
        
        b1 = new JButton("PAYMENT");
        b1.setBounds(390, 300,125,25);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        add(b1);
        
        b2 = new JButton("<");
        b2.setBounds(850, 100,50,150);
        b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("SAN_SERIF", Font.BOLD,25));
        b2.addActionListener(this);
        b2.setBorder(BorderFactory.createEmptyBorder());
        add(b2);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            this.setVisible(false);
            new Paytm().setVisible(true);
        }
        if(ae.getSource() == b2)
        {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Payment().setVisible(true);
    }
}
