package org.opentutorials.javatutorials.ch5.sec06.exam01_array_bylist;

/**
 * Created by Nekisse_lee on 2017. 6. 26..
 */
public class ArrayCreatByvalueListExample {
    public static void main(String[] args){
        int[] scores = {83, 90, 87};

        System.out.println("scores[0]: " + scores[0]);
        System.out.println("scores[0]: " + scores[1]);
        System.out.println("scores[0]: " + scores[2]);

        int sum = 0;
        for (int i = 0; i < 3 ; i++){
            sum += scores[i];
            System.out.println(sum);
        }
        System.out.println("총합 : " + sum);

        double avg = (double)sum / 3;
        System.out.println("평균 : " + avg);
    }
}
