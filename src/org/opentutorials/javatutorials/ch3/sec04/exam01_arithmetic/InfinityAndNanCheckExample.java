package org.opentutorials.javatutorials.ch3.sec04.exam01_arithmetic;

/**
 * Created by Nekisse_lee on 2017. 6. 22..
 */
public class InfinityAndNanCheckExample {
    public static void main(String[] args){
      /*  int x = 5;
        double y = 2.0;

        double z = x / y;
//        double z = 5 % y;
        System.out.println(Double.isInfinite(z));
//        System.out.println(Double.isNaN(z));

        System.out.println(z+2);

        If(Double.isInfinite(z)||Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z+2);
        }*/

      int x = 5;
      int y = 0;

        try {
            int z = x / y;
            //int z = x % y;
            System.out.println("z= " + z);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }



    }
}
