package org.example;

import org.example.Operation.*;
import org.example.connection.MySQL_Connection;

import java.sql.Connection;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Connection con = MySQL_Connection.getConnection();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Insert Data");
            System.out.println("2. Update Data");
            System.out.println("3. Delete Data");
            System.out.println("4. Display Data");
            System.out.println("5. Search Data");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertData in = new insertData();
                    in.insertInfo(con);
                    break;

                case 2:
                    UpdateData up = new UpdateData();
                    up.updateData(con);
                    break;

                case 3:
                    DeleteData del = new DeleteData();
                    del.deleteData(con);
                    break;

                case 4:
                    DisplayInfo dis = new DisplayInfo();
                    dis.displayInfo(con);
                    break;

                case 5:
                    SearchData search = new SearchData();
                    search.searchData(con);
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 0) ;
            sc.close();
    }
}
