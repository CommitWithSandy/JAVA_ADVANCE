package org.example.Operation;

import org.example.connection.MySQL_Connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayInfo {
    public void displayInfo(Connection con){
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()){
                System.out.println("ID :" + rs.getInt("id"));
                System.out.println("Name :" + rs.getString("name"));
                System.out.println("Marks :" + rs.getDouble("marks"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
