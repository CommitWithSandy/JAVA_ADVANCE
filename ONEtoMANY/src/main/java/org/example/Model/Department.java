package org.example.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    private int departmentId;
    private String departmentName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name =  "department_id")
    private List<Student> students;
    public Department(){

    }

    public Department(int departmentId, String departmentName , List<Student> students) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
//        this.students = students;
    }

    public int getDepartmentId()
    {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {

        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
