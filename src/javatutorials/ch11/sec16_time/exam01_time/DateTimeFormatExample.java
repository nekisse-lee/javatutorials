package javatutorials.ch11.sec16_time.exam01_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DateTimeFormatExample {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        String nowString = now.format(dateTimeFormatter);

        System.out.println(nowString);




    }
}
