package org.example.Operation;

import java.sql.*;
import java.util.Scanner;

public class MemberOperation {
    public void addMember(Connection con) {
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "INSERT INTO Members VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Member_id");
            int member_id = sc.nextInt();

            System.out.println("Enter Member_name");
            String member_name = sc.next();

            System.out.println("Enter Email");
            String email = sc.next();

            System.out.println("Enter Mobile number");
            String mobile = sc.next();

            System.out.println("Enter Address");
            String address = sc.next();

            ps.setInt(1, member_id);
            ps.setString(2, member_name);
            ps.setString(3, email);
            ps.setString(4, mobile);
            ps.setString(5, address);

            ps.executeUpdate();
            System.out.println("Member Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DisplayMember(Connection con) {
        Scanner sc = new Scanner(System.in);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Members");

            while (rs.next()){
                System.out.println("Member_id :" + rs.getInt("member_id"));
                System.out.println("Member_name :" + rs.getString("member_name"));
                System.out.println("Email :" + rs.getString("email"));
                System.out.println("Mobile number :" + rs.getString("mobile"));
                System.out.println("Address :" + rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchMember(Connection con){
        Scanner sc = new Scanner(System.in);
        try{
            String sql = "SELECT * FROM Member WHERE member_id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Member ID");
            int member_id = sc.nextInt();

            ps.setInt(1,member_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                System.out.println("Member_id :" + rs.getInt("member_id"));
                System.out.println("Member_name :" + rs.getString("member_name"));
                System.out.println("Email :" + rs.getString("email"));
                System.out.println("Mobile number :" + rs.getString("mobile"));
                System.out.println("Address :" + rs.getString("address"));
            }else {
                System.out.println("Member Not Found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateMember(Connection con){
        Scanner sc = new Scanner(System.in);
        try{

            String sql = "UPDATE Members SET email =? WHERE member_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Member ID");
            int member_id = sc.nextInt();

            System.out.println("Enter the Email");
            String email = sc.next();

            ps.setString(1, email);
            ps.setInt(2, member_id);

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

    public void deleteMember(Connection con){
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "DELETE FROM Members WHERE member_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Enter Member ID");
            int member_id = sc.nextInt();

            ps.setInt(1, member_id);
            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Member Deleted");
            }else {
                System.out.println("Member Not Found");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
