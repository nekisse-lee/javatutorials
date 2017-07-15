package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam06_predicate;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class Student {
    private String name;
    private String sex;
    private int score;



    public Student(String name, String sex, int score){
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public int getScore() {
        return score;
    }
}
