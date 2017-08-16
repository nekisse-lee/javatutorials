package inflearn_java;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 15..
 */
public class CalEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();

            if (i % 3 == 0) {
                System.out.println(i + "는 3의 배수 입니다");
                break;
            } else {
                System.out.println("3의 배수가 아닙니다.");
                break;
            }
        }

    }
}
