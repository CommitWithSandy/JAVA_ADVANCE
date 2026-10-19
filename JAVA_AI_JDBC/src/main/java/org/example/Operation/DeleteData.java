package org.example.Operation;
import org.example.connection.MySQL_Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//import java.sql.Statement;

public class DeleteData {
    public void deleteData(Connection con){
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "DELETE FROM student WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Enter Student ID");
            int id = sc.nextInt();

            ps.setInt(1, id);
            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Data Deleted");
            }else {
                System.out.println("Data Not Found");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

