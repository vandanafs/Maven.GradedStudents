package io.zipcoder;

public class Classroom {

    Student[] students;
    int maxNumberOfStudents;

    public Classroom ( int maxNumberOfStudents ) {
        this.maxNumberOfStudents = maxNumberOfStudents;
    }

    public Classroom ( Student[] students ) {
        this.students = students;
    }

//nullary constr with initi Students[] with 30
    public Classroom () {
         Student[] students=new Student[30];
    }


    public Student[] getStudents () {
        return students;
    }

    public double getAverageExamScore(){
        double classAvg=0.0;
        for(Student s:students){
                  classAvg+=s.getAverageExamScore();
        }
          return(classAvg/students.length);
    }

    public void  addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
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
     public void getStudentByScore(){

     }
     public void getGradeBook(){

     }

    }


