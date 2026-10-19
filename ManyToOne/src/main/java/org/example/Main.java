package org.example;

import org.example.Model.Customer;
import org.example.Model.Order;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer(1, "Sandesh");

        Order o1 = new Order(101, "Gaming Mouse", customer);
        Order o2 = new Order(102, "Gaming Keyboard", customer);
        Order o3 = new Order(103, "Gaming Headset", customer);

        session.persist(customer);

        session.persist(o1);
        session.persist(o2);
        session.persist(o3);

        transaction.commit();

        session.close();
        HibernateUtil.getFactory().close();

        System.out.println("Orders saved successfully!");
    }
}