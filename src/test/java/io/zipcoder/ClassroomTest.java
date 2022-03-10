package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);
           Double avgExp=125.0;
        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
       System.out.println("pre : "+preEnrollment);
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();
        System.out.println("post entroll :"+ postEnrollment);
        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

    @Test
    public void test(){

    }
}
