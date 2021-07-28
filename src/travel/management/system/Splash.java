/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash {
    public static void main(String[] args)
    {
       //System.out.println("I think I executed it");
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int x =100;
        for(int i =1;i<=580;i+=6, x+=7){   
          frame.setBounds(  950- (x+300+i)/2, 500-(100+i/2) , (x-50)+i, (x/50)+i); // Enlarges From Middle 
        //frame.setBounds(80, 150, x+i, i);  // Enlarges From Left Top Corner
        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            
        }
        }
        
        frame.setVisible(true);
    }
    
}
class SplashFrame extends JFrame implements Runnable
{
    Thread t1;

    SplashFrame() 
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
       
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1920,1080);
        add(l1);
        
        
        //setBounds(30,150,1500,600);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{    
        Thread.sleep(7000);
        this.setVisible(false);  
        new Login().setVisible(true);
    }
    catch(Exception e)
    {
        
    }
}
}
