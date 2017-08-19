package javatutorials.ch2.sec03.exam01_promotion;

/**
 * Created by Nekisse_lee on 2017. 6. 21..
 */
public class PromotionExample {
    public static void main(String[] args){
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);


        char charValue='가';
        intValue = charValue;

        System.out.println(intValue);

        intValue = 500;
        long longValue = intValue;
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;
        System.out.println(doubleValue);

        longValue = 10000000000L;
        float floatValue = longValue;
        System.out.println(floatValue);

    }
}
