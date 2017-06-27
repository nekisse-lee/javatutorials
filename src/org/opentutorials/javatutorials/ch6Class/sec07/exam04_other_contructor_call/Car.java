package org.opentutorials.javatutorials.ch6Class.sec07.exam04_other_contructor_call;

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
/*
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
*/
        this(model, null, 0);
        System.out.println("Car(String model) 실행");   // this()위에는 컴파일에러
    }

    Car(String model, String color){
/*        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;*/
        this(model, color , 0);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
