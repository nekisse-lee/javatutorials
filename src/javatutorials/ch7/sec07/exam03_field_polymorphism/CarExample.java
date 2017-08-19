package javatutorials.ch7.sec07.exam03_field_polymorphism;

/**
 * Created by Nekisse_lee on 2017. 7. 5..
 */
public class CarExample {
    public static void main(String[] args){
        Car car = new Car();

        for (int i = 1; i <= 5; i++) {
            int problemLocation = car.run();
            switch (problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("앞왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 KumhoTire로 교체");
                    car.backLeftTire = new HankookTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 14);
                    break;
                case 4:
                    System.out.println("앞 왼쪽 KumhoTire로 교체");
                    car.backLeftTire = new HankookTire("뒤오른쪽", 17);
                    break;
            }
            System.out.println("----------------------------------------");
        }

    }
}
