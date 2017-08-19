package javatutorials.ch11.sec12_wrapper.exam01_wrapper;

/**
 * Created by Nekisse_lee on 2017. 7. 11..
 */
public class StringToPrimitveValueExample {
    public static void main(String[] args){
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("ture");
        System.out.println("value1 : " + value1);
        System.out.println("value2 : " + value2);
        System.out.println("value3 : " + value3);
    }
}
