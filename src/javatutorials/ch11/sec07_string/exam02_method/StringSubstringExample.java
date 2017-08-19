package javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

    }

}
