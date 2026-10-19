package org.example.Model;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private int studentId;

    private String studentName;

    public Student() {
    }

    public Student(int StudentId, String StudentName) {
        this.studentId = StudentId;
        this.studentName = StudentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
