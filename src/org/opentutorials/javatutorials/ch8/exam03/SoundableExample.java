package org.opentutorials.javatutorials.ch8.exam03;

/**
 * Created by Nekisse_lee on 2017. 5. 26..
 */
public class SoundableExample {
     private static void printSound(Soundable soundable){
         System.out.println(soundable.sound());
     }


    public static void main(String[] args) {
            printSound(new Cat());
            printSound(new Dog());
    }
}
