package org.opentutorials.javatutorials.ch4;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 5. 17..
 */
public class test5 {
    public static void main(String[] args) {
               boolean run = true;
               int balance = 0;

               Scanner scanner = new Scanner(System.in);

                   while (run){
                       System.out.println("-----------------------------");
                       System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
                       System.out.println("-----------------------------");
                       System.out.print("선택> ");

                   int menuNum = scanner.nextInt();

                   switch (menuNum){
                       case 1:
                           System.out.print("예금액>");
                           balance += scanner.nextInt();
                           break;
                       case 2:
                           System.out.print("출금액>");
                           balance -= scanner.nextInt();
                           break;
                       case 3:
                           System.out.print("잔고>");
                           System.out.println(balance);
                           break;
                       case 4:
                           run = false;
                           break;
                       default:
                           System.out.println("1~4 의 기능만 선택가능합니다.");
                   }
                   System.out.println();

               }

        System.out.println("프로그램 종료");
    }
}
