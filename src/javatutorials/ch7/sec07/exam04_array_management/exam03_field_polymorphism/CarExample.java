package javatutorials.ch7.sec07.exam04_array_management.exam03_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class CarExample {
    public static void main(String[] args){
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();
            if (problemLocation!= 0){
                System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
                car.tires[problemLocation-1] = new HankookTire(car.tires[problemLocation-1].location, 15);
            }
            System.out.println("----------------------------------------");
        }

    }
}
