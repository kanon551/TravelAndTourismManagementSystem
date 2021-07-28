
package travel.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class About extends JFrame implements ActionListener{
    JButton b1;
    About()
    {
        setBounds(0,0,1550,800);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/book.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,800);
        add(l1);
        
        JLabel l2= new JLabel("Lakshmi Pavani");
         l2.setForeground(Color.WHITE);
        //l3.setBorder(new LineBorder(Color.BLACK));
        l2.setBounds(600,400,700,45);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,45));
        l1.add(l2);
        
         b1 = new JButton("<");
        b1.setBounds(1400, 180,50,300);
        b1.setBackground(new Color(0,0,0,65));
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("SAN_SERIF", Font.BOLD,25));
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        l1.add(b1);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
        {
            this.setVisible(false);
        }
        
        
    }
    public static void main(String[] args)
    {
        new About().setVisible(true);
    }
}
