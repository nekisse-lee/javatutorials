package org.opentutorials.javatutorials.ch11.sec16_time.exam01_time;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DateTimeOperationExample {
    public static void main(String[] args){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 시: " + now);

        LocalDateTime targetDateTeim = now
                .plusYears(1)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4)
                .minusMinutes(5)
                .minusSeconds(6);



        System.out.println("연산 후: " + targetDateTeim);



    }
}
