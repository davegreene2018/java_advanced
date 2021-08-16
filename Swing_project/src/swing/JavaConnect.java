/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Daveg
 */
public class JavaConnect {
    
    Connection conn = null;
    public static Connection ConnectDb(){
        
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
         
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vms_database?serverTimezone=UTC", "davegreene", "Claire2013");
           return conn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
    
}
