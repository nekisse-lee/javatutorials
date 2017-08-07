package baekjoon;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 8. 5..
 */
public class a11718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        while(scanner.hasNextLine()){
                if (!(inputText.isEmpty()&&inputText.length()<100)){
                System.out.println(inputText);
            }

        }

    }
}
