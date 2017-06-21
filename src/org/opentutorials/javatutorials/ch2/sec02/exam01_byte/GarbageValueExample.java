package org.opentutorials.javatutorials.ch2.sec02.exam01_byte;

/**
 * Created by Nekisse_lee on 2017. 6. 20..
 */
public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;

        int var2= 125;

        for(int i=0; i<5; i++){
            var1++;
            var2++;
            System.out.println("var1 : " + var1 + "\t" + "var2 : "+ var2);
        }
    }
}
