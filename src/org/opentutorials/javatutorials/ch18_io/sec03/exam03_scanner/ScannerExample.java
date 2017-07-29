package org.opentutorials.javatutorials.ch18_io.sec03.exam03_scanner;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class ScannerExample {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력: ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);
        System.out.println();

        System.out.print("정수 입력: ");
        int inputInt = scanner.nextInt();
        System.out.println(inputInt);
        System.out.println();

        System.out.print("실수 입력: ");
        double doubleInt = scanner.nextDouble();
        System.out.println(doubleInt);
        System.out.println();




    }

}
