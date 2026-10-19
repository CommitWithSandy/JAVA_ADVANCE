package org.example;

import org.example.Model.Person;
import org.example.Model.Passport;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//
//        Transaction transaction = session.beginTransaction();
//
//        Passport passport = new Passport(1, "IND123456");
//
//        Person student = new Person(101, "Sandesh", passport);
//
//        session.persist(student);
//
//        transaction.commit();
//
//        session.close();
//        sessionFactory.close();
//
//        System.out.println("Student Saved Successfully");
        Session session = HibernateUtil.getFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Passport passport = new Passport();
        passport.setPassportId(2);
        passport.setPassportNumber("IND142004");
        Person person = new Person();
        person.setPersonId(102);
        person.setPersonName("Sandesh Hiremath");
        person.setPassport(passport);
        session.persist(person);
        transaction.commit();
        HibernateUtil.getFactory().close();
        System.out.println("Data Saved Successfully");

    }
}