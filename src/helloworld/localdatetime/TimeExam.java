package helloworld.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Created by Nekisse_lee on 2017. 7. 27..
 */
public class TimeExam {
    public static void main(String[] args) {

        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint);
        System.out.println(timePoint.getMonth());
        LocalDate ld1= LocalDate.of(2012, Month.DECEMBER, 12);
        System.out.println(ld1 );

        LocalTime lt1 = LocalTime.of(17,18);
        System.out.println(lt1);
        LocalTime lt2 = LocalTime.parse("10:15:30");
        System.out.println(lt2);

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate);
        Month month = timePoint.getMonth();
        System.out.println(timePoint.getMonth());

        System.out.println(month.getValue());
        System.out.println(timePoint.getHour());

    }
}
