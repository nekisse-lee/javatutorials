package javatutorials.ch9.sec05.exam02_anonymous_implements;

/**
 * Created by Nekisse_lee on 2017. 6. 18..
 */
public class AnonymousExample {
    public static void main(String[] args) {
       Anonymous anoy = new Anonymous();

       anoy.field.turnOn();
       anoy.field.turnOff();

       anoy.method1();

       anoy.method2(new RemoteControl() {
           @Override
           public void turnOn() {
               System.out.println("SmartTV 를 켭니다.");
           }

           @Override
           public void turnOff() {
               System.out.println("SmartTV 를 켭니다.");
           }
       });
    }

}
