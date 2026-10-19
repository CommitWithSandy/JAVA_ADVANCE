package org.example.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayOperation {
    public void displayIssuedBooks(Connection con){
        String sql = "SELECT i.issue_id, b.book_name, m.member_name, " +
                "i.issue_date, i.status " +
                "FROM Issue_Book i " +
                "JOIN Books b ON i.book_id = b.book_id " +
                "JOIN Members m ON i.member_id = m.member_id " +
                "WHERE i.status = 'ISSUED'";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("Issue ID :" + rs.getInt("issue_id"));
                System.out.println("Book Name :" + rs.getString(("book_name")));
                System.out.println("Member Name :" + rs.getString(("member_name")));
                System.out.println("Issue Date :" + rs.getString(("issue_date")));
                System.out.println("Status :" + rs.getString("status"));
            }
            rs.close();
            ps.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayReturnedBooks(Connection con){
        String sql = "SELECT i.issue_id, b.book_name, m.member_name, " +
                "i.issue_date, i.return_date, i.status " +
                "FROM Issue_Book i " +
                "JOIN Books b ON i.book_id = b.book_id " +
                "JOIN Members m ON i.member_id = m.member_id " +
                "WHERE i.status = 'RETURNED'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("Issue ID :" + rs.getInt("issue_id"));
                System.out.println("Book Name :" + rs.getString(("book_name")));
                System.out.println("Member Name :" + rs.getString(("member_name")));
                System.out.println("Issue Date :" + rs.getString(("issue_date")));
                System.out.println("Return Date :" + rs.getString(("return_date")));
                System.out.println("Status :" + rs.getString("status"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
