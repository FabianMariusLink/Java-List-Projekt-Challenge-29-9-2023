package org.example;

import org.example.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        //System.out.println("Hello world!");

        students.add(new Student("Fabian", "Link", "tuf45372"));
        students.add(new Student("Antonia", "Ott", "ted54572"));
        students.add(new Student("Medea", "Ernst", "rt546332"));

        for (Student s : students){
            System.out.println(s.getFirstName());
        }
    }
}