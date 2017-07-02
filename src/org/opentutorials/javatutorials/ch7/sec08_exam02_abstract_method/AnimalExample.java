package org.opentutorials.javatutorials.ch7.sec08_exam02_abstract_method;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish =new Fish();

        System.out.println(fish.kind);
        System.out.println(cat.kind);
        System.out.println(dog.kind);

        System.out.println("---------------");
        dog.sound();
        cat.sound();
        System.out.println("---------------");

        Animal animal = null;
        animal = new Dog();     //자동형변환  오버라이드된 메소드 멍멍
        animal.sound();


        animal = new Cat();  //자동형변환  오버라이드된 메소드 야옹
        animal.sound();
        System.out.println("-------------------");
        animalSound(new Dog());
        animalSound(new Cat());
    }
    public static void animalSound(Animal animal){
        animal.sound();
    }



}
