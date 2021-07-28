/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class ForgetPassword extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    JPanel p2;
    ForgetPassword()
            {
                setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(400,200,900,400);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        //p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(450,0,450,400);
        p1.setLayout(null);
        add(p1);
        setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/forgotpassword1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(1,80,500,200);
        p1.add(l1); 
        
        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0,0,450,400);
        p2.setBackground(Color.WHITE);
        add(p2);
        //setVisible(true);
        
        JLabel l2 = new JLabel("Username / Email");
        l2.setBounds(50,30,200,20);
        l2.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l2);
        //setVisible(true);
        
        t1 = new JTextField();
        t1.setBounds(50,60,200,20);
       // t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel l3 = new JLabel("Passport Number");
        l3.setBounds(50,90,200,20);
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l3);
        //setVisible(true);
        
        t2 = new JTextField();
        t2.setBounds(50,120,200,20);
        //t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        JLabel l4 = new JLabel("Security Question");
        l4.setBounds(50,170,200,20);
        l4.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l4);
        //setVisible(true);
        
        t3 = new JTextField();
        t3.setBounds(50,200,200,20);
        //t3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);
        
        JLabel l5 = new JLabel("Answer");
        l5.setBounds(50,230,200,20);
        l5.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l5);
        //setVisible(true);
        
        t4 = new JTextField();
        t4.setBounds(50,260,200,20);
        //t4.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);
        
        JLabel l6 = new JLabel("Password");
        l6.setBounds(50,300,200,20);
        l6.setFont(new Font("SAN_SERIF", Font.PLAIN,20));
        p2.add(l6);
        //setVisible(true);
        
        t5 = new JTextField();
        t5.setBounds(50,330,200,20);
       // t5.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t5);
        
         
        
        b1 = new JButton("Search");
        b1.setBounds(300,120,100,20);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Retrive");
        b2.setBounds(300,260,100,20);
        b2.setBackground(new Color(133,193,233));
        b2.setForeground(Color.WHITE);
        b2.setBorder(BorderFactory.createEmptyBorder());
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("Back");
        b3.setBounds(300,330,100,20);
        b3.setBackground(new Color(133,193,233));
        b3.setForeground(Color.WHITE);
        b3.setBorder(BorderFactory.createEmptyBorder());
        b3.addActionListener(this);
        p2.add(b3);
        
//        JLabel l7 = new JLabel("Copy the Password go back to login page and paste it");
//                 l7.setBounds(50, 360, 350, 30);
//                 l7.setForeground(Color.GREEN);
//                 p2.add(l7);
        
        
        
        
        setVisible(true);
            }
    public void actionPerformed(ActionEvent ae)
    {
        Conn c = new Conn();
        if(ae.getSource()==b1)
        {
            
            //System.out.println(t1.getText());
            try{
                
                //String sql = " Select Security from signup where Username_Email= '"+t1.getText()+"' and `Passport_Number`= '"+t2.getText()+"'";
                String sql = " SELECT `Security` FROM `signup` WHERE `Username_Email` = '"+t1.getText()+"'  AND `Passport_Number`= '"+t2.getText()+"' " ;
                //String sq = " SELECT * FROM signup WHERE `Passport_Number`= '"+t2.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);
                //ResultSet r = c.s.executeQuery(sq);
//                while(rs.next())
//                {
//                    t3.setText(rs.getString("Security"));
//                }
                rs.first();
                t3.setText(rs.getString("Security"));
                
                //System.out.println(sql);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()==b2)
        {
            try
            {
                String sq = " SELECT `Password` FROM `signup` WHERE `Username_Email` = '"+t1.getText()+"' AND `Passport_Number` = '"+t2.getText()+"' AND `Security` = '"+t3.getText()+"' ";
                ResultSet r = c.s.executeQuery(sq);
                r.first();
                t5.setText(r.getString("Password"));
                JOptionPane.showMessageDialog(null,"Copy the password and go back to login page to paste it");
                
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else if(ae.getSource()== b3)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
        
     
            
    }
    
    public static void main(String[] args)
    {
        new ForgetPassword();
    }
}
