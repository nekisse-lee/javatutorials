package baekjoon.For;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a2742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N<=100000){
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
          }
        }
    }
}
