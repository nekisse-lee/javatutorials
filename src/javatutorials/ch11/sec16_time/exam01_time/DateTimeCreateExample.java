package javatutorials.ch11.sec16_time.exam01_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Created by Nekisse_lee on 2017. 7. 2..
 */
public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException {
        //날짜얻기
        LocalDate currDate =  LocalDate.now();
        System.out.println("현재 날짜 : " + currDate);


        LocalDate targetDate = LocalDate.of(2024,5,10);
        System.out.println("목표 날짜 : " + targetDate);

        //시간얻기
        LocalTime currTime = LocalTime.now();
        System.out.println("현재 날짜 : " + currTime);

        LocalTime targetTime = LocalTime.of(6,30,0,0);
        System.out.println("목표 날짜 : " + targetTime);


        //날짜와 시간 얻
        LocalDateTime currDateTime = LocalDateTime.now();
        System.out.println("현재 날짜 : " + currDateTime);

        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("목표 날짜 : " + targetDateTime);

        //협정 세계시와 시간존(TimeZone)
        ZonedDateTime utcDateTimt = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정 세계시 : " + utcDateTimt);

        ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("뉴욕 시간존 :" + newyorkDateTime);

        // 시간존 출력
        /*String[] availableIDs = TimeZone.getAvailableIDs();
        for(String zoneId : availableIDs){
            System.out.println(zoneId);
        }*/

        //특정 시점의 타임스탬프 얻기
        Instant instant1 = Instant.now();
        Thread.sleep(10);
        Instant instant2 = Instant.now();

        if (instant1.isBefore(instant2)){
            System.out.println("instant1이 빠릅니다.");
        }else if(instant1.isAfter(instant2)){
            System.out.println("instant1이 늦습니다.");

        }else{
            System.out.println("동일한 시간입니다.");
        }

        System.out.println("차이(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
    }
}
