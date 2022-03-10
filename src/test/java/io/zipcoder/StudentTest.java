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
                "Exam 4-->96.0\n";
        System.out.println("Student expected score :"+expected);
        // When

        String output = student.getExamScores();

        // Then
        System.out.println("actual:"+output);
        Assert.assertEquals(expected ,output);
    }

    @Test
    public void addExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test //wrong
    public void setExamScore(){
        //given
        String firstName="Leon";
        String lastName="Hunter";
            Double[] examScores={100.0};
        Student student=new Student(firstName,lastName, examScores);

        //when
        student.setExamScores(1,150.0);
        String output=student.getExamScores();   //it is not printing latest added

        //then
        System.out.println("Get exam scores-->"+output);
    }

    @Test
    public void getAverageExamScore(){
        //given
        String firstName="Leon";
        String lastName="Hunter";
        Double[] examScores={100.0,150.0, 250.0,0.0};
        Student student=new Student(firstName,lastName, examScores);
         Double  expAvg=125.0;
        //when
        Double output=student.getAverageExamScore();

        //then
        System.out.println(output);
        Assert.assertEquals(expAvg,output);
    }


    @Test
    public void   getToStringTest(){
        //given
        String firstName="Leon";
        String lastName="Hunter";
        Double[] examScores={100.0,150.0, 250.0,0.0};
        Student student=new Student(firstName,lastName, examScores);
        Double  expAvg=125.0;
        //when
        String output=student.toString();
        System.out.println(output);

        //then
       // Assert.assertEquals(,output
    }

}