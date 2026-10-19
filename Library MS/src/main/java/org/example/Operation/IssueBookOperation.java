
package org.example.Operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

public class IssueBookOperation {

    public void issueBook(Connection con) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int book_id = sc.nextInt();

        System.out.print("Enter Member ID: ");
        int member_id = sc.nextInt();

        try {
            String checkBook = "SELECT quantity FROM Books WHERE book_id = ?";

            PreparedStatement ps1 = con.prepareStatement(checkBook);
            ps1.setInt(1, book_id);

            ResultSet rs1 = ps1.executeQuery();

            if (rs1.next()) {

                int quantity = rs1.getInt("quantity");

                if (quantity > 0) {

                    String checkMember = "SELECT member_id FROM Members WHERE member_id = ?";

                    PreparedStatement ps2 = con.prepareStatement(checkMember);
                    ps2.setInt(1, member_id);

                    ResultSet rs2 = ps2.executeQuery();

                    if (rs2.next()) {

                        String issueSql = "INSERT INTO Issue_Book " + "(book_id, member_id, issue_date, return_date, status) " + "VALUES (?, ?, ?, NULL, 'ISSUED')";

                        PreparedStatement ps3 = con.prepareStatement(issueSql);

                        ps3.setInt(1, book_id);
                        ps3.setInt(2, member_id);
                        ps3.setDate(3, Date.valueOf(LocalDate.now()));

                        ps3.executeUpdate();

                        String updateSql = "UPDATE Books SET quantity = quantity - 1 " + "WHERE book_id = ?";

                        PreparedStatement ps4 = con.prepareStatement(updateSql);
                        ps4.setInt(1, book_id);
                        ps4.executeUpdate();

                        System.out.println("Book issued successfully!");

                        ps3.close();
                        ps4.close();

                    } else {
                        System.out.println("Member not found!");
                    }

                    rs2.close();
                    ps2.close();

                } else {
                    System.out.println("Book is not available!");
                }

            } else {
                System.out.println("Book not found!");
            }

            rs1.close();
            ps1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
