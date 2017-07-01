package org.opentutorials.javatutorials.ch11.sec07_string.exam02_method;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);


        if (subject.indexOf("자바")!=-1 ){
            System.out.println("자바와 관련된 책이군요");
        }else{
            System.out.println("자바와 관련 없는 책이군요");
        }


    }
}
