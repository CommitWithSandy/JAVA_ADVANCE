
package org.example;

import org.example.Model.Department;
import org.example.Model.Student;
import org.example.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student1 = new Student();
        student1.setStudentId(101);
        student1.setStudentName("Sandesh Hiremath");

        Student student2 = new Student();
        student2.setStudentId(102);
        student2.setStudentName("Sarthak Homkar");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Computer Science");

        department.setStudents(students);

        session.persist(department);

        transaction.commit();

        session.close();
        HibernateUtil.getFactory().close();

        System.out.println("Data Saved Successfully");
    }
}
