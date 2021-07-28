
package travel.management.system;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        
        try
        {
            // Register the Driver Classs
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Create the Connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel_management_system","root","root");
            //JOptionPane.showMessageDialog(null,"Database Connection Succesfully Established");
            
            //  Create Statement
            s = c.createStatement();
            
        }
        catch(Exception e)
        {
            //System.out.println("");
           JOptionPane.showMessageDialog(null, "Couldn't Establish Database Connection, Check whether the servers are connected"); 
           JOptionPane.showMessageDialog(null,e);
    }
    
}
}
