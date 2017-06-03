package org.opentutorials.javatutorials.ch6.sec07;

/**
 * Created by Nekisse_lee on 2017. 6. 2..
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
