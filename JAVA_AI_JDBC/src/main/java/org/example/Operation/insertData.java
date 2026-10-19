package org.example.Operation;
import org.example.connection.MySQL_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Statement;

public class insertData {
    public void insertInfo(Connection con){
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "INSERT INTO student VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Id");
            int id = sc.nextInt();

            System.out.println("Enter Name");
            String name = sc.next();

            System.out.println("Enter marks");
            double marks = sc.nextDouble();

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, marks);

            ps.executeUpdate();
            System.out.print("Data Inserted");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
