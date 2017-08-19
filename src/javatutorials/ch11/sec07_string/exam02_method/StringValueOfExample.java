package javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class StringValueOfExample {
    public static void main(String[] args) {
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
