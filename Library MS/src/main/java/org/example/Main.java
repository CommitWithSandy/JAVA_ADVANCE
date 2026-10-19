package org.example;

import org.example.Connection.MySQLConnection;
import org.example.Operation.*;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection con = MySQLConnection.getConnection();

        BookOperation book = new BookOperation();
//        book.addBook(con);
        book.DisplayBook(con);
//        book.updateBook(con);
//        book.deleteBook(con);
//        book.searchBook(con);

        MemberOperation member = new MemberOperation();
//        member.addMember(con);
//        member.DisplayMember(con);
//        member.updateMember(con);
//        member.searchMember(con);
//        member.deleteMember(con);

        IssueBookOperation issue = new IssueBookOperation();
//        issue.issueBook(con);

        DisplayOperation display = new DisplayOperation();
//        display.displayIssuedBooks(con);
//        display.displayReturnedBooks(con);

        ReturnBookOperation returnbook = new  ReturnBookOperation();
//        returnbook.returnBook(con);
        }
    }