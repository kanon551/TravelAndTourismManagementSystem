
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Logger;
import javax.swing.border.*;

public class checkPackage extends JFrame {
    JButton b1;
    JLabel l1;
    //private Login login;
//    checkPackage()
//    {
//         b1 = new JButton("<");
       
//    }
    
    checkPackage()
    {
       // this.login = login;
        setBounds(400,200,900,400);
        
        String[] package1 = new String[]{"Gold Package","Summer Special","₹ 12000/-","6 Days and 7 Nights","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drinks on Arrival", "Full Day 3 Island Cruise" ,"English Speaking Guide", "Book Now","package1.jpg"};
        String[] package2 = new String[]{"Silver Package","Winter Special","₹ 18000/-","5 Days and 6 Nights","Single Cruise with Free Massage","Meet and Greet at Airport","Every Night Free Dinner","Tribal Dance","Toll/Entrance Free " ,"English Speaking Guide", "Book Now","package2.jpg"};
        String[] package3 = new String[]{"Platinum Package","Moonsoon Special","₹ 24000/-","8 Days and 7 Nights","Free Entire Water Sports","Pick and Drop at Airport","2 Meals Included/Day","Pool Party","Surprise Gifts " ,"English Speaking Guide", "Book Now","package3.jpg"};
        
        JTabbedPane pane = new JTabbedPane();
        
        JPanel p1 = createPackage(package1);
//        JLabel l1 = new JLabel("Hello");
//        l1.setBounds(400,15,300,22);
//        l1.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
//        l1.setForeground(Color.BLUE);
//        p1.add(l1);
        pane.addTab("Package 1",null, p1);
        
        
        
        JPanel p2 = createPackage(package2);
        pane.addTab("Package 2",null,p2);
        
        JPanel p3 = createPackage(package3);
        pane.addTab("Package 3",null,p3);
        
        add(pane,BorderLayout.CENTER);
    }
    
    public JPanel createPackage(String[] pack)
    {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/"+pack[11]));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
         l1 = new JLabel(i3);
        l1.setBounds(0,0,900,400);
        p1.add(l1); 
        
        JLabel l2 = new JLabel(pack[0]);       
        l2.setBounds(50,5,300,35);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("Tahoma",Font.BOLD, 30));
        l1.add(l2);
        
         JLabel l3 = new JLabel(pack[1]);       
        l3.setBounds(350,5,300,35);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma",Font.BOLD, 30));
        l1.add(l3);
        
        JLabel l4 = new JLabel(pack[2]);       
        l4.setBounds(650,5,300,35);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma",Font.BOLD, 30));
        l1.add(l4);
        
        JLabel l5 = new JLabel(pack[3]);
        l5.setBounds(50,60,300,30);
        l5.setForeground(Color.WHITE);
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l5);
        
        JLabel l6 = new JLabel(pack[4]);
        l6.setBounds(50,100,300,30);
        l6.setForeground(Color.WHITE);
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l6);
        
        JLabel l7 = new JLabel(pack[5]);
        l7.setBounds(50,140,300,30);
        l7.setForeground(Color.WHITE);
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l7);
        
        JLabel l8 = new JLabel(pack[6]);
        l8.setBounds(50,180,300,30);
        l8.setForeground(Color.WHITE);
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l8);
        
        JLabel l9 = new JLabel(pack[7]);
        l9.setBounds(600,60,300,30);
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l9);
        
        JLabel l10 = new JLabel(pack[8]);
        l10.setBounds(625,100,300,30);
        l10.setForeground(Color.WHITE);
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l10);
        
        JLabel l11 = new JLabel(pack[9]);
        l11.setBounds(630,140,300,30);
        l11.setForeground(Color.WHITE);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l11);
        
         JLabel l12 = new JLabel(pack[10]);
        l12.setBounds(750,180,300,30);
        l12.setForeground(Color.WHITE);
        l12.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.add(l12);
        
//         b1 = new JButton("<");
//        b1.setBounds(420, 300,100,25);
//        b1.setBackground(Color.WHITE);
//        b1.setForeground(Color.BLACK);
//        b1.setFont(new Font("SAN_SERIF", Font.BOLD,30));
//        b1.addActionListener(this);
//        b1.setBorder(BorderFactory.createEmptyBorder());
//        l1.add(b1);
        
        
        return p1;
    }        
//    public void actionPerformed(ActionEvent ae)
//    {
//        if(ae.getSource() == b1)
//        {
//            this.setVisible(false);
//            new DashBoard().setVisible(true);
//        }
//    }
    
    public static void main(String[] args)
    {
        new checkPackage().setVisible(true);
   
    }
    
}
