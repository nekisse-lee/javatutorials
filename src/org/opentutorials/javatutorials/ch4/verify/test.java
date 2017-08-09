package org.opentutorials.javatutorials.ch4.verify;

import org.opentutorials.javatutorials.ch5.sec07.exam01_enum.Week;

/**
 * Created by Nekisse_lee on 2017. 8. 8..
 */
public class test {
    public static void main(String[] args) {
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);


        int ordinal = today.ordinal();
        System.out.println(ordinal);



            Week weekDay = Week.valueOf("SUNDAY");
            if (weekDay == Week.SATURDAY || weekDay == Week.SATURDAY) {
                System.out.println("주말이군요");
            } else {
                System.out.println("평일이군요");
            }

            Week[] days = Week.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
        }
    }

