package baekjoon.For;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a2379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (1<=N && N<=9){
            for (int i = 1; i <=9 ; i++){
               int result = N*i;
                System.out.println(N + "*" + i + "=" + result);
                                    //  System.out.printf("%d * %d = %d\n", dan, i, dan*i);
            }
        }
    }
}
