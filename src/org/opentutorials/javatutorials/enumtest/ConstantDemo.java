package org.opentutorials.javatutorials.enumtest;

import java.util.Scanner;

/**
 * Created by Nekisse_lee on 2017. 7. 15..
 */
public class ConstantDemo {
    public static void main(String[] args) {
       Fruit fruit;
       Company company;

        fruit = Fruit.APPLE;
       switch (fruit) {
           case APPLE:
               System.out.println("사과 " + Fruit.APPLE.getColor());
               break;
           case PEACH:
               System.out.println("복숙아 " + Fruit.PEACH.getColor());
               break;
           case BANANA:
               System.out.println("바나나 " + Fruit.BANANA.getColor()) ;
               break;
       }

       for(Fruit f : Fruit.values()){
           System.out.println(f);
       }

    }



}
