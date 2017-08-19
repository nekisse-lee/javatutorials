package javatutorials.ch7.sec07methodpolymorphism;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
            Vehicle vehicle = new Vehicle();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        driver.drive(bus);
        driver.drive(taxi);
        driver.drive(vehicle);
    }
}
