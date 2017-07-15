package org.opentutorials.javatutorials.ch14_Lambda_Expression.sec05_runnable.exam04_function;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore){
        this.name = name;
        this.englishScore= englishScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getMathScore() {
        return mathScore;
    }
}
