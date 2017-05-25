package org.opentutorials.javatutorials.ch7.sec08;

/**
 * Created by Nekisse_lee on 2017. 5. 24..
 */
public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        //변수의 자동타입변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");


        // 메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());

    }

    public static void animalSound(Animal animal){
        animal.sound();

    }
}
