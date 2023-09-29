package org.example.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Student>studentsOfSchool;

    public School() {
        studentsOfSchool = new ArrayList<>();
    }

   /* public static void addStudent(School school, Student student){
        school.studentsOfSchool.add(student);
    }*/

    public static void addStudent(School school, Student student){
        school.getStudentsOfSchool().add(student);
    }

    public void printTotalStudents(){
        System.out.println(this.studentsOfSchool);
    }

    /*public Student findStudent(String matriculationNumber){
        if(this.studentsOfSchool.contains(matriculationNumber)){

        };

        if (index >= 0) {
            System.out.println(matriculationNumber + " wurde an Position " + index + " gefunden.");
        } return null;
    }*/

    public List<Student> getStudentsOfSchool() {
        return studentsOfSchool;
    }

    public void setStudentsOfSchool(List<Student> studentsOfSchool) {
        this.studentsOfSchool = studentsOfSchool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(studentsOfSchool, school.studentsOfSchool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsOfSchool);
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsOfSchool=" + studentsOfSchool +
                '}';
    }
}
