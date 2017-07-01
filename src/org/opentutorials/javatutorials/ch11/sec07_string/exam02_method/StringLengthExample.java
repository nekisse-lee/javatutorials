package org.opentutorials.javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "7306241230123";

        System.out.println(ssn.length());
        int length = ssn.length();
        if (length!=13){
            System.out.println("주민번호 자리수가 맞습니다.");

        }else{
            System.out.println("주민번호 자리수가 틀립니다.");

        }

    }
}
