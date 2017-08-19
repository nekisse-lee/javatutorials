package javatutorials.ch14_Lambda_Expression.sec05_runnable.exam03_supplier;

import java.util.function.IntSupplier;

/**
 * Created by Nekisse_lee on 2017. 7. 14..
 */
public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = ()->{
            int num = (int)(Math.random()*6)+1;
            return num;
        };
        int num = intSupplier.getAsInt();
        System.out.println("눈의 수: " + num);
    }
}
