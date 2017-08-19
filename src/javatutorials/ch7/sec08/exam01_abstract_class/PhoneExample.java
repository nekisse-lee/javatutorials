package javatutorials.ch7.sec08.exam01_abstract_class;

/**
 * Created by Nekisse_lee on 2017. 6. 12..
 */
public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }

}
