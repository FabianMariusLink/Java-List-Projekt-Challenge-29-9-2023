package org.example;

import org.example.school.School;
import org.example.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        School school1 = new School();

        students.add(new Student("Fabian", "Link", "tuf45372"));
        students.add(new Student("Antonia", "Ott", "ted54572"));
        students.add(new Student("Medea", "Ernst", "rt546332"));

        Student student11 = new Student("Fabian", "Link", "tuf45372");
        Student student12 = new Student("Antonia", "Ott", "ted54572");
        Student student13 = new Student("Medea", "Ernst", "rt546332");



        School.addStudent(school1, student11);
        School.addStudent(school1, student12);
        School.addStudent(school1, student13);

        school1.printTotalStudents();


        for (Student s : students){
            System.out.println(s.getFirstName());
        }
    }
}