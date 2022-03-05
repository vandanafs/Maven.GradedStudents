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

    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }
//not needed, obj state is mutated via takeExam()
   public HashMap setExamScores ( int examNumber, double newScore ) {
      HashMap hmap=new HashMap();
      hmap.put("examNumber",newScore);
      return hmap;
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
    public ArrayList<Double> addExamScore( double scores){
      examScores.add(scores);
        return examScores;
    }

    @Override
    public String toString () {
        return new StringBuilder()
                .append("\n My firstname is "+firstName)
                .append("\n My lastname is "+lastName)
                .append("\n MExam Score is"+examScores )
                .toString();

    }
}
