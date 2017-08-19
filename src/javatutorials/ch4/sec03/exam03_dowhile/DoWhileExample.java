package javatutorials.ch4.sec03.exam03_dowhile;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 6. 25..
 */
public class DoWhileExample {
    public static void main(String[] args){


        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String inputString;


        int i = 0;

        do {
            System.out.print(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        }while (!inputString.equals("q"));

        System.out.println();

        System.out.println("프로그램 종료");

    }

}
