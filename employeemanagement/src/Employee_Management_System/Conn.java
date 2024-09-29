package Employee_Management_System;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            String url="jdbc:mysql://localhost:3306/employeemanagementsystem";//URL
            String user="root";//User
            String password="967679";//password

            Class.forName("com.mysql.cj.jdbc.Driver");//loading driver

            c = DriverManager.getConnection(url, user, password);//building connection

            s = c.createStatement();//creating Statement
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        
    }
}