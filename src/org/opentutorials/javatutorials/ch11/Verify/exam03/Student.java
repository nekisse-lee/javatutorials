package org.opentutorials.javatutorials.ch11.Verify.exam03;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class Student {
    private String studentNum;

    public Student(String studentNum){
        this.studentNum = studentNum;
    }

    public String getStudentNum(){
        return studentNum;
    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Student){
           Student student = (Student) obj;
           if (studentNum.equals(getStudentNum())){
               return true;
           }
       }
                return false;
    }

    @Override
    public int hashCode() {
        return  studentNum.hashCode();
    }
}

