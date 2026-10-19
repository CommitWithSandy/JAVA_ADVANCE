package org.example.Operation;

import org.example.connection.MySQL_Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SearchData {
    public void searchData(Connection con){
        Scanner sc = new Scanner(System.in);
        try{
            String sql = "SELECT * FROM student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Student ID");
            int id = sc.nextInt();

            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                System.out.println("Student Found");
                System.out.println("ID :" + rs.getInt("id"));
                System.out.println("Name :" + rs.getString("name"));
                System.out.println("Marks :" + rs.getDouble("marks"));
            }else {
                System.out.println("Student Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
