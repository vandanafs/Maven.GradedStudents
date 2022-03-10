package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Student {
    private String firstName;
    private String lastName ;
    ArrayList<Double> examScores;

    public Student(String fName, String lName,Double[] testScores){
        this.firstName=fName;
        this.lastName=lName;
        this.examScores= new ArrayList(Arrays.asList(testScores));
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }
    public void setLastName ( String lastName ) { this.lastName = lastName;}

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getExamScores () {
          String result="";
        for(int i=0; i<examScores.size();i++){
              result+="Exam "+(i+1)+"-->"+this.examScores.get(i)+"\n";
        }
        return result;
    }


//not needed, obj state is mutated via takeExam()
   public HashMap setExamScores1 ( int examNumber, double newScore ) {
      HashMap hmap=new HashMap();
      hmap.put("examNumber",newScore);
      return hmap;
   }

   public void  setExamScores( int examNumber, double newScore ){

        //  examScores.set(examNumber, newScore);  //set index 0
       examScores.add(examNumber, newScore);
   }

    public int  getNumberOfExamsTaken(){ //return total no of exam taken
        return  examScores.size();
    }

    public double getAverageExamScore(){
        double studAvg=0.0;
          for(double dou:examScores){
               studAvg+= dou;
          }

             return(studAvg/ examScores.size());
    }

    public void  addExamScore( double scores){
        setExamScores(getNumberOfExamsTaken(),scores);   //if adding 5th score adds, 4-1=set and get at 3+1

     // examScores.add(scores);
       // return examScores;
    }

       public String  toString(){
        String  studentData= "Student Name:"+firstName+" "+lastName+"\n"+"Average Scores: "+getAverageExamScore()+"\n"+"Exam Scores: "+"\n"+ getExamScores();
        return studentData;

       }


}
