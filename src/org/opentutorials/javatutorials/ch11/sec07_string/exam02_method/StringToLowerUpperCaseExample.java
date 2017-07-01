package org.opentutorials.javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 7. 1..
 */
public class StringToLowerUpperCaseExample {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA PROGRAMMING";

        System.out.println(str1.equals(str2));

        String lowerStr = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        System.out.println(lowerStr.equals(lowerStr2));

        System.out.println(str1.equalsIgnoreCase(str2));
    }

}
