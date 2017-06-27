package org.opentutorials.javatutorials.ch6Class.sec08.exam01_method_declaration;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Computer {
     int sum1(int[] values){
        int sum = 0;
        for (int i = 0; i < values.length;  i++){
            sum += values[i];
        }
        return sum;
    }


    int sum2(int ... values){
        int sum = 0;
        for (int i = 0; i < values.length;  i++){
            sum += values[i];
        }
        return sum;
    }



    }



