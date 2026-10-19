
package org.example.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class ReturnBookOperation {

    public void returnBook(Connection con) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Issue ID: ");
        int issue_id = sc.nextInt();

        try {
            // Check issue record
            String sql = "SELECT book_id, status FROM Issue_Book WHERE issue_id = ?";

            PreparedStatement ps1 = con.prepareStatement(sql);
            ps1.setInt(1, issue_id);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {

                int book_id = rs.getInt("book_id");
                String status = rs.getString("status");

                if ("ISSUED".equalsIgnoreCase(status)) {

                    String sql1 = "UPDATE Issue_Book SET status = ?, return_date = ? " + "WHERE issue_id = ?";

                    PreparedStatement ps2 = con.prepareStatement(sql1);

                    ps2.setString(1, "RETURNED");
                    ps2.setDate(2, Date.valueOf(LocalDate.now()));
                    ps2.setInt(3, issue_id);

                    ps2.executeUpdate();

                    String sql2 = "UPDATE Books SET quantity = quantity + 1 " + "WHERE book_id = ?";

                    PreparedStatement ps3 =
                            con.prepareStatement(sql2);

                    ps3.setInt(1, book_id);
                    ps3.executeUpdate();

                    System.out.println("Book returned successfully!");

                    ps2.close();
                    ps3.close();

                } else {
                    System.out.println("This book has already been returned!");
                }

            } else {
                System.out.println("Invalid Issue ID!");
            }

            rs.close();
            ps1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
