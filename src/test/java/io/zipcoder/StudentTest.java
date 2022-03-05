package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void getExamScoresTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        String expected="Exam 1-->100.0\n" +
                "Exam 2-->95.0\n" +
                "Exam 3-->123.0\n" +
                "Exam 4-->96.0";
        System.out.println("Student expected score :"+expected);
        // When

        String output = student.getExamScores();

        // Then
        System.out.println("actual:"+output);
        Assert.assertEquals(expected ,output);
    }

}