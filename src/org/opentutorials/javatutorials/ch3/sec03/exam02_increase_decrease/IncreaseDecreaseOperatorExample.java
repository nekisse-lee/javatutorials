package org.opentutorials.javatutorials.ch3.sec03.exam02_increase_decrease;

/**
 * Created by Nekisse_lee on 2017. 6. 21..
 */
public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args){
        int x = 10;
        int y = 10;
        int z;
        System.out.println("----------------");
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("----------------");

        y--;
        --y;
        System.out.println("y= " + y);

        System.out.println("----------------");
        z = x++;
        System.out.println("z= " + z);
        System.out.println("x=" + x);


        System.out.println("----------------");
        z = ++x;
        System.out.println("z= " + z);
        System.out.println("x=" + x);

        System.out.println("----------------");
        z = ++x + y++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("y= " + y);

    }
}
