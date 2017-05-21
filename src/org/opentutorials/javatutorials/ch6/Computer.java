package org.opentutorials.javatutorials.ch6;

/**
 * Created by Nekisse_lee on 2017. 5. 20..
 */
public class Computer {
    int sum1(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum;
}


int sum2(int ... values){
    int sum = 0;
    for (int i = 0; i <values.length; i++){
        sum += values[i];
    }
    return sum;
    }
}
