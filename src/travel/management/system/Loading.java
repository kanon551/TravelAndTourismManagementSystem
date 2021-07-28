
package travel.management.system;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;


public class Loading extends JFrame implements Runnable{
   // Font LEIXO;
    //private Login login;
    JProgressBar p;
     Thread t;
     String use;
     private Login login;
     
     
    public void run()
        {
            try
            {
                for(int i=1;i<=101;i++)
                {
                    int m = p.getMaximum();
                    int n = p.getValue();
                    if(n < m)
                    {
                        p.setValue(p.getValue() +1);
                        //n = p.getValue();
                         //p.setString("Exploring The World");
                    }
                    else{
                        i=101;
                        setVisible(false);
                        new DashBoard(login).setVisible(true);
                    }
                    Thread.sleep(50);
                }
               
            }
            catch(Exception e)
            {
                
            }
        }
     Loading()
     {
         
     }
     Loading(Login login)
    {
       
        this.login = login; 
        use = login.getname();
        t = new Thread(this);
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
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/unleash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,900,400);
        p1.add(l1);
        
//        try
//        {
//            LEIXO = Font.createFont(Font.TRUETYPE_FONT, new File("LEIXO-DEMO.ttf")).deriveFont(30f); 
//            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("LEIXO-DEMO.ttf")));
//        }
//        catch(IOException | FontFormatException e)
//        {
//            
//        }
        
        JLabel l2 = new JLabel("Come Lets Explore the World Together");
        l2.setForeground(Color.WHITE);
        l2.setBounds(80,80,400,35);
        l2.setFont(new Font("TAHOMA", Font.PLAIN,15));
        l1.add(l2);
        
        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(80,120,270,15);
        l1.add(p);
        
      //  Login login = new Login();
//        String namr = login.getname();
//        System.out.println(namr);
       // String namur = login.namee();
        //System.out.println(namur);
       
        JLabel l3 = new JLabel("WELCOME "+ login.getname());
        l3.setForeground(Color.WHITE);
        l3.setBounds(80,220,400,35);
        l3.setFont(new Font("LEIXO", Font.BOLD,15));
        l1.add(l3);
        
        //String x = login.getuser();
        
        t.start();
    }
//    public static void fill()
//    {
//        int i = 0;
//        try {
//            while (i <= 100) {
//                // set text according to the level to which the bar is filled
//                if (i > 30 && i < 70)
//                    p.setString("wait for sometime");
//                else if (i > 70)
//                    p.setString("almost finished loading");
//                else
//                    p.setString("loading started");
// 
//                // fill the menu bar
//                p.setValue(i + 10);
// 
//                // delay the thread
//                Thread.sleep(3000);
//                i += 20;
//            }
//        }
//        catch (Exception e) {
//        }
//        
//    }
    
    public static void main(String[] args)
    {
       new Loading().setVisible(true);
    }
    
}
