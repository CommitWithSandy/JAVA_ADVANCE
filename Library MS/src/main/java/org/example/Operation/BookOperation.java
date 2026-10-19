package org.example.Operation;

import java.sql.*;
import java.util.Scanner;
import java.util.Scanner;

public class BookOperation {
    public void addBook(Connection con) {
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "INSERT INTO Books VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Book_Id");
            int Book_Id = sc.nextInt();

            System.out.println("Enter Book_Name");
            String Book_Name = sc.next();

            System.out.println("Enter Author_Name");
            String Author_Name = sc.next();

            System.out.println("Enter Publisher");
            String publisher = sc.next();

            System.out.println("Enter price");
            int price = sc.nextInt();

            System.out.println("Enter quantity");
            int quantity = sc.nextInt();

            ps.setInt(1, Book_Id);
            ps.setString(2, Book_Name);
            ps.setString(3, Author_Name);
            ps.setString(4, publisher);
            ps.setInt(5, price);
            ps.setInt(6, quantity);

            ps.executeUpdate();
            System.out.print("Data Inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DisplayBook(Connection con) {
        Scanner sc = new Scanner(System.in);
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Books");

            while (rs.next()){
                System.out.println("Book_id :" + rs.getInt("book_id"));
                System.out.println("Book_Name :" + rs.getString("book_name"));
                System.out.println("Author_name :" + rs.getString("author_name"));
                System.out.println("Publisher :" + rs.getString("publisher"));
                System.out.println("Book_Price :" + rs.getInt("price"));
                System.out.println("Book_Quantity :" + rs.getInt("quantity"));
                System.out.println("------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchBook(Connection con){
        Scanner sc = new Scanner(System.in);
        try{
            String sql = "SELECT * FROM Books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Book ID");
            int book_id = sc.nextInt();

            ps.setInt(1,book_id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                System.out.println("Book Found");
                System.out.println("Book_id :" + rs.getInt("book_id"));
                System.out.println("Book_Name :" + rs.getString("book_name"));
                System.out.println("Author_name :" + rs.getString("author_name"));
                System.out.println("Publisher :" + rs.getString("publisher"));
                System.out.println("Book_Price :" + rs.getInt("price"));
                System.out.println("Book_Quantity :" + rs.getInt("quantity"));
            }else {
                System.out.println("Book Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateBook(Connection con){
        Scanner sc = new Scanner(System.in);
        try{

            String sql = "UPDATE Books SET author_name =? WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.println("Enter Book Id");
            int book_id = sc.nextInt();

            System.out.println("Enter the Author_name");
            String author_name = sc.next();

            ps.setString(1, author_name);
            ps.setInt(2, book_id);

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

    public void deleteBook(Connection con){
        Scanner sc = new Scanner(System.in);
        try {
            String sql = "DELETE FROM Books WHERE book_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            System.out.println("Enter Book ID");
            int book_id = sc.nextInt();

            ps.setInt(1, book_id);
            int row = ps.executeUpdate();
            if(row>0){
                System.out.println("Book Deleted");
            }else {
                System.out.println("Book Not Found");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
