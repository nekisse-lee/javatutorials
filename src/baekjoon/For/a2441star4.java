package baekjoon.For;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 6..
 */
public class a2441star4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  5; //scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
