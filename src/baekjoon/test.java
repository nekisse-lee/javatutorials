package baekjoon;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class test {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            if (i%3==0){
                System.out.println(i);
                sum += i;
                System.out.println();
            }
        }
    }
}
