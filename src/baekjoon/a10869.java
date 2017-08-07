package baekjoon;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (1<=A && B<=10000){
            System.out.println(A+B);
            System.out.println(A-B);
            System.out.println(A*B);
            System.out.println(A/B);
            System.out.println(A%B);

        }
    }
}
