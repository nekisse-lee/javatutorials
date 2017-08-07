package baekjoon.If;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 6..
 */
public class if10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int D;
        if (a >= 1 && b >= 1 && c >= 1 && a <= 100 && b <= 100 && c <= 100) {
            if (a >= b && a >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}