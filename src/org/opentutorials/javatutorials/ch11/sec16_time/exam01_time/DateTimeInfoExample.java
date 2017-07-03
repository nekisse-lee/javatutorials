package org.opentutorials.javatutorials.ch11.sec16_time.exam01_time;

import java.time.*;

/**
 * Created by Nekisse_lee on 2017. 7. 3..
 */
public class DateTimeInfoExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String strDateTime = now.getYear() + "년 ";
        strDateTime += now.getMonthValue() + "월 ";
        strDateTime += now.getDayOfMonth() + "일 ";

        DayOfWeek dow = now.getDayOfWeek();
        if (dow == DayOfWeek.MONDAY){
            strDateTime+= "월요일 ";
        }else if(dow == DayOfWeek.TUESDAY){
            strDateTime+= "화요일 ";

        }
        strDateTime += now.getHour() + "시 ";
        strDateTime += now.getMinute() + "분 ";
        strDateTime += now.getSecond() + "초 ";
        strDateTime += now.getNano() + "나노초 ";



        System.out.println(strDateTime);


        LocalDate nowDate = now.toLocalDate();
        if (nowDate.isLeapYear()){
            System.out.println("온해는 윤년: 2월은 29일까지 있습니다.\n");
        }else{
            System.out.println("온해는 평년: 2월은 28일까지 있습니다.\n");

        }

        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정 세계시 : " + utcDateTime);

        ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("서울 타임존 : " + seoulDateTime);

        ZoneId seoulZoneId = seoulDateTime.getZone();
        System.out.println("서울 존아이디 : " + seoulZoneId);

        ZoneOffset seoutZoneOffset = seoulDateTime.getOffset();
        System.out.println("서울 존오프셋 : " + seoutZoneOffset);




    }
}
