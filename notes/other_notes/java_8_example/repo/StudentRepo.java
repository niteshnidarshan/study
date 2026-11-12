package org.example.repo;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("S1", "Ram", 27));
        studentList.add(new Student("S2", "Shyam", 26));
        studentList.add(new Student("S3", "Sita", 22));
        studentList.add(new Student("S4", "Laxman", 27));
        studentList.add(new Student("S5", "Bharat", 21));
        studentList.add(new Student("S6", "Shtrughan", 20));
        return studentList;
    }
}
