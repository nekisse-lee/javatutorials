package org.opentutorials.javatutorials.ch11.sec04_Objects.exam01_objects;

import java.util.Objects;

/**
 * Created by Nekisse_lee on 2017. 6. 30..
 */
public class NullExample {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;

        System.out.println(Objects.requireNonNull(str1));

        try{
            System.out.println(Objects.requireNonNull(str2));

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------");


        try{
            System.out.println(Objects.requireNonNull(str2, "이름이 없습니다"));

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("================================");


        try{
            System.out.println(Objects.requireNonNull(str2,()-> "이름이 없습니다"));

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }


        System.out.println("---------------------");

        System.out.println(Objects.isNull(str1));
        System.out.println(Objects.isNull(str2));

        System.out.println("---------------------");

        System.out.println(Objects.nonNull(str1));
        System.out.println(Objects.nonNull(str2));


    }
}
