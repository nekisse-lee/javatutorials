package project;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 3..
 */
public class test {
    public static void main(String[] args) {
        String name;
        int Math;
        String str;
        Scanner sc = new Scanner(System.in);

        System.out.print("이름?");
        name = sc.next(); //nextLine()은 한줄을 다읽어옴

        System.out.print("수학?");
        Math= sc.nextInt();
        sc.nextLine();
        System.out.println("내용>");
        str = sc.nextLine();
        System.out.println(name + ":" + Math + str);
    }
}
