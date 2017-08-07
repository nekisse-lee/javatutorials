package baekjoon;

import org.opentutorials.javatutorials.ch18_io.sec05.exam08_objectinputstream_objectoutputstream.Parent;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a10430 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        if (2 <= A && C <= 10000){
            System.out.println((A+B)%C);
            System.out.println((A%C + B%C)%C);
            System.out.println((A*B)%C);
            System.out.println((A%C * B%C)%C);
        }
    }
}
