package org.opentutorials.javatutorials.ch11.sec16_time.exam01_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DateTimeParsingExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter;
        LocalDate localDate;

        localDate = LocalDate.parse("2024-05-21");
        System.out.println(localDate);


        formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        localDate = LocalDate.parse("2024-05-21",formatter);
        System.out.println(localDate);


        formatter =DateTimeFormatter.ofPattern("yyyy/MM/dd");
        localDate = LocalDate.parse("2024/05/21", formatter);
        System.out.println(localDate);

        formatter =DateTimeFormatter.ofPattern("yyyy.MM.dd");
        localDate = LocalDate.parse("2024.05.21", formatter);
        System.out.println(localDate);

    }
}
