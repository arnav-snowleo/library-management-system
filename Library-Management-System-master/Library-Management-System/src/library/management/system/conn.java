package library.management.system;

// JDBC IS the java api which we will use for connecting and exexuting queries with the database

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  //com.mysql.jdbc.Driver this was earlier
            c =DriverManager.getConnection("jdbc:mysql:///mini_project","root","");  //changed here   
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
