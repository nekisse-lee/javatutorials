package org.opentutorials.javatutorials.ch4.verify.exam07;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 8..
 */
public class Exercise07 {
    public static void main(String[] args) {
        int sum = 0;
        boolean run = true;
        Scanner scanner = new Scanner(System.in);


        while (run){
            System.out.println("1. 예금  2. 출금 3. 잔고 4.종료");
            System.out.print("선택> ");
           int select =  scanner.nextInt();
            switch (select){
                case 1:
                    System.out.print("예금액> ");
                    int a = scanner.nextInt();
                    sum += a;
                    System.out.println(a + "을 입금");
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int b = scanner.nextInt();
                    sum -= b;
                    System.out.println(b + "을 출금");
                    break;
                case 3:
                    System.out.println("현재잔고 : " + sum);
                    break;
                case 4:

                    run = false;
            }
            System.out.println("종료합니다");
        }
    }
}
