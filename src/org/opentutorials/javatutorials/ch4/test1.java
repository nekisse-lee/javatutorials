package org.opentutorials.javatutorials.ch4;

/**
 * Created by Nekisse_lee on 2017. 5. 17..
 */
public class test1 {
    public static void main(String[] args) {
        int sum= 0;

        for(int i = 1; i <= 100; i++){
            if(i%3 == 0){
                sum+=i;

            }

            System.out.println("3의 배수의 합: " + sum);

        }


    }
}
