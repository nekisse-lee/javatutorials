package org.opentutorials.javatutorials.ch4.sec03.verify.exam07;

import org.opentutorials.javatutorials.loop.WhileDemo;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;
        while (run){
            System.out.println("-----------------------");
            System.out.println("1.예금|2.출금|3.잔고|4.종료");
            System.out.println("-----------------------");
            System.out.print("선택>");

         int  menuNum = scanner.nextInt();
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
            }

            System.out.println();
        }
        System.out.println("종료되었습니다.");


    }
}
