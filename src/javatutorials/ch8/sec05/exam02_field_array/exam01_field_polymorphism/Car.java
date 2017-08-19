package javatutorials.ch8.sec05.exam02_field_array.exam01_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Car {
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };


    void run(){
       for (Tire tire : tires){
           tire.roll();
       }
    }
}


