package javatutorials.ch3.sec04.exam02_string_concat;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class StringConcatExample {
    public static void main(String[] args) {

        String str1 = "JDK" + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3  = "JDK" + 3 + 3.0;
        String str4 = 3+3.0+"JDK";
        System.out.println(str3);
        System.out.println(str4);
    }
}
