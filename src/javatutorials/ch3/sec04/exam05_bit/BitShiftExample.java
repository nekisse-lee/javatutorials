package javatutorials.ch3.sec04.exam05_bit;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class BitShiftExample {
    public static void main(String[] args){
        System.out.println("1 << 3 = " + (1<<3));
        System.out.println("-8 >> 3 = " + (-8>>3));
        System.out.println("-8 >>> 3 = " + (-8>>>3));

        System.out.println(toBinaryString(-8));
        System.out.println(">> 3 = " );
        System.out.println(toBinaryString(-8>>3));
        System.out.println();

        System.out.println(toBinaryString(-8));
        System.out.println(">>> 3 = " );
        System.out.println(toBinaryString(-8>>>3));
        System.out.println();

    }


    public static String toBinaryString(int value){
        String str = Integer.toBinaryString(value);
        while (str.length() < 32  ){
            str = "0" + str;
        }
        return str;
    }
}
