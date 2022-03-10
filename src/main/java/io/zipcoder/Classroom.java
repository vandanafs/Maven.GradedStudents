package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

   private  Student[] students;
   private int maxNumberOfStudents;

    public Classroom ( int maxNumberOfStudents ) {

        this.maxNumberOfStudents = maxNumberOfStudents;
      //  students=new Student[maxNumberOfStudents];   this can be done too
    }

    public Classroom ( Student[] students ) {
        this.students = students;
    }

//nullary constr with initi Students[] with 30
    public Classroom () {
          this.students=new Student[30];
    }





    public double getAverageExamScore(){
        double classAvg=0.0;
        for(Student s:students){
                  classAvg+=s.getAverageExamScore();
        }
          return(classAvg/students.length);
    }

    public Student[] getStudents () {

        return this.students;

    }   //bcos we added student to student[]

    public void  addStudent(Student student) {
//        for (int i = 0; i <students.length; i++) {
//            if (students[i] == null) {
//                students[i] = student;
//            }
        Student[] stu;

        ArrayList<Student> al= new ArrayList(Arrays.asList(student));

           al.add(student);
       this.students= new Student[] {student};
       //System.out.println(this.students.);
        }


        public void removeStudent(String fName, String lName ){
            for(int i=0;i<students.length; i++){
                   if  (students[i].getFirstName().equals(fName) && students[i].getLastName().equals(lName)){
                          students[i]=new Student(null,null,null);
                   }
            }
        }

        /*
        return the array represetation of studnet objected sorted asending
         */
     public Student[] getStudentByScore(){

//         Arrays.sort(students);

         return students;


     }
     public void getGradeBook(){

     }

    }


