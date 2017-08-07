package baekjoon;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        if (0<A&&B<10){
            System.out.println(A/B);
        }
    }
}
