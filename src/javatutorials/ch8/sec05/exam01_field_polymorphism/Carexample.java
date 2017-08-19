package javatutorials.ch8.sec05.exam01_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 14..
 */
public class Carexample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.run();

        mycar.fronLefeTire = new KumhoTire();

        mycar.fronRightTire = new KumhoTire();

        mycar.run();


    }
}
