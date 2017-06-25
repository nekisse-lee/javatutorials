package org.opentutorials.javatutorials.ch4.sec03.exam01_for;

/**
 * Created by Nekisse_lee on 2017. 6. 23..
 */
public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int m = 2; m <= 9; m++){
            System.out.println("*****" + m + "단 *****");
            for (int n = 1; n <= 9; n++) {
                System.out.println(m + " x " + n + " = "  +  (m*n) );
            }
        }

    }
}
