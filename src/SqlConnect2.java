/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.Properties;


/**
 *
 * @author Mr Olayinka
 */
public class SqlConnect2 {
    
    static  Connection conn = null;
    
    // Database Connection For Students 
    public static Connection conDB() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
     
        try {
                InputStream is = SqlConnect2.class.getClassLoader().getResourceAsStream("prop.properties");
                Properties props = new Properties();
                props.load(is);
                
               
                     String DB_HOSTMasterSystem =props.getProperty("DB_HOSTMasterSystem");
                     String username =props.getProperty("username");
                     String password =props.getProperty("password");
                      String DB_Driver =props.getProperty("DB_Driversql");
                
                  
                 Class.forName(DB_Driver).newInstance();        
      conn = DriverManager.getConnection(DB_HOSTMasterSystem, username, password);
            return conn;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
             return null;
        }
   
    }
    
    // Database Connection For Attendance System
     public  static Connection AttconDB() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException{
    
        try {
        InputStream is = SqlConnect2.class.getClassLoader().getResourceAsStream("prop.properties");
            Properties props = new Properties();
            props.load(is);
                    
                    
                    
                     String DB_HOSTMasterSystem =props.getProperty("DB_HOSTMasterSystem");
                     String username =props.getProperty("username");
                     String password =props.getProperty("password");
                      String DB_Driver =props.getProperty("DB_Driversql");
                
                  
                 Class.forName(DB_Driver).newInstance();        
      conn = DriverManager.getConnection(DB_HOSTMasterSystem, username, password);
           
            return conn;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
             return null;
        }
   
    }
     
       // Database Connection For Admin
     public static  Connection AdminconDB() throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
         
        try {

            InputStream is =SqlConnect2.class.getClassLoader().getResourceAsStream("prop.properties");
            Properties props = new Properties();
            props.load(is);
                  
                     String DB_HOSTMasterSystem =props.getProperty("DB_HOSTMasterSystem");
                     String username =props.getProperty("username");
                     String password =props.getProperty("password");
                      String DB_Driver =props.getProperty("DB_Driversql");
                
                  
                 Class.forName(DB_Driver).newInstance();        
      conn = DriverManager.getConnection(DB_HOSTMasterSystem, username, password);
           return conn;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
             return null;
             
        }
   
    }
     
   
   
    
}
