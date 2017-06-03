package org.opentutorials.javatutorials.ch6.sec07;

/**
 * Created by Nekisse_lee on 2017. 6. 2..
 */
public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println("c1 :" + c1.company);

        System.out.println();

        Car c2 = new Car("자가용");
        System.out.println("c2 :"+ c2.company);
        System.out.println("c2 :"+ c2.model);

        System.out.println();

        Car c3 = new Car("자가용", "빨강");
        System.out.println("c3 :"+ c3.company);
        System.out.println("c3 :"+ c3.model);
        System.out.println("c3 :"+ c3.color);

        System.out.println();

        Car c4 = new Car("택시", "검정", 200);
        System.out.println("c4 :"+ c4.company);
        System.out.println("c4 :"+ c4.model);
        System.out.println("c4 :"+ c4.color);
        System.out.println("c4 :"+ c4.maxSpeed);
    }
}
