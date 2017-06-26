package org.opentutorials.javatutorials.ch5.sec06.exam03_array_length;

/**
 * Created by Nekisse_lee on 2017. 6. 26..
 */
public class ArrayLengthExample {
    public static void main(String[] args) {
        int[] scores = {83, 90 , 87};

        int sum = 0;

        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + scores);

        double avg = (double)sum/ scores.length;
        System.out.println("평균 : " + avg);
    }


}
