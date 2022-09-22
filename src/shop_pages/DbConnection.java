/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop_pages;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * 
 * 
 *
 * @author Admin
 */
public class DbConnection 
{
    private static String url="jdbc:mysql://localhost/mobile";
    private static String username="root";
    private static String drivers="com.mysql.jdbc.Driver";
    private static String pwd="";
    private static Connection con;
    
    
    
    public static Connection dbconnection() throws  SQLException
    {
   
    
        try
    
        {
       
            Class.forName(drivers);
       
            con=DriverManager.getConnection(url,username,pwd);
       
       
    
        }
    
        catch(ClassNotFoundException se)
    
        {
        
            se.printStackTrace();
    
        }
    
        catch(SQLException se)
    
        {
        
            se.printStackTrace();
    
    
        }
    
        return con;
    
    }
    

}
        
