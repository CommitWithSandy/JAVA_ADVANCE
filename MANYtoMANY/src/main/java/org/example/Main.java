package org.example;

import org.example.Model.Employee;
import org.example.Model.Company;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Employee e1 = new Employee(101, "Sandesh");
        Employee e2 = new Employee(102, "Sarthak");

        Company c1 = new Company(1, "Google");
        Company c2 = new Company(2, "Microsoft");

        // Google has both employees
        c1.getEmployees().add(e1);
        c1.getEmployees().add(e2);

        // Microsoft has both employees
        c2.getEmployees().add(e1);
        c2.getEmployees().add(e2);

        // Maintain the inverse side of the relationship
        e1.getCompanies().add(c1);
        e1.getCompanies().add(c2);

        e2.getCompanies().add(c1);
        e2.getCompanies().add(c2);

        session.persist(c1);
        session.persist(c2);

        transaction.commit();

        session.close();
        HibernateUtil.getFactory().close();

        System.out.println("Employee and Company data saved successfully!");
    }
}