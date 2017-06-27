package org.opentutorials.javatutorials.ch6Class.sec07.exam04_other_contructor_call;

/**
 * Created by Nekisse_lee on 2017. 6. 27..
 */
public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.company: " + car1.company);
        System.out.println("car1.model: " + car1.model);
        System.out.println("car1.color: " + car1.color);
        System.out.println("car1.maxSpeed: " + car1.maxSpeed);

        Car car2 = new Car("자가용");
        System.out.println("car2.model: " + car2.model);
        System.out.println("car2.company: " + car2.company);
        System.out.println("car2.color: " + car2.color);
        System.out.println("car2.maxSpeed: " + car2.maxSpeed);

        Car car3 = new Car("자가용", "빨강");
        System.out.println("car3.model: " + car3.model);
        System.out.println("car3.company: " + car3.company);
        System.out.println("car3.color: " + car3.color);
        System.out.println("car3.maxSpeed: " + car3.maxSpeed);

        Car car4 = new Car("자가용", "검정", 300 );
        System.out.println("car4.model: " + car4.model);
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.color: " + car4.color);
        System.out.println("car4.maxSpeed: " + car4.maxSpeed);



    }
}
