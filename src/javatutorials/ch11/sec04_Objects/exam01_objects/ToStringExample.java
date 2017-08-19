package javatutorials.ch11.sec04_Objects.exam01_objects;

import java.util.Objects;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class ToStringExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;


        System.out.println(Objects.toString(str1));
        System.out.println(Objects.toString(str2));

        System.out.println("---------------------");

        System.out.println(Objects.toString(str2,"이름이 없습니다."));


    }
}
