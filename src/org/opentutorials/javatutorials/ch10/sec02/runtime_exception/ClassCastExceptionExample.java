package org.opentutorials.javatutorials.ch10.sec02.runtime_exception;

import org.opentutorials.javatutorials.ch9.A;

/**
 * Created by Nekisse_lee on 2017. 6. 19..
 */
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);

    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else {
            System.out.println("Dog로 변환이 불가능합니다.");
        }

      }
    }


    class Animal {
    }

    class Dog extends Animal {
    }

    class Cat extends Animal {
    }





