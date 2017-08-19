package javatutorials.ch3.sec04.exam03_compare;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "신용권";
        String strVar2 = "신용권";
        String strVar3 = new String("신용권");

        System.out.println(strVar1==strVar2);
        System.out.println(strVar1==strVar3);
        System.out.println();
        System.out.println(strVar1.equals(strVar2));
        System.out.println(strVar1.equals(strVar3));

    }
}
