package baekjoon.For;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a2439star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (1<=n && n<=100){
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
                }
            for (int k = 1; k <=i ; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
}
