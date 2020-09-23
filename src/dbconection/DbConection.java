/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Abhi
 */

public class DbConection {
   static Connection con;
    static  public Connection getConnect()
    {
        try {
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql:///billing_software","root","root");
            
           } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return con;
    }
    
}
