/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author reyanson
 */
public class DBconnection {
    private static Connection con=null;
    
    static{
        try {
            String url="jdbc:mysql://localhost:3306/javacrud";
            String user= "root";
            String pw = null;
            
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pw);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error "+ex);
        }
        
    }
    
    public static Connection getConnection(){
        return con;
    }
    
}
