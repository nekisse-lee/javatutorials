package org.opentutorials.javatutorials.ch6Class.sec07.exam03_contructor_overloading;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

     Car(){}
    Car(String model){
         this.model = model;
    }

    Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
