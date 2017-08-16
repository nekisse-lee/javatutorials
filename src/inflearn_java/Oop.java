package inflearn_java;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 15..
 */
public class Oop {
    Scanner scanner = new Scanner(System.in);

    int i = scanner.nextInt();

    public void method(){
        int i = scanner.nextInt();
        for (int j = 1; j <= 9; j++) {
            System.out.println(i+"단: " + i + "x" + j + "=" + (i*j));
        }

    }
    public static void main(String[] args) {
        Oop oop = new Oop();
        oop.method();
    }

}
