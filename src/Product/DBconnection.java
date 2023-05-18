package Product;


import java.sql.*;
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
    
    
    //function for conecting database
    
    public static Connection getConnection(){
        return con;
    }
    
}
