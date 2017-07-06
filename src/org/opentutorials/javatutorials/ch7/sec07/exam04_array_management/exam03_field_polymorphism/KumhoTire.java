package org.opentutorials.javatutorials.ch7.sec07.exam04_array_management.exam03_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class KumhoTire extends Tire {

    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation< maxRotation){
            System.out.println(location + " KumhoTire 수명 " + (maxRotation-accumulatedRotation));
            return true;
        }else{
            System.out.println("**** " + location + " KumhoTire  펑크 ***");
            return false;
        }
    }
}
