package edu.pau.sqlitejdbc;

import java.sql.*;


/**
 *
 * @author Şevket Umut ÇAKIR
 */
public class SQLiteJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement stmt = connection.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM Employee");
            while(rs.next())//iterate through rows
            {
                System.out.printf("%-15s\t%-15s\t%-15s\n",rs.getObject("EmployeeId"),rs.getObject("EmployeeName"),rs.getObject("EmployeeLastName"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}