package javatutorials.ch18_io.sec03.exam02_console;

import java.io.Console;

/**
 * Created by Nekisse_lee on 2017. 7. 28..
 */
public class ConsoleExample {
    public static void main(String[] args){
        Console console = System.console();

        System.out.print("아이디: " );
        String id = console.readLine();


        System.out.println("패스워드: ");
        char[] charPassword = console.readPassword();
        String strPassword = new String(charPassword);

        System.out.println("-----------------------");
        System.out.println(id);
        System.out.println(strPassword);

       //System.console();  은  터미널, 명령ㅍ롬프트에서만 사용가

    }
}
