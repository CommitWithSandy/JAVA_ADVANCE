package org.example.Operation;

import org.example.connection.MySQL_Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
    public void updateData(Connection con){
        Scanner sc = new Scanner(System.in);
        try{

            String sql = "UPDATE student SET marks =? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter the Id");
            int id = sc.nextInt();

            System.out.println("Enter the marks");
            double marks = sc.nextDouble();

            ps.setDouble(1, marks);
            ps.setInt(2, id);

            int row = ps.executeUpdate();

            if(row>0){
                System.out.println("Record Updated Successfully");
            }
            else{
                System.out.println("Record Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
