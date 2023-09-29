package org.example.school;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void addStudent_whenStaticMethodIsExecuted_thenAddInstanceOfStudentToStudentsArrayOfInstanceOfSchool(){
    //GIVEN
    Student student1 = new Student("firstName1", "lastName1", "matriculationNumber1");
    School school1 = new School();

    //WHEN
    School.addStudent(school1, student1);
    int actual =  school1.getStudentsOfSchool().size();
    int expect = 1;
    //List<Student> expect =
    }
    /*@Test
    void addStudent_when2InstancesOfStudents_thenTheSizeOfStudentsArrayOfInstanceOfSchoolIs2(){
        //GIVEN
        Student student1 = new Student("firstName1", "lastName1", "matriculationNumber1");
        Student student2 = new Student("firstName1", "lastName1", "matriculationNumber1");
        School school1 = new School();

        //WHEN
        School.addStudent(school1, student1);
        int actual =  school1.getStudentsOfSchool().size();
        int expect = 1;
        //List<Student> expect =
    }*/
    @Test
    //von Alijoscha
    void addStudent_when2InstancesOfStudent_thenTheLengthOfStudentsArrayOfInstanceOfSchoolIs2() {
        Student student = new Student("name1","lastName1","d1234");
        Student student2 = new Student("name1","lastName1","d1234");
        School schoolTest = new School();
        School.addStudent(schoolTest, student);
        School.addStudent(schoolTest, student2);

        int actual = schoolTest.getStudentsOfSchool().size();

        int expect = 2;
        assertEquals(expect,actual);
    }
}