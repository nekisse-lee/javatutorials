package org.opentutorials.javatutorials.ch11.sec16_time.exam01_time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DateTimeCompareExample {
    public static void main(String[] args) {
        LocalDateTime starDateTime = LocalDateTime.of(2023, 1, 1, 9, 0 ,0);
        System.out.println("시작 일: " + starDateTime );

        LocalDateTime endDateTime = LocalDateTime.of(2024, 3, 31, 18, 0, 0);
        System.out.println("종료 일: " + endDateTime +  "\n" );


        if (starDateTime.isBefore(endDateTime)){
            System.out.println("진행 중입니다" + "\n");
        }else if (starDateTime.isEqual(endDateTime)) {
            System.out.println("종료합니다." + "\n");
        }else if(starDateTime.isAfter(endDateTime)){
            System.out.println("종료했습니다." + "\n");
        }

        System.out.println("[종료까지 남은 시간 ]");
        long remainYear = starDateTime.until(endDateTime, ChronoUnit.YEARS);
        System.out.println("남은 해: " + remainYear);

        long remainMonth = starDateTime.until(endDateTime, ChronoUnit.MONTHS);
        System.out.println("남은 달: " + remainMonth);

        long remainDay = starDateTime.until(endDateTime, ChronoUnit.DAYS);
        System.out.println("남은 일: " + remainDay);

        long remainHour = starDateTime.until(endDateTime, ChronoUnit.HOURS);
        System.out.println("남은 시간: " + remainHour);

        long remainMinute = starDateTime.until(endDateTime, ChronoUnit.MINUTES);
        System.out.println("남은 분: " + remainMinute);

        long remainSecond = starDateTime.until(endDateTime, ChronoUnit.SECONDS);
        System.out.println("남은 초: " + remainSecond + "\n");


        remainDay = ChronoUnit.YEARS.between(starDateTime, endDateTime);
        System.out.println("남은 해: " + remainYear);
        remainMonth = ChronoUnit.MONTHS.between(starDateTime, endDateTime);
        System.out.println("남은 달: " + remainMonth);
        remainDay = ChronoUnit.DAYS.between(starDateTime, endDateTime);
        System.out.println("남은 일: " + remainDay + "\n");


        Period period = Period.between(starDateTime.toLocalDate() , endDateTime.toLocalDate());
        System.out.print("남은 기간: " + period.getYears() + "년 ");
        System.out.print( period.getMonths() + "달 ");
        System.out.println(period.getDays() + "일 \n");


        Duration duration = Duration.between(starDateTime.toLocalTime(), endDateTime.toLocalTime());
        System.out.println("남은 시간: " + duration.toHours());
        System.out.println("남은 분: " + duration.toMinutes());
        System.out.println("남은 초: " + duration.getSeconds());



    }
}
